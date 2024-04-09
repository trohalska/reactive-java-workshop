package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3_GetValueFromFlux {

  public static void main(String[] args) throws IOException {

    // Use ReactiveSources.intNumbersFlux()

    // Get all numbers in the ReactiveSources.intNumbersFlux stream
    // into a List and print the list and its size
    List<Integer> num = ReactiveSources.intNumbersFlux()
        .log()
        .toStream().toList();
    System.out.println("List: " + num);
    System.out.println("Size: " + num.size());

    System.out.println("Press a key to end");
    System.in.read();
  }

}
