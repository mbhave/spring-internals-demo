package example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {

	private final HelloMessageProvider messageProvider;

	HelloController(HelloMessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	@GetMapping("/hello")
	public String hello() {
		return this.messageProvider.getMessage();
	}

}
