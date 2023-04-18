import java.io.*;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;

public class DisplayContent{
    public static void main(String args[]){
        try {
            File file = new File("hello.txt");
            FileReader Fr = new FileReader(file);
            BufferedReader br = new BufferedReader(new InputStreamReader);
            String line;
            FileReader fr = Fr;

            while(line = br.readLine()! = null)
            {
                System.out.println(line);
            }
        }
    }
}

