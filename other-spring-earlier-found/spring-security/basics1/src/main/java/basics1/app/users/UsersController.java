package basics1.app.users;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
class UsersController {


    private List<UserEntity> usersList = new ArrayList<UserEntity>();

    @GetMapping
    @ResponseBody
    public HttpEntity<List<UserEntity>> home() {
        return ResponseEntity.ok(this.usersList);
    }


    @GetMapping("/check/{id}")
    @ResponseBody
    public HttpEntity<UserEntity> checkIt(@PathVariable("id") Integer id) throws Exception {
        var customer = this
                .usersList
                .stream()
                .filter((c) -> c.getId() == id)
                .findFirst().orElseGet(null);

        return ResponseEntity.ok(customer);
    }

    @Bean
    ApplicationListener<ApplicationReadyEvent> applicationReadyEventApplicationListener(UsersRepository usersRepository) {
        return event -> {
            var values = (Collection<UserEntity>) usersRepository.findAll();
            for (var value : values) {
                this.usersList.add(value);
            }
        };
    }


}
