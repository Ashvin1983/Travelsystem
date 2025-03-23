package com.YB.Travelsystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@ComponentScan({"com.YB.Travelsystem"})
public class TravelsystemApplication {
 
    public static void main(String[] args) { 
        SpringApplication.run(TravelsystemApplication.class, args);
    }
 
}
