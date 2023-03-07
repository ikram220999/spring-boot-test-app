package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }

	@GetMapping("/kambing")
    public String kambing(@RequestParam(value = "name2", defaultValue = "kambing") String name) {
      return String.format("Helloasdas %s!", name);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }

	@GetMapping("/testing")
    public String testing(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }

	@GetMapping("/testing2")
    public String testing2(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("anak kambing");
    }
}
