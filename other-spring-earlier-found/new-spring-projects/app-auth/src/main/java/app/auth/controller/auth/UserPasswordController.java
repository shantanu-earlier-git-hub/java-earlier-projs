package app.auth.controller.auth;

import app.auth.resource.ApiResponse;
import app.auth.resource.AppError;
import app.auth.security.model.SecurityUser;
import app.auth.security.model.entities.Token;
import app.auth.security.model.entities.User;
import app.auth.security.service.TokenService;
import app.auth.security.service.UserService;
import app.auth.security.token.UserAuthToken;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class UserPasswordController {

    private final PasswordEncoder passwordEncoder;
    private final UserService userService;
    private final TokenService tokenService;

    //    private final OtpService otpService;
    //private final JavaMailSender emailSender;


    public UserPasswordController(PasswordEncoder passwordEncoder,
                                  UserService userService,
                                  TokenService tokenService
    ) {
        this.passwordEncoder = passwordEncoder;
        this.userService = userService;
        this.tokenService = tokenService;

    }

    @PostMapping("/new")
    public ResponseEntity<ApiResponse> addNew(@RequestBody User newUser) {

        System.out.println(" entering create new user controller");
        ApiResponse response = new ApiResponse();
        try {
            // create a new user
            User user = new User();
            user.setUsername(newUser.getUsername());
            user.setPassword(newUser.getPassword());
            user.setPassword(this.passwordEncoder.encode(user.getPassword()));
            user.setDisabled(0);
            user.setLocked(0);
            this.userService.createUser(new SecurityUser(user));

            response.setResponseData(user.getUsername());
            response.setMessage("USER_CREATED");
            response.setStatus(HttpStatus.OK.value());
            return ResponseEntity.ok(response);

        } catch (Exception e) {

            AppError error = new AppError();
            error.setMessage("API_ERROR");
            error.setErrorCode(500);

            response.setResponseData(error);
            response.setMessage("UNKNOWN_ERROR");
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());

            return ResponseEntity.internalServerError().body(response);
        }
    }

    @GetMapping("/login")
    @ResponseBody
    public ResponseEntity<ApiResponse> login() {

        System.out.println(" entering in login controller");
        ApiResponse response = new ApiResponse();
        UserAuthToken userAuthToken = (UserAuthToken)SecurityContextHolder.getContext().getAuthentication();
        SecurityUser securityUser = (SecurityUser) userAuthToken.getDetails();
        User user = securityUser.getUser();

        Token token = this.tokenService.getOrCreateToken(user.getUsername(), "");

        response.setStatus(200);
        response.setResponseData(user);
        response.setToken(token.getToken());
        System.out.println(" exiting from  login controller");

        return ResponseEntity.ok(response);
    }


    @PostMapping("/logout")
    @ResponseBody
    public ResponseEntity<ApiResponse> logout() {

        String tokenStr = "";
        ApiResponse response = new ApiResponse();
        response.setStatus(200);
        response.setResponseData(null);
        response.setToken(null);

        return ResponseEntity.ok(response);
    }


    @GetMapping("/all")
    @ResponseBody
    public List<User> findAll() {
         return null;
    }

    @PostMapping("/delete/{username}")
    public void deleteUser(@RequestBody String username) {
    }

    @GetMapping("/exists/{username}")
    public Boolean isUserExists(@RequestBody String username) {
        return false;
    }


    //    public void sendSimpleMessage(String username, String otp) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("shanjob09@gmail.com");
//        message.setTo("shanjob09@gmail.com");
//        message.setSubject("otp for " + username);
//        message.setText(" Otp generated  for user -> " + username + " is : " + otp);
//        this.emailSender.send(message);
//
//    }




    //            Otp otpObject = new Otp();
//
//            String otpStr = String.valueOf(new Random().nextInt(9999 + 4321));
//            LocalDateTime now = LocalDateTime.now().plusMinutes(1l);
//
//            otpObject.setUsername(username);
//            otpObject.setOtp(otpStr);
//            otpObject.setExpiration(now);
//            System.out.println("calling otp service");
//
//            this.otpService.saveOtp(otpObject);
//            sendSimpleMessage(username, otpStr);

}
