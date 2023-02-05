package com.example.TranslatorSoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TranslatorSoftwareApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(TranslatorSoftwareApplication.class, args);

		LinguController controller = run.getBean(LinguController.class);
		controller.mainLoop();
	}


}
