package com.portal.appusers.resources;

import com.portal.appusers.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping("user")
    public User showUser(){
        User user1 = new User();
        user1.setFirstName("ahmed");
        return user1 ;
    }

}
