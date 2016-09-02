package test;

import org.springframework.web.bind.annotation.*;

@RestController  
@RequestMapping("/user")  
public class UserController {  
  
    @RequestMapping("/{id}")  
    public User view(@PathVariable("id") Long id) {  
        User user = new User();  
        user.setId(id);  
        user.setName("测试");  
        return user;  
    }

    @RequestMapping("/data")
    public User view2(@RequestParam("id") Long id) {  
        User user = new User();  
        user.setId(id);  
        user.setName("测试2222");  
        return user;  
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)   
    public User2 login( @RequestBody User2 user ) 
    {   
        return user; 
    }   
    
    //public static void main(String[] args) {  
    //    SpringApplication.run(UserController.class);  
    //}  
  
}  