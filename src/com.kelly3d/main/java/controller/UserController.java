package controller;

import lombok.extern.slf4j.Slf4j;
import entity.User;
import org.springframework.web.bind.annotation.*;
import repository.UserRepository;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping(value = "/")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        log.info("Getting all users");
        return userRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public Optional<User> getUser(@PathVariable String userId) {
        log.info("Getting user with ID: {}.", userId);
        return userRepository.findById(userId);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public User addNewUsers(@RequestBody User user) {
        log.info("Saving user");
        return userRepository.save(user);
    }

    @RequestMapping(value = "/settings/{userId}", method = RequestMethod.GET)
    public Object getAllUserSettings(@PathVariable String userId) {
        Optional<User> user = userRepository.findById(userId);
        return user;
    }

    @RequestMapping(value = "/settings/{userId}/{key}", method = RequestMethod.GET)
    public Object getUserSetting(@PathVariable String userId, @PathVariable String key) {

        Optional<User> user = userRepository.findById(userId);
        return user;
    }

    @RequestMapping(value = "/settings/{userId}/{key}/{value}", method = RequestMethod.GET)
    public Object addUserSetting(@PathVariable String userId, @PathVariable String key,
                                 @PathVariable String value) {
        Optional<User> user = userRepository.findById(userId);
        if(user.isPresent()) {
            user.get().getUserSettings().put(key, value);
            return "Key added";
        }
        return "User not found";
    }
}
