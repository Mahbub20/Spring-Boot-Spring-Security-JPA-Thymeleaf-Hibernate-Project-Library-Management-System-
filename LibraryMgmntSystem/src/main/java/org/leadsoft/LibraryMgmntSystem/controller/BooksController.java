package org.leadsoft.LibraryMgmntSystem.controller;

import java.util.List;

import org.leadsoft.LibraryMgmntSystem.models.Book;
import org.leadsoft.LibraryMgmntSystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BooksController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("app/books")
	public ModelAndView getAllBooksPage() {
		List<Book> bookslist = bookService.getAllBooks();
		ModelAndView mv = new ModelAndView("app/library/allBooks");
		mv.addObject("books", bookslist);
		return mv;
	}

}
