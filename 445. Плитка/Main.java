import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = reader.readLine();
        String newtext[] = text.split(" ");
        
        
        int B = Integer.parseInt(newtext[0]);
        int W = Integer.parseInt(newtext[1]);
        float disk = (float) Math.sqrt(B*B/4 - 4 * (B/2 + W - 1));
        float x1, x2;
        x1 = (int) Math.floor(((B/2) + disk)/2);
        x2 = (int) Math.floor(((B/2) - disk)/2);
        x1--;
        x2--;
        if (x1 * x2 == W){
            if (x1 > x2)
                writer.write((int)(x1+2) + " " + (int)(x2+2));
            else writer.write((int)(x2+2) + " " + (int)(x1+2));
        }
        reader.close();
        writer.close();
    }

}