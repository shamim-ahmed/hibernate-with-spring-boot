package edu.buet.cse.example01;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchManagerImpl implements SearchManager {
  private final Logger logger = LogManager.getLogger(getClass());

  @Autowired
  private SortAlgorithm sortAlgorithm;

  @Override
  public int binarySearch(int[] values, int key) {
    logger.info("The sort algorithm being used is " + sortAlgorithm);

    values = sortAlgorithm.sort(values);
    int index = Arrays.binarySearch(values, key);
    return index;
  }
}
