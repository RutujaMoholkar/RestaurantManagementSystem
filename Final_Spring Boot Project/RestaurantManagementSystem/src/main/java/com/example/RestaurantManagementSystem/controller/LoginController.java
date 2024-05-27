// package com.example.RestaurantManagementSystem.controller;


// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;


// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.RestaurantManagementSystem.model.LoginForm;
// import com.example.RestaurantManagementSystem.model.User;
// import com.example.RestaurantManagementSystem.repository.LoginRepository;
// import com.example.RestaurantManagementSystem.repository.UserRepository;
// import com.example.RestaurantManagementSystem.service.LoginService;

// @RestController
// @RequestMapping("/api/login")
// public class LoginController {

//     @Autowired
//     private LoginService loginService;
    
//     @Autowired
//     LoginRepository repo;

//     @Autowired
//     UserRepository regRepo;


//     @PostMapping("/addLogin")
//     public ResponseEntity<String> login(@RequestBody LoginForm loginForm) {
//         String email = loginForm.getEmail();
//         String password = loginForm.getPassword();

//         boolean isAuthenticated = loginService.authenticateUser(email, password);
//         if (isAuthenticated) {
//             return ResponseEntity.ok("Login successful!");
//         } else {
//             return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
//         }
//     }

//     @GetMapping("/getAll")
// 	public ResponseEntity<List<LoginForm>> getAllRecords() {
// 		List<LoginForm> login = repo.findAll();
// 		return new ResponseEntity<>(login, HttpStatus.OK);
// 	}

//     // this API is already present in registration controller so delete it form
// 	//  either of files.
// 	// @RequestMapping("/del/{email}")
// 	// public void deleteValue(@PathVariable String email) {
// 	// 	repo.deleteById(email);
// 	// }

//     @PutMapping("/setValue/{email}/{password}")
// 	public String updatePassword(@PathVariable String email, @PathVariable String password) {
// 		LoginForm login = repo.findByEmail(email);

// 		if (login != null) {
// 			login.setPassword(password);
// 			repo.save(login);
// 			return "Sucessfully done";
// 		} else {
// 			return "error";
// 		}
// 	}

//     @GetMapping("/checkCredentials")
// 	public ResponseEntity<Map<String, String>> checkCredentials(@RequestParam String name, @RequestParam String password) {
// 	    // Query the database to find a record with the provided email
// 	    Optional<User> userOptional = regRepo.findByEmail(name);
// 	    Map<String, String> response = new HashMap<>();

// 	    // Check if a user with the provided email exists
// 	    if (userOptional.isPresent()) {
// 	        User user = userOptional.get();
// 	        // Compare the password provided by the user with the password stored in the database
// 	        if (user.getPassword().equals(password)) {
// 	            // Passwords match, return a success response
// 	            response.put("message", "Login successful!");
// 	            return new ResponseEntity<>(response, HttpStatus.OK);
// 	        } else {
// 	            // Passwords do not match, return an error response
// 	            response.put("error", "Invalid password");
// 	            return new ResponseEntity<>(response, HttpStatus.UNAUTHORIZED);
// 	        }
// 	    } else {
// 	        // No user found with the provided email, return an error response
// 	        response.put("error", "User not found");
// 	        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
// 	    }
// 	}

    
	

	
    



  
	









	
	





	

	




// }

    
    
    

	
	
	








