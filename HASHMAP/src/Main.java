import java.util.*;
public class Main {
    public static void main(String[] args) {

       //country(key), population(integer)

        HashMap<String,Integer> map= new HashMap<>();
        map.put("India",4000);
        map.put("US",100);
        map.put("china",50000);
        System.out.println(map);
        //two type of search
        if (map.containsKey("hue")){
            System.out.println("presernt in the map");
        }
        else {
            System.out.println("key is not pressent");
        }
        //getting values in key
        System.out.println(map.get("china"));//key exist
        System.out.println(map.get("indo"));

        //iterate in hashmap
        //ALAG TYPE KA FOR LOOP
        //for(value:collections)
        //collections = bunch of obj
        //EXAMPLE- instead of writing >> for(int i=20;i<2;i++)
        //write this >> for(int val :arr)

        int arr[] ={23,34,12};
        for(int val:arr){
            System.out.println(val);
        }
//ITERATION HASHMAP
        //Map.Entry<Integer,Integer>e:Map.entrySet()
        for (Map.Entry<String,Integer> e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        Set<String> keys = map.keySet();
        for (String key:keys){
            System.out.println(key+" "+map.get(key));
        }
//removing pair
        map.remove("china");
        System.out.println(map);


    }

}