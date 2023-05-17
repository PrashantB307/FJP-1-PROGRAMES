import java.util.*;

public class Demo {

    public static void main(String[] args) throws Exception{
        HashMap<String, Integer> pmap = new HashMap<>();

        //----> Add new keys in Hashmap
        pmap.put("India", 130);
        pmap.put("China", 100);
        pmap.put("Aus", 80);
        pmap.put("Pak", 40);

        System.out.println(pmap);

        //------>Change the key Value
        pmap.put("India", 150);
        System.out.println(pmap);

        //-----> for print key values
        int ipop = pmap.get("India");
        System.out.println(ipop);

        Integer uspop = pmap.get("US");
        System.out.println(uspop);

        //-----> for varify keys are avalible or not
        System.out.println(pmap.containsKey("US"));
        pmap.put("US", 110);
        System.out.println(pmap.containsKey("US"));

        Set<String> keys = pmap.keySet();
        for(String key : keys){
            System.out.println(key + "-->" + pmap.get(key));
        }

        //-----> For remove keys
        pmap.remove("China");
        System.out.println(pmap);
    }
}