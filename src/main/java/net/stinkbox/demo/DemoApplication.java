package net.stinkbox.demo;

import net.stinkbox.demo.repos.UserRepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

	@GetMapping("/")
	public String Hello() {
		return "Hello, World";
	}

	// @GetMapping("/users/{username}")
	// public int getUserByName(@PathVariable String username) {
	// 	return UserRepository.findByName(username);
	// }

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
