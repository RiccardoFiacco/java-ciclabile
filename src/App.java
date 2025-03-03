import java.util.Random;
import java.util.Scanner;

import exercise.iterable.IterableArray;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        
        System.out.println("inserisci lunghezza");
        int i =s.nextInt();
        int[] arr = new int[i];

        for (int j = 0; j < arr.length; j++) {
            arr[j] = r.nextInt(9999);
            System.err.println(arr[j]);
        }

        IterableArray arrIterable = new IterableArray(arr);

        
        int result = arrIterable.getNextElement();
        boolean res = arrIterable.hasOtherElement(); 
        System.err.println(result);
        System.err.println(res);
        int result1 = arrIterable.getNextElement();
        boolean res1 = arrIterable.hasOtherElement(); 
        System.err.println(result1);
        System.err.println(res1);
        arrIterable.addElement(45);
        System.out.println(arrIterable.toString());
        
        s.close();
    }
}
