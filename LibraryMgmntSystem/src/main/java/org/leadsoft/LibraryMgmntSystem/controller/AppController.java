package org.leadsoft.LibraryMgmntSystem.controller;

import java.util.List;

import org.leadsoft.LibraryMgmntSystem.models.Book;
import org.leadsoft.LibraryMgmntSystem.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	
	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/app")
	public ModelAndView getIndexPage() {
		
		return new ModelAndView("app/index");
	}
}
