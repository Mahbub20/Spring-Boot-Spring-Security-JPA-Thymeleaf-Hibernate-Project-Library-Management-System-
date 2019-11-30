package org.leadsoft.LibraryMgmntSystem.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppAdminController {
	
	@GetMapping("/admin")
	public ModelAndView getAdminPage() {
		return new ModelAndView("/admin/index");
	}

}
