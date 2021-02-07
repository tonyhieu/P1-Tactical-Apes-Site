
/* Basic web site that loads pbl.html, added is route to /hello
 * From IntelliJ Tutorial - https://www.jetbrains.com/help/idea/your-first-spring-application.html
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication  // explained here - https://dzone.com/articles/the-springbootapplication-annotation-example-in-ja#
@RestController
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);   // Internal magic:
        // loads pbl.html page from static folder
        // run server on localhost:8080
    }

}