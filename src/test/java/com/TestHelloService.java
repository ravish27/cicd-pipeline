package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.HelloService;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestHelloService {
	@Test
	public void testMessage() {
		HelloService hs = new HelloService();
		System.out.println("hello");
		Assertions.assertEquals(hs.sayHello(), "hello");
	}
}
