package hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class GreetingController {
 @GetMapping("/greeting")
 public String greeting(@RequestParam(name="name", required=false, defaultValue="World")
String name, Model model) {
 model.addAttribute("name", name);
 return "greeting";
 //test
 }
<<<<<<< HEAD
}
=======
}
>>>>>>> be4dbe799f953f8f15f1e96d93dd7b37c93a047f
