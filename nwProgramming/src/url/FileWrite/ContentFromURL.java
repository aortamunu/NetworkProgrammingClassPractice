package url.FileWrite;
import java.net.*;
import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ContentFromURL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            File f1 = new File("C://www.youtube.com");
            FileWriter fw = new FileWriter(f1);
        }
        catch(Exception e){
            
        }
    }
}
