import org.springframework.web.bind.annotation.RestController

@RestController
class ThisWillActuallyRun{
    @GetMapping("/")
    String home(){
        return "Hello, World!"
//
//        This line is basically a demo line to show placing

    }
}