import java.util.HashMap;
import java.util.Random;

public class Main {
    public static void main(String[]args){
        Random r = new Random();
        int[] a = new int[5];
        HashMap<Integer,Integer> c = new HashMap<>();
        Counter b = new Counter();
        for(int i = 0; i<a.length; i++){
            a[i] =  r.nextInt(5)-3;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        c = b.count(a);
        System.out.println(c);
    }
}
