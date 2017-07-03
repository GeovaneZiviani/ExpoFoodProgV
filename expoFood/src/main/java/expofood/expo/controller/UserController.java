package expofood.expo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import expofood.expo.data.UserDAO;
import expofood.expo.data.EnderecoDAO;
import expofood.expo.entity.User;

@Controller
public class UserController {
	@Autowired
	private UserDAO dao;
	
	@Autowired
	private EnderecoDAO enDAO;
	
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("user", dao.findAll());
		System.out.println("Returning user:");
		return "views/UserView/user";
	}
	@RequestMapping("user/{id}")
	public String show(@PathVariable Long id, Model model) {
		model.addAttribute("user", dao.findOne(id));
		model.addAttribute("enderecos", enDAO.findAll());
		return "views/UserView/usershow";
	}

	@RequestMapping("user/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("user", dao.findOne(id));
		model.addAttribute("enderecos", enDAO.findAll());
		return "views/UserView/userform";
	}

	@RequestMapping("/user/new")
	public String create(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("enderecos", enDAO.findAll());
		return "views/UserView/userform";
	}

	@RequestMapping(value = "user", method = RequestMethod.POST)
	public String save(User user) {
		dao.save(user);
		return "redirect:/user/" + user.getId();
	}

	@RequestMapping("user/delete/{id}")
	public String delete(@PathVariable Long id) {
		dao.delete(id);
		return "redirect:/user";
	}
}
