import java.util.Random;
public class Main {
    public static void main(String[]args){
        //System.out.println("hello");
        Random r = new Random();
        int[] a = new int[5];
        int[] c = new int[10];
        Dubler b = new Dubler();
        for(int i = 0; i<a.length; i++){
            a[i] =  r.nextInt(10)-10;
            System.out.print(a[i]);
        }
        System.out.println();
        c = b.doubling(a);
        for(int i = 0; i<c.length;i++){
            System.out.print(c[i]);
        }
    }
}
