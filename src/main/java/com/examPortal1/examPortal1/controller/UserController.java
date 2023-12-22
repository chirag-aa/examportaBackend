package com.examPortal1.examPortal1.controller;

import com.examPortal1.examPortal1.Entity.Roles;
import com.examPortal1.examPortal1.Entity.userRoles;
import com.examPortal1.examPortal1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.examPortal1.examPortal1.Entity.User;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User u){
        if(u==null){
            return ResponseEntity.badRequest().body(null);
        }


        Set<userRoles> userRolesSet = new HashSet<>();
        userRoles userRoles = new userRoles();
        User u1;
        Roles roles = new Roles();

        if(u.getUserName().equals("chirag@12") && u.getUserName().equals("chirag")){
            roles.setRoleName("ADMIN");
            roles.setRoleId(23L);
        }

        else {
            roles.setRoleName("USER");
            roles.setRoleId(21L);
        }

        userRoles.setUser(u);
        userRoles.setRole(roles);
        userRolesSet.add(userRoles);

        try {
             u1 = userService.createUser(u,userRolesSet);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok().body(u1);
    }

    @DeleteMapping("/delete/{userName}")
    public ResponseEntity<Boolean> deleteUser(@PathVariable String userName) {
        boolean isUserDeleted = userService.deleteUser(userName);
        if(isUserDeleted==true){
            return ResponseEntity.ok().body(true);
        }
        return ResponseEntity.badRequest().body(false);
    }


}
