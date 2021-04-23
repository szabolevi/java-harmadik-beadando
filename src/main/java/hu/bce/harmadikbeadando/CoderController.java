package hu.bce.harmadikbeadando;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CoderController {

    @PostMapping("/reverse")
    public Coder postBody(@RequestBody(required = false) String requestData) {

        String defaultContent = "Alma a fa alatt";
        Coder coder = new Coder(defaultContent);

        if (requestData != null ) {
            coder.setContent(requestData);
        }

        coder.reverseContent();
        return coder;
    }
}