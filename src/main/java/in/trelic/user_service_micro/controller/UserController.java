package in.trelic.user_service_micro.controller;

import in.trelic.user_service_micro.model.QuestionDto;
import in.trelic.user_service_micro.model.User;
import in.trelic.user_service_micro.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("users")
    public ResponseEntity<List<User>> getUsers() {
        return new ResponseEntity<>(this.userService.getUsers(), HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return new ResponseEntity<>(this.userService.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping("user/{userId}/quiz")
    public ResponseEntity<List<QuestionDto>> getQuizQuestions(@PathVariable String userId) {
        System.out.println(userId);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}
