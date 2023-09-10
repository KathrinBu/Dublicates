import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
 //    joinMap(create());
     joinSet(create());
    }

    public static List<String> create() throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader("1.txt"));
        String string;
        List<String> list = new ArrayList<>();

        while ((string = fileReader.readLine()) != null) {
            if (!string.isEmpty()) {
                //   list.add(string);
                //    System.out.println(string);
              String []  str = string.split("[,\\s]+");
                //     System.out.println(Arrays.toString(str));
                list.add(Arrays.toString(str));
            }
        }
     //   System.out.println(list);

        return list;
    }
    public static void joinMap(List<String> list){
        Map<String, String> map=new HashMap<>();
        for (String s:list) {
            if(map.put(s, String.valueOf(s.hashCode())) !=null){
                System.out.println(":(");
            }
        }
        System.out.println(map);
    }
    public static void joinSet(List<String> list){
        Set set=new HashSet<>(list);
        System.out.println(set);
    }

}
