import java.util.Random;
import java.util.*;
public class DriverSorts{
  public static void main(String[]args){

//test reverse sorted, already sorted, and random w/ duplicates!

    int[] bubble;   int[] selection;  int[] insertion;
    Random r1 = new Random(100);
    int[] t1 = new int[10];
    for(int i =  0; i < 10; i++){
      t1[i] = r1.nextInt() % 1000;
    }

    bubble = t1;  Sorts.bubbleSort(bubble);
    if (Arrays.toString(bubble).equals("[-870, -850, -796, -713, -466, -319, -224, 332, 577, 749]")) {
      System.out.println("bubbleSort test 1: SUCCESS");
    } else {
      System.out.println("bubbleSort test 1: FAIL");
    }
    selection = t1;  Sorts.selectionSort(selection);
    if (Arrays.toString(selection).equals("[-870, -850, -796, -713, -466, -319, -224, 332, 577, 749]")) {
      System.out.println("selectionSort test 1: SUCCESS");
    } else {
      System.out.println("selectionSort test 1: FAIL");
    }
    insertion = t1;  Sorts.insertionSort(insertion);
    if (Arrays.toString(insertion).equals("[-870, -850, -796, -713, -466, -319, -224, 332, 577, 749]")) {
      System.out.println("insertionSort test 1: SUCCESS");
    } else {
      System.out.println("insertionSort test 1: FAIL");
    }

    System.out.println();

    Random r2 = new Random(50);
    int[] t2 = new int[10];
    for(int i =  0; i < 10; i++){
      t2[i] = r2.nextInt() % 1000;
    }

    bubble = t2;  Sorts.bubbleSort(bubble);
    if (Arrays.toString(bubble).equals("[-909, -794, -520, -280, -271, -180, -64, -61, -24, 123]")) {
      System.out.println("bubbleSort test 2: SUCCESS");
    } else {
      System.out.println("bubbleSort test 2: FAIL");
    }
    selection = t2;  Sorts.selectionSort(selection);
    if (Arrays.toString(selection).equals("[-909, -794, -520, -280, -271, -180, -64, -61, -24, 123]")) {
      System.out.println("selectionSort test 2: SUCCESS");
    } else {
      System.out.println("selectionSort test 2: FAIL");
    }
    insertion = t2;  Sorts.insertionSort(insertion);
    if (Arrays.toString(insertion).equals("[-909, -794, -520, -280, -271, -180, -64, -61, -24, 123]")) {
      System.out.println("insertionSort test 2: SUCCESS");
    } else {
      System.out.println("insertionSort test 2: FAIL");
    }


    System.out.println();

    Random r3 = new Random();
    int[] t3 = new int[10];
    for(int i =  0; i < 10; i++){
      t3[i] = r3.nextInt() % 1000;
    }

    bubble = t3;  Sorts.bubbleSort(bubble);
    String meth1 = Arrays.toString(bubble);
    selection = t3;  Sorts.selectionSort(selection);
    String meth2 = Arrays.toString(selection);
    insertion = t3;  Sorts.insertionSort(insertion);
    String meth3 = Arrays.toString(insertion);
    Arrays.sort(t3);
    String finale = Arrays.toString(t3);

    if ( meth1.equals(finale) ) {
      System.out.println("bubbleSort test 3: SUCCESS");
    } else {
      System.out.println("bubbleSort test 3: FAIL");
    }
    if ( meth2.equals(finale) ) {
      System.out.println("selectionSort test 3: SUCCESS");
    } else {
      System.out.println("selectionSort test 3: FAIL");
    }
    if ( meth3.equals(finale) ) {
      System.out.println("insertionSort test 3: SUCCESS");
    } else {
      System.out.println("insertionSort test 3: FAIL");
    }


    System.out.println();

    int[] t4 = new int[0];
    int[] t5 = new int[]{ 1, 2, 3, 4, 5 };
    int[] t6 = new int[]{ 6, 5, 4, 3, 2, 1 };
    int[] t7 = new int[]{ 5, 1, 12, 5, 1, 1, 5, 1 };
    int[] t8 = new int[]{ 2, 3, 4, 5, 1 };
    if (true) { //bubble
      bubble = t4;  Sorts.bubbleSort(bubble);
      if (Arrays.toString(bubble).equals("[]")) {
        System.out.println("bubbleSort test 4: SUCCESS");
      } else {
        System.out.println("bubbleSort test 4: FAIL");
      }
      bubble = t5;  Sorts.bubbleSort(bubble);
      if (Arrays.toString(bubble).equals("[1, 2, 3, 4, 5]")) {
        System.out.println("bubbleSort test 5: SUCCESS");
      } else {
        System.out.println("bubbleSort test 5: FAIL");
      }
      bubble = t6;  Sorts.bubbleSort(bubble);
      if (Arrays.toString(bubble).equals("[1, 2, 3, 4, 5, 6]")) {
        System.out.println("bubbleSort test 6: SUCCESS");
      } else {
        System.out.println("bubbleSort test 6: FAIL");
      }
      bubble = t7;  Sorts.bubbleSort(bubble);
      if (Arrays.toString(bubble).equals("[1, 1, 1, 1, 5, 5, 5, 12]")) {
        System.out.println("bubbleSort test 7: SUCCESS");
      } else {
        System.out.println("bubbleSort test 7: FAIL");
      }
      bubble = t8;  Sorts.bubbleSort(bubble);
      if (Arrays.toString(bubble).equals("[1, 2, 3, 4, 5]")) {
        System.out.println("bubbleSort test 8: SUCCESS");
      } else {
        System.out.println("bubbleSort test 8: FAIL");
      }
    }
    System.out.println();
    if (true) { // selection
      selection = t4;  Sorts.selectionSort(selection);
      if (Arrays.toString(selection).equals("[]")) {
        System.out.println("selectionSort test 4: SUCCESS");
      } else {
        System.out.println("selectionSort test 4: FAIL");
      }
      selection = t5;  Sorts.selectionSort(selection);
      if (Arrays.toString(selection).equals("[1, 2, 3, 4, 5]")) {
        System.out.println("selectionSort test 5: SUCCESS");
      } else {
        System.out.println("selectionSort test 5: FAIL");
      }
      selection = t6;  Sorts.selectionSort(selection);
      if (Arrays.toString(selection).equals("[1, 2, 3, 4, 5, 6]")) {
        System.out.println("selectionSort test 6: SUCCESS");
      } else {
        System.out.println("selectionSort test 6: FAIL");
      }
      selection = t7;  Sorts.selectionSort(selection);
      if (Arrays.toString(selection).equals("[1, 1, 1, 1, 5, 5, 5, 12]")) {
        System.out.println("selectionSort test 7: SUCCESS");
      } else {
        System.out.println("selectionSort test 7: FAIL");
      }
      selection = t8;  Sorts.selectionSort(selection);
      if (Arrays.toString(selection).equals("[1, 2, 3, 4, 5]")) {
        System.out.println("selectionSort test 8: SUCCESS");
      } else {
        System.out.println("selectionSort test 8: FAIL");
      }
    }
    System.out.println();
    if (true) { // insertion
      insertion = t4;  Sorts.insertionSort(insertion);
      if (Arrays.toString(insertion).equals("[]")) {
        System.out.println("insertionSort test 4: SUCCESS");
      } else {
        System.out.println("insertionSort test 4: FAIL");
      }
      insertion = t5;  Sorts.insertionSort(insertion);
      if (Arrays.toString(insertion).equals("[1, 2, 3, 4, 5]")) {
        System.out.println("insertionSort test 5: SUCCESS");
      } else {
        System.out.println("insertionSort test 5: FAIL");
      }
      insertion = t6;  Sorts.insertionSort(insertion);
      if (Arrays.toString(insertion).equals("[1, 2, 3, 4, 5, 6]")) {
        System.out.println("insertionSort test 6: SUCCESS");
      } else {
        System.out.println("insertionSort test 6: FAIL");
      }
      insertion = t7;  Sorts.insertionSort(insertion);
      if (Arrays.toString(insertion).equals("[1, 1, 1, 1, 5, 5, 5, 12]")) {
        System.out.println("insertionSort test 7: SUCCESS");
      } else {
        System.out.println("insertionSort test 7: FAIL");
      }
      insertion = t8;  Sorts.insertionSort(insertion);
      if (Arrays.toString(insertion).equals("[1, 2, 3, 4, 5]")) {
        System.out.println("insertionSort test 8: SUCCESS");
      } else {
        System.out.println("insertionSort test 8: FAIL");
      }
    }




  }
}
