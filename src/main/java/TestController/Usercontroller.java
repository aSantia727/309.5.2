package TestController;

@RestController
public class Usercontroller {
   @PostMapping("/users")
   public void printData(@RequestBody User user) {
       System.out.println("Printing the user data:"+user);
   }}