package expofood.expo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import expofood.expo.data.GeneroDAO;
import expofood.expo.data.LivroDAO;
import expofood.expo.data.MangaDAO;
import expofood.expo.data.UserDAO;

@Controller
public class IndexController {

	@Autowired
	private GeneroDAO genroDao;
	@Autowired
	private LivroDAO LivroDao;
	@Autowired
	private MangaDAO MangaDAO;
	
	@Autowired
	private UserDAO userDao;

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("attr1", LivroDao.findAll());
		model.addAttribute("attr2", LivroDao.findAll());
		model.addAttribute("attr3", LivroDao.findAll());
		System.out.println("Returning attr1:");
		return "index";
	}

}
