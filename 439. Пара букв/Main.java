import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = reader.readLine();

        String[] words = text.split(" ");
        Map<String, Integer> pairCount = new TreeMap<String, Integer>();

        for(String word : words){
            for(int i = 0; i < word.length() - 1; i++){
                String pair = word.substring(i,i+2);
                if(pairCount.containsKey(pair)){
                    int add = pairCount.get(pair) + 1;
                    pairCount.put(pair, add);
                } else {
                    pairCount.put(pair, 1);
                }

            }
        }

        int max = 0;
        String pair = "";
        for(Map.Entry<String, Integer> entry : pairCount.entrySet()){
            if (entry.getValue() >= max){
                max = entry.getValue();
                pair = entry.getKey();
            }
        }
        writer.write(pair);
        
        reader.close();
        writer.close();
    }

}
