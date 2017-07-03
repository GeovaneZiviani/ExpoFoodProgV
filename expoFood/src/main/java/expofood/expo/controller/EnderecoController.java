package expofood.expo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import expofood.expo.data.EnderecoDAO;

import expofood.expo.entity.Endereco;


@Controller
public class EnderecoController {
	@Autowired
	private EnderecoDAO dao;

	@RequestMapping(value = "/endereco", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("endereco", dao.findAll());
		System.out.println("Returning endereco:");
		return "views/enderecoView/endereco";
	}

	@RequestMapping("endereco/{id}")
	public String show(@PathVariable Long id, Model model) {
		model.addAttribute("endereco", dao.findOne(id));
		
		return "views/enderecoView/enderecoshow";
	}

	@RequestMapping("endereco/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("endereco", dao.findOne(id));
	
		return "views/enderecoView/enderecoform";
	}

	@RequestMapping("/endereco/new")
	public String create(Model model) {
		model.addAttribute("endereco", new Endereco());
	
		return "views/enderecoView/enderecoform";
	}

	@RequestMapping(value = "endereco", method = RequestMethod.POST)
	public String save(Endereco endereco) {
		dao.save(endereco);
		return "redirect:/endereco/" + endereco.getId();
	}

	@RequestMapping("endereco/delete/{id}")
	public String delete(@PathVariable Long id) {
		dao.delete(id);
		return "redirect:/endereco";
	}

}
