package fi.onnela.Bookstore.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {

	ArrayList<String> books = new ArrayList<String>();

	@GetMapping("index")
	public String handleBooks(@RequestParam(required = false) String bookTitle, Model model) {

		if (bookTitle != null) {
			books.add(bookTitle);
		}

		model.addAttribute("books", books);

		return "index";
	}
}
