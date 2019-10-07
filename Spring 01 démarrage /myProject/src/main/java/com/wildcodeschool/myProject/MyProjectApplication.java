package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyProjectApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "URLs list: <ul><li><a href='http://localhost:8080/Doctor/1'>Doctor 1</a><li><a href='http://localhost:8080/Doctor/2'>Doctor 2</a><li><a href='http://localhost:8080/Doctor/3'>Doctor 3</a><li><a href='http://localhost:8080/Doctor/4'>Doctor 4</a></ul>";
	}
	
	@RequestMapping("/Doctor/1")
    @ResponseBody
    public String doctor1() {

        return "William Hartnell";
	}
	
	@RequestMapping("/Doctor/2")
    @ResponseBody
    public String doctor2() {

        return "Patrick Troughton";
	}
	
	@RequestMapping("/Doctor/3")
    @ResponseBody
    public String doctor3() {

        return "Jon Pertwee";
	}
	
	@RequestMapping("/Doctor/4")
    @ResponseBody
    public String doctor4() {

        return "Tom Baker";
    }

}
