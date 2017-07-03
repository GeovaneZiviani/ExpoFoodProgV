package expofood.expo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import expofood.expo.data.LivroDAO;
import expofood.expo.data.UserDAO;
import expofood.expo.entity.Livro;


@Controller
public class LivroControlller {
	
	@Autowired
	private LivroDAO dao;

	@Autowired
	private UserDAO userDAO;
	
	
		
	@RequestMapping(value = "/livro", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("livro", dao.findAll());
		model.addAttribute("users", userDAO.findAll());
		System.out.println("Returning livro:");
		return "views/LivroView/livro";
	}

	@RequestMapping("livro/{id}")
	public String show(@PathVariable Long id, Model model) {
		model.addAttribute("livro", dao.findOne(id));
		model.addAttribute("users", userDAO.findAll());
		return "views/LivroView/livroshow";
	}

	@RequestMapping("livro/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("livro", dao.findOne(id));
		model.addAttribute("users", userDAO.findAll());
		return "views/LivroView/livroform";
	}

	@RequestMapping("/livro/new")
	public String create(Model model) {
		model.addAttribute("livro", new Livro ());
		model.addAttribute("users", userDAO.findAll());
		return "views/livroView/livroform";
	}

	@RequestMapping(value = "livro", method = RequestMethod.POST)
	public String save(Livro livro) {
		dao.save(livro);
		return "redirect:/livro/" + livro.getId();
	}

	@RequestMapping("livro/delete/{id}")
	public String delete(@PathVariable Long id) {
		dao.delete(id);
		return "redirect:/livro";
	}

}
