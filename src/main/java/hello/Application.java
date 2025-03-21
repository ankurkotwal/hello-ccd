package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

  @RequestMapping("/")
  public String index() {
    return 
      "<!DOCTYPE html>\n" +
      "<html>\n" +
      "  <head>\n" +
      "  </head>\n" +
      "  <body>\n" +
      "    <h1>Hello, Cloud Community Day!</h1>\n" +
      "  </body>\n" +
      "</html>\n"
    ;
  }

}

