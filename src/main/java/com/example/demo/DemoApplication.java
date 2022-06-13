
package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.*;
              
@SpringBootApplication
@RestController
public class DemoApplication {
                
  @CrossOrigin(origins = "*")
  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
  @CrossOrigin(origins = "*")
  @RequestMapping(value = "/contact", headers = "Accept=application/json")
  public Map hello() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "Contact Info");
        map.put("phone", "+491794180299");
        map.put("email", "ibsazzadd@gmail.com");
        
        return map;
    }
                
}
            
            