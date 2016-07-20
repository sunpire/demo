package sunpire.com.springbootdemo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import sunpire.com.springbootdemo.entity.User;
import sunpire.com.springbootdemo.product.IProduct;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IProduct product;
	
    @RequestMapping("/{id}")
    public User view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setName("zhang");
        return user;
    }
    
    @RequestMapping(value = "updateByName", method=RequestMethod.POST)   
    public User updateUserByName(@RequestBody  String name) {
    	User user = new User();
    	user.setId(123L);
        user.setName(name + " updated");
        return user;
    }
    
    /*
     * The request Content-type must be
     * Content-type: application/json
     */
    @RequestMapping(value = "update", method=RequestMethod.POST)   
    public User updateUser(@RequestBody  User user) {
        user.setName(user.getName() + " updated");
        return user;
    }
    
    @RequestMapping("/product/{modelNo}")
    public String createProduct(@PathVariable("modelNo") String modelNo) {
    	
        return product.getModelNo() + " " + modelNo;
    }

/** To run this main(), add
  @EnableAutoConfiguration
  @ComponentScan("sunpire.com.springbootfirst.*")
  to the class definition
*/

//    public static void main(String[] args) {
//    	SpringApplication.run(UserController.class);
//    }

}
