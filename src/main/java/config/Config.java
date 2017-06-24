package config;

import controller.HomeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Mateusz on 2017-06-24.
 */
@ComponentScan(basePackageClasses = HomeController.class)
@EnableAutoConfiguration
public class Config {

    public static void  main(String[] args){
        SpringApplication.run(Config.class);
    }
}
