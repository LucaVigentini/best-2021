package org.generation.italy.controller;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/")
	public String index(Model model) {

		model.addAttribute("name", "Luca");

		return "index";
	}

	@GetMapping("/songs")
	public String songs(Model model) {

		model.addAttribute("songs",
				Arrays.asList("Attention", "Bad Habits", "How Long", "Wild Blue", "good 4 U", "After All"));

		return "songs";
	}
	
	@GetMapping("/films")
	public String films(Model model) {
		
		model.addAttribute("films",
				Arrays.asList("Joker", "Il Lupo di WallStreet", "La Grande Scommessa", "Limitless"));

		return "films";
	}

}
