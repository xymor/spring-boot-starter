package springboot.junit5.sample;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/about",produces = MediaType.APPLICATION_JSON_VALUE)
	public String aboutMe() {
		return "JUnit 5 and Spring Boot Example.";
	}

}