package edu.buet.cse.example01;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

  @Override
  public int[] sort(int[] values) {
    // TODO implement Bubble sort algorithm
    Arrays.sort(values);
    
    return values;
  }
  
  @Override
  public String toString() {
    return getClass().getName();
  }
}
