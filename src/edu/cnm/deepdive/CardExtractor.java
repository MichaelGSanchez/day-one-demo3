package edu.cnm.deepdive;

import java.util.Arrays;

public class CardExtractor {

  private static final int[] CARDS = {3, 10, 11, 2, 4, 5, 12, 13, 1, 9, 8, 7, 6};

 public static void main(String[] args) {
   int start = Integer.parseInt(args[0]);
   int end = Integer.parseInt(args[1]);
   System.out.println(start);
   System.out.println(end);
   System.out.println(Arrays.toString(extract(start, end)));
 }

 private static int[] extract (int start, int end) {
    int[] extracted = new int[end - start];
    for (int i = start; i < end; i += 1) {
      extracted[i - start] = CARDS [i];
    }
    return extracted;
 }
}
