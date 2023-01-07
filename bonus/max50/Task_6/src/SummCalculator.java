import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SummCalculator {
    public int calculateSumm(HashMap<String,Integer> hash1,HashMap<String,Integer> hash2) {
        int sum = 0;
        Set<HashMap.Entry<String,Integer>> set1 = hash1.entrySet();
        for(HashMap.Entry<String,Integer> me:set1){
            int col = me.getValue();
            if(hash2.containsKey(me.getKey())){
                int s = hash2.get(me.getKey());
                System.out.println("Количество:"+col+" Стоимость:"+s);
                int result = col*s;
                sum = sum+result;
            }
        }
        return sum;
    }
}
