package org.leadsoft.LibraryMgmntSystem.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddNewBookController {
	
	@GetMapping("/admin/addBook")
	public ModelAndView addNewBook() {
		
		return new ModelAndView("/admin/library/addBooks");
	}

}
