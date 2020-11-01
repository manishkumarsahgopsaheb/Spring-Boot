package com.example.spring_boot_App_1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import javax.websocket.server.PathParam;
import java.util.Date;

@RestController
public class controller {

    @GetMapping("/getCurrentDate")
    public Date getDate(){
        return new Date();
    }
    @GetMapping("/search")
    public  String search(@RequestParam("q") String q)
    {
        SearchService searchService = new SearchService();
        return searchService.search(q);
    }

   @GetMapping("/balance/{id}")
   public  int getBalance(@PathVariable("id") String id)
   {
       System.out.println(id);
       return 0;
   }

   @PostMapping("/users")
   @ResponseStatus(HttpStatus.CREATED)
   public User saveAUser(@RequestBody User user)
   {
       System.out.println(user.getAge());
       return  user;
   }

   @PutMapping("/users")
    public  User updateAUser(@RequestBody User user)
   {
       System.out.println(user.getAge());
       return user;
   }
}