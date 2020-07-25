package com;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import java.lang.Math;

import javax.ws.rs.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CalculatorService {
	@CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/whoami", produces = "text/plain")
    @ApiOperation("Says whoami ")
    public String whoami() {
        String hostname = System.getenv().getOrDefault("HOSTNAME", "Unknown");
        return String.format("Hare Krishna! from %s", hostname);
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/add/{num1}/{num2}", produces = "text/plain")
    @ApiOperation("Adds two numbers passed as path parameters")
    public String add(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        //return String.format("%d + %d = %d", num1, num2, (num1 + num2));
    	return String.format("%d", (num1 + num2));
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/sub/{num1}/{num2}", produces = "text/plain")
    @ApiOperation("Subtracts two numbers passed as path parameters")
    public String sub(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        //return String.format("%d - %d = %d", num1, num2, (num1 - num2));
    	return String.format("%d", (num1 - num2));
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/mul/{num1}/{num2}", produces = "text/plain")
    @ApiOperation("Multiplies two numbers passed as path parameters")
    public String mul(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        //return String.format("%d x %d = %d", num1, num2, (num1 * num2));
    	return String.format("%d", (num1 * num2));
    }

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/div/{num1}/{num2}", produces = "text/plain")
    @ApiOperation("Divides two numbers passed as path parameters")
    public String div(@PathVariable("num1") Integer num1, @PathVariable("num2") Integer num2) {
        //return String.format("%d / %d = %d", num1, num2, (num1 / num2));
    	return String.format("%d",(num1 / num2));
    }	
    
    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/sqr/{num1}", produces = "text/plain")
    @ApiOperation("Squares a number")
    public String sqr(@PathVariable("num1") Integer num1) {
    	return String.format("%d",(num1 * num1));
    }
    	
}
