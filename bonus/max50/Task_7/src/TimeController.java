import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TimeController {
    public String getActionWithMaxTime (ArrayList<String> aray1,ArrayList<Integer> aray2){
        String result = "";
        int result_max = 0;
        for(int i = 0; i<aray1.size();i++){
            System.out.println(aray1.get(i));
        }
        for(int i = 0; i<aray2.size();i++){
            System.out.println(aray2.get(i));
        }
        HashMap<String,Integer> hash1 = new HashMap<>();
        for(int i = 0; i<aray1.size();i++){
            if(hash1.containsKey(aray1.get(i))){
                int k = aray2.get(i)+hash1.get(aray1.get(i));
                hash1.put(aray1.get(i),k);
            }
            else{
                hash1.put(aray1.get(i),aray2.get(i));
            }
        }
        System.out.println(hash1);
        result_max = hash1.get(aray1.get(0));
        Set<HashMap.Entry<String,Integer>> set1 =  hash1.entrySet();
        for(HashMap.Entry<String,Integer> me:set1){
            if(me.getValue()>result_max){
                result_max = me.getValue();
                result = me.getKey();
            }
            //System.out.println(me.getKey()+":"+me.getValue());
        }
       // System.out.println(result+" "+result_max);
        return result;
    }
}
