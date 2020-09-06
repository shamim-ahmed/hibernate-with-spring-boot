package edu.buet.cse.example01;

import java.util.Arrays;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

  @Override
  public int[] sort(int[] values) {
    // TODO implement QuickSort algorithm
    Arrays.sort(values);

    return values;
  }

  @Override
  public String toString() {
    return getClass().getName();
  }
}
