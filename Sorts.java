import java.util.*;
public class Sorts {

  public static void bubbleSort(int[] data) {
    //if in the first pass no swaps are made call it early, you're done.
    int swaps = 0;
    int first, next;
    for (int j = data.length; j > 0; j--) {
      for (int i = 0; i < j - 1; i++) {
        first = data[i];
        next = data[i+1];
        if (first > next) {
          data[i+1] = first;
          data[i] = next;
          swaps ++;
        }
      }
      if (j == data.length && swaps == 0) j = 1;
    }
    ///end of method
  }

  public static void selectionSort(int[] data) {
    for (int i = 0; i < data.length; i++) {
      int min = data[i]; int minLoc = i;
      for (int j = i; j < data.length; j++) {
        if (data[j] < min) {
          min = data[j];  minLoc = j;
        }
      }
      int t = data[i];
      data[i] = min;
      data[minLoc] = t;
      //System.out.println(Arrays.toString(data));
    }
  }

  public static void insertionSort(int[] data) { //[]
    for (int i = 1; i < data.length; i++) {// i = , []
      int current = data[i];  Integer temp = null; //current =
      for (int j = 0; j <= i; j++) { // j =
        if (current < data[j] && temp == null) { //
          temp = data[j]; //temp =
          data[j] = current; //[]
        } else if (temp != null) { //j =                      .... j =
          int temptemp = data[j]; //tt =                      .... tt =
          data[j] = (int)temp; //[]                           .... []
          temp = temptemp; //temp =                           .... temp =
        }
        //if (j == i - 1 && current > data[j]) data[i] = current;
      }
      //System.out.println(Arrays.toString(data));
     }
   }






//end of program
}
