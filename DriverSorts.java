import java.util.Random;
import java.util.*;
public class DriverSorts{
  public static void main(String[]args){

    

    int[] bubble;
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

    System.out.println();

    Random r3 = new Random();
    int[] t3 = new int[10];
    for(int i =  0; i < 10; i++){
      t3[i] = r3.nextInt() % 1000;
    }
    bubble = t3;  Sorts.bubbleSort(bubble);
    String meth1 = Arrays.toString(bubble);
    // mimmy = t3;  Sorts.mimmySort(mimmy);
    // String meth2 = Arrays.toString(mimmy);
    Arrays.sort(t3);
    String finale = Arrays.toString(t3);
    if ( meth1.equals(finale) ) {
      System.out.println("bubbleSort test 3: SUCCESS");
    } else {
      System.out.println("bubbleSort test 3: FAIL");
    }




  }
}
