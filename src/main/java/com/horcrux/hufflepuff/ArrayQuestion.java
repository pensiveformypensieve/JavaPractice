package com.horcrux.hufflepuff;

import java.util.*;

public class ArrayQuestion {
//  Sum the list and find min and max number;
//  Sort the list
//  Delete all even
//  remove duplicate data

  private List<Integer> numbers = Arrays.asList(1, 3, 45, 2, 48, 6, 34, 45, 65, 21, 34, 56, 2, 56, 98, 48);
  List<Integer> sortedList = new ArrayList<>(numbers);

  public Integer sumNmbers() {
    int sum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i);
    }
    return sum;
  }

  public Integer findMin() {
    this.sortNumbers();
    int minNumber = sortedList.get(0);
    return minNumber;
  }

  public Integer findMax() {
    this.sortNumbers();
    int maxNumber = Collections.max(sortedList);
    return maxNumber;
  }

  public List<Integer> sortNumbers() {
    Collections.sort(sortedList);
    return sortedList;
  }

  public List<Integer> deleteEvenNumbersFromList() {
    List<Integer> oddNumbers = new ArrayList<>();
    numbers.stream().forEach(n -> {
      if (n % 2 != 0) {
        oddNumbers.add(n);
      }
    });
    return oddNumbers;
  }

  public Set<Integer> removeDuplicatedData() {
    Set<Integer> numbersSet = new HashSet<Integer>(numbers);
    return numbersSet;
  }
}
