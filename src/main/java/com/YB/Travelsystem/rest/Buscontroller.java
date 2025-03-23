package  com.YB.Travelsystem.rest;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import com.YB.Travelsystem.model.*;
import com.YB.Travelsystem.services.*;
import com.YB.Travelsystem.services.Imp.*;
 
 
 @RestController
 @RequestMapping("/api")
 @CrossOrigin(origins ="*")
 public class Buscontroller{
 
 
      @Autowired
      public BusService  busservice;
 
 
 
 
}
