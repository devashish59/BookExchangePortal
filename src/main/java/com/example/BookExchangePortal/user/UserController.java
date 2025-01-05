package com.example.BookExchangePortal.user;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "user")
public class UserController {

    private final UserService userService;
    
    private Logger log;
    
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
        this.log = LogManager.getLogger();
    }

    /**
	 * Gets a List of all Users
	 *
	 * @return List of all users as List<User>
	 */
    @GetMapping(path = "/getAllUsers")
	public @ResponseBody ResponseEntity<List<User>> getUsers(){
		try {
            return new ResponseEntity<List<User>>(userService.getUsers(), HttpStatus.OK);
        }
        catch(Exception exception) {
            log.error("Unable to get response due to: " + exception.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
	}

    /**
	 * Adds a User object to the database
	 *
	 * @param user User object to be created
	 * @return ResponseEntity with created User
	 */
    @PostMapping(path = "/addUser")
    public ResponseEntity<User> registerNewUser(@RequestBody User user) {
        try {
            userService.addNewUser(user);
            return new ResponseEntity<User>(user, HttpStatus.CREATED);
        }
        catch(Exception exception) {
            log.error("Unable to get response due to: " + exception.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
	 * Deletes User identified by email of the User
	 *
	 * @param email of User object to be deleted
	 */
    @DeleteMapping(path = "/delete/{email}")
    public void deleteUserByEmail(@PathVariable("email") String email) {
        userService.deleteUser(email);
    }
}
