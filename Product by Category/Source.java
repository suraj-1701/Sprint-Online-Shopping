import java.io.*;
import java.util.*;
public class Source{

    static String[] mobile = {"Samsung S8", "One Plus 8", "Sony Experia"};
    static String[] tv = {"VU 55 inches", "Sony TV", "Samsung Tv"};
    static String[] electronics = {"Speakers", "DSLR Cameras", "Security Cameras"};

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String product = sc.next();
        switch(product.toLowerCase())
        {
            case "mobile":       getMobile(); break;
            case "tv":           getTv(); break;
            case "electronics":  getElectronics(); break;
            default : System.out.println("No Products Available");
        }
    }
    public static void getMobile(){
        for(String mobileName: mobile)
            System.out.println(mobileName);
    }
    public static void getTv(){
        for(String tvName: tv)
            System.out.println(tvName);
    }
    public static void getElectronics(){
        for(String electronicsName: electronics)
            System.out.println(electronicsName);
    }
}