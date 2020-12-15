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

//end of program
}
