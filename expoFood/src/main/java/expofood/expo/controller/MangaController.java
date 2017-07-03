package expofood.expo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import expofood.expo.data.MangaDAO;
import expofood.expo.data.UserDAO;
import expofood.expo.entity.Manga;

@Controller
public class MangaController {
	@Autowired
	private MangaDAO dao;

	@Autowired
	private UserDAO userDAO;
	
	
		
	@RequestMapping(value = "/manga", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("manga", dao.findAll());
		model.addAttribute("users", userDAO.findAll());
		System.out.println("Returning manga:");
		return "views/MangaView/manga";
	}

	@RequestMapping("manga/{id}")
	public String show(@PathVariable Long id, Model model) {
		model.addAttribute("manga", dao.findOne(id));
		model.addAttribute("users", userDAO.findAll());
		return "views/MangaView/mangashow";
	}

	@RequestMapping("manga/edit/{id}")
	public String edit(@PathVariable Long id, Model model) {
		model.addAttribute("manga", dao.findOne(id));
		model.addAttribute("users", userDAO.findAll());
		return "views/MangaView/mangaform";
	}

	@RequestMapping("/manga/new")
	public String create(Model model) {
		model.addAttribute("manga", new Manga ());
		model.addAttribute("users", userDAO.findAll());
		return "views/MangaView/mangaform";
	}

	@RequestMapping(value = "manga", method = RequestMethod.POST)
	public String save(Manga manga) {
		dao.save(manga);
		return "redirect:/manga/" + manga.getId();
	}

	@RequestMapping("manga/delete/{id}")
	public String delete(@PathVariable Long id) {
		dao.delete(id);
		return "redirect:/manga";
	}
}
