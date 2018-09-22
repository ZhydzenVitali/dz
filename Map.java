import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main (String [] args){
        HashMap<Integer,String> Map = new HashMap<Integer, String>();
        Map.put(1,"один");
        Map.put(2,"два");
        Map.put(3,"три");
        Map.put(4,"четыре");
        Map.put(5,"пять");
        Map.put(6,"шесть");
        Map.put(7,"семь");
        Map.put(8,"восемь");
        Map.put(9,"девять");
        Map.put(10,"десять");
        Map.put(11,"одинадцать");
        Map.put(12,"двенадцать");
        Map.put(13,"тринадцать");
        Map.put(14,"четырнадцать");
        Map.put(15,"пятнадцать");
        Map.put(16,"шестнадцать");
        for (HashMap.Entry<Integer,String> entry: Map.entrySet())
            if (entry.getValue().contains("цать")) {
                System.out.println(entry.getKey());
            }
    }
}
