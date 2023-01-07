import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[]args) {
        int a;
        HashMap<String, Integer> hash1 = new HashMap<>();
        hash1.put("Банан", 6);
        hash1.put("Картошка", 10);
        hash1.put("Яблоки", 20);
        hash1.put("Морковь", 7);

        HashMap<String,Integer> hash2 = new HashMap<>();
        hash2.put("Банан",100);
        hash2.put("Картошка",200);
        hash2.put("Яблоки",30);
        hash2.put("Морковь",40);

        Set<HashMap.Entry<String,Integer>>set1 = hash2.entrySet();
        for(HashMap.Entry<String,Integer> me:set1){
            System.out.println(me.getKey()+": "+me.getValue());
        }

        Set<HashMap.Entry<String,Integer>>set2 = hash1.entrySet();
        for(HashMap.Entry<String,Integer> me:set2){
            System.out.println(me.getKey()+": "+me.getValue());
        }
        SummCalculator sum = new SummCalculator();
        int result;
        result = sum.calculateSumm(hash1,hash2);
        System.out.println("Сумма всей покупки: "+result);
    }
}
