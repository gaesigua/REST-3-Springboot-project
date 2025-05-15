package com.gasigwatin.REST_3_Springboot_project;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hallos")
    public String ersteController() {

        return "Hallo aus Erste Controller";
    }

    @GetMapping("/hallos2")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String zweiteController() {
        return "Hallo aus Zweite Controller";
    }

    @PostMapping("/post")
    public String dritteControllerPost(
            @RequestBody String message) {
        return "Die Anfordenrungsnachricht: " + message;
    }

    //HOW TO PPOST USING A POJO (Plain Old Java Object)
    @PostMapping("/post-order")
    public String postOrder(
            @RequestBody Order order) {
        return "The Post Order is: " + order.toString();
    }

    //HOW TO POST USING a RECORD (A record is not a POJO, and they are mostly used in newer versions of Java)
    @PostMapping("/post-orderrecord")
    public String postOrderRecord(
            @RequestBody OrderRecord order) {
        return "The Post Order Record is: " + order.toString();
    }

    //HOW TO PASS A PARAMETER TO A METHOD
       //here we are going to pass a parameter to a path
       //e.g: http:localhost:8081/hallos3/kabera

    @GetMapping("/hallos3/{user-name}")
    public String pathVariable(
            @PathVariable("user-name") String userName) {
        return "My Path Variable is: " + userName;
    }

    //HOW TO PASS A VARIABLE AS A REQUEST PARAMETER
       //e.g: http://localhost:8081/hallos4?param-name=paramvalue&param-name2=paramvalue2

    @GetMapping("/hallos4/")
    public String paramVariable(
            @RequestParam("first-name") String firstName, @RequestParam("last-name") String lastName) {
        return "My Request Param is: " + firstName + " " + lastName;
    }
}
