package com.portal.appusers.resources;

import com.portal.appusers.domain.User;
import com.portal.appusers.exception.ExceptionHandling;
import com.portal.appusers.exception.domain.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserResource extends ExceptionHandling {

    @GetMapping("home")
    public User showUser() throws UserNotFoundException {
        User user1 = new User();
        user1.setFirstName("ahmed");
        return user1 ;
    }

}
