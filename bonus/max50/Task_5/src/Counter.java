import java.util.HashMap;
public class Counter {
    public HashMap<Integer,Integer> count(int[]a){
       HashMap<Integer,Integer> x = new HashMap<>();
       for(int i = 0; i<a.length;i++){
           if(x.containsKey(a[i])){
               int k = x.get(a[i])+1;
               x.put(a[i],k);
           }
           else{
               x.put(a[i],1);
           }
       }
       return x;
    }
}
