// package com.example.demo;

// import java.util.concurrent.atomic.AtomicLong;

// import com.example.restservice.Greeting;

// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication
// @RestController
// public class DemoApplication {

//   public static void main(String[] args) {
//     SpringApplication.run(DemoApplication.class, args);
//   }

//   private static final String template = "Hello, %s!";
//   private final AtomicLong counter = new AtomicLong();

//   @GetMapping("/hello")
//   public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
//     return String.format("Hello %s!", name);
//   }

//   @GetMapping("/greeting")
// 	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//     System.out.println("Hello world!");
// 		return new Greeting(counter.incrementAndGet(), String.format(template, name));
// 	}
// }

