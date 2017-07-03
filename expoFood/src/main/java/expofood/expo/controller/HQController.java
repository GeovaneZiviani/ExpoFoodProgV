package expofood.expo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import expofood.expo.data.HQDAO;
import expofood.expo.data.UserDAO;
import expofood.expo.entity.HQ;

@Controller
public class HQController {

	@Autowired
	private HQDAO dao;

	@Autowired
	private UserDAO userDAO;
		
	@RequestMapping(value = "/hq", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("hq", dao.findAll());
		model.addAttribute("users", userDAO.findAll());
		System.out.println("Returning hq:");
		return "views/hqView/hq";
	}

	@RequestMapping("hq/{id}")
	public String show(@PathVariable Long id, Model model) {
		model.addAttribute("hq", dao.findOne(id));
		model.addAttribute("users", userDAO.findAll());
		return "views/hqView/hqshow";
	}

	@RequestMapping("hq/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("hq", dao.findOne(id));
		model.addAttribute("users", userDAO.findAll());
		return "views/hqView/hqform";
	}

	@RequestMapping("/hq/new")
	public String create(Model model) {
		model.addAttribute("hq", new HQ ());
		model.addAttribute("users", userDAO.findAll());
		return "views/hqView/hqform";
	}

	@RequestMapping(value = "hq", method = RequestMethod.POST)
	public String save(HQ hq) {
		dao.save(hq);
		return "redirect:/hq/" + hq.getId();
	}

	@RequestMapping("hq/delete/{id}")
	public String delete(@PathVariable Long id) {
		dao.delete(id);
		return "redirect:/hq";
	}
}
