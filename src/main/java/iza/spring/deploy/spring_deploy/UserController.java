package iza.spring.deploy.spring_deploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @PostMapping
    public User save(@RequestBody User user){
        repository.save(user);
        return user;
    }

    @GetMapping
    public List<User> list(){
        return repository.findAll();
    }
}
