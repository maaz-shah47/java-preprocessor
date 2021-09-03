import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MyProcessor {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr=new FileReader("input.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) { 
          System.out.println("Line is: " + line + " is Balanced? " + Preprocessor.bal_chck(line));
        }
    }
}