package springmvc.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String homePage() {
		System.out.println("Going to Home view");
		return "home";
	}

	@RequestMapping(value="/search",method=RequestMethod.GET)
	public RedirectView search(@RequestParam("querybox") String query) {
		String url="https://www.google.com/search?q="+query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
}
