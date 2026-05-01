package app.auth.controller.email;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("email")
public class EmailController {

    private final JavaMailSender emailSender;

    public EmailController(JavaMailSender emailSender){
        this.emailSender = emailSender;
    }

    @GetMapping("email/")
    @ResponseBody
    public String sendEmail(){
        sendSimpleMessage();
        return "send";
    }


    public void sendSimpleMessage() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("shanjob09@gmail.com");
        message.setTo("shanjob09@gmail.com");
        message.setSubject("no subject");
        message.setText("test text");
        emailSender.send(message);

    }

}
