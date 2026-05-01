package app.auth.controller.home;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/home")
public class HomeController {

   @GetMapping
   public String homepage(){

       Authentication auth= SecurityContextHolder.getContext().getAuthentication();

       System.out.println(" = " + auth.getName() );

//       UserDetails userDetails = ((UserDetails)auth.getPrincipal());
//
//       System.out.println(" user name " + userDetails.getUsername());

       Collection<GrantedAuthority> authorities= (Collection<GrantedAuthority>) auth.getAuthorities();

       for  (GrantedAuthority authority : authorities)
       {
           System.out.println(" this is home page");
           System.out.println(authority.getAuthority());
       }

       return  " this is home page -> is authenticated > " + auth.isAuthenticated() + " > user > " +auth.getName() ;
   }

}
