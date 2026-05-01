package gitapi.app;

import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class GitApiProjApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitApiProjApplication.class, args);
    }
}


@Controller
@RequestMapping("/gpt")
@ResponseBody
class SomeController {

    private final ChatModel chatModel;

    public SomeController(ChatModel chatModel) {
        this.chatModel = chatModel;
    }

    @GetMapping("/")
    public String getResponse(@RequestBody String text) {
        ChatResponse response = chatModel.call(
                new Prompt(
                        text,
                        OpenAiChatOptions.builder()
                                .model("gpt-4o-mini")
                                .temperature(0.4)
                                .build()
                ));
        return response.toString();
    }
}
