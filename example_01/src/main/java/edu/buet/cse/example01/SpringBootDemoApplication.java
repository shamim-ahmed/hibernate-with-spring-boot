package edu.buet.cse.example01;

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
    SearchManager searchManager = appContext.getBean(SearchManager.class);

    int[] values = {9, 5, 7, 1, 3};
    int n = 3;
    int index = searchManager.binarySearch(values, n);
    logger.info(String.format("The index for item %d in the sorted array is %d", n, index));
  }
}
