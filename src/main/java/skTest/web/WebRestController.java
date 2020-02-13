package skTest.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
	
	@GetMapping("/hello")
	public String testHello() {
		return "안녕";
	}

}
