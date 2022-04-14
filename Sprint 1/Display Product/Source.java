import java.util.*;
public class Source{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String Products[] = new String[10];
        for(int i=0;i<5;i++)
            Products[i] = sc.nextLine();
        for(int i=0;i<4;i++){
            for(int j=i+1;j<5;j++){
                if(Products[i].compareTo(Products[j])){
                    String temp = Products[i];
                    Products[i] = Products[j];
                    Products[j] = temp;
                }
            }
        }
        for(int i=0;i<5;i++)
            System.out.println(Products[i]);
    }
}