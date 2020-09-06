package edu.buet.cse.example02;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {
  private static final Logger logger = LogManager.getLogger(SpringBootDemoApplication.class);

  public static void main(String... args) {
    ApplicationContext appContext = SpringApplication.run(SpringBootDemoApplication.class);
    String[] beanNames = appContext.getBeanDefinitionNames();

    for (String name : beanNames) {
      logger.info("Bean name: " + name);
    }
  }
}
