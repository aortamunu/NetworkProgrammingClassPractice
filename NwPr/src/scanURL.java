import java.net.*;
import java.io.*;
import java.util.Scanner;
public class ScanURL {
    public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the URL you want data from.");
            String inp = input.nextLine();
            ScanURL urc = new ScanURL();
            urc.scanURL(input);
        try{
            public String urlCheck(String userinp)
            URL url = new URL(userinp);
            URLConnection uc = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line+"\n");
            }
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}
