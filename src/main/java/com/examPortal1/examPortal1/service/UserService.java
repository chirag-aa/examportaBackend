package com.examPortal1.examPortal1.service;
import com.examPortal1.examPortal1.Entity.*;
import com.examPortal1.examPortal1.repo.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examPortal1.examPortal1.repo.userRepo;
import java.util.*;

@Service
public class UserService {

    @Autowired
    private userRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;
    public User createUser(User u,Set<userRoles>userRolesSet) throws Exception {

           User user= userRepo.findByuserName(u.getUserName());

           if(user!=null) {
               throw new Exception("User Already Present Please Login");
           }
           else {
              for(userRoles userRole : userRolesSet){
                   roleRepo.save(userRole.getRole());
              }
              u.getUserRoles().addAll(userRolesSet);
               user= userRepo.save(u);
           }
        return user;
    }

    public boolean deleteUser(String userName){
        if(userName.length()<=0){
            return false;
        }
        User u = userRepo.findByuserName(userName);
        if(u==null){
            return false;
        }
        userRepo.delete(u);
        return true;
    }
}
