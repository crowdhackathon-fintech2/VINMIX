package com.nbg.hackfin;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.nbg.fintech.HackFinApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = HackFinApplication.class)
@SpringBootTest
public class HackfinApplicationTests {

	@Test
	public void contextLoads() {
	}

}
