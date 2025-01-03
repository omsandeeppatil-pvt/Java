import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(Model model) {
        // Adding data to the model
        model.addAttribute("message", "Welcome to Spring MVC!");
        return "hello"; // Returns the "hello.jsp" view
    }
}
