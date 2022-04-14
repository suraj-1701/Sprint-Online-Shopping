import java.util.*;
public class Source{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[][] s = new String[5][3];
        for(int i=0;i<5;i++)
            s[i][0]="0";
        
        //take user input
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++){
                if(sc.hasNextLine())
                    s[i][j]=sc.nextLine();
            }
        }
        //to provide value to swap function
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int a = Integer.parseInt(s[j][0]);
                int b = Integer.parseInt(s[j+1][0]);
                if(a>b)
                    swap(s,j);
            }
        }
        //print
        for(int i=0;i<5;i++){
            for(int j=0;j<3;j++)
                System.out.println(s[i][j]);
        }
    }

    private static void swap(String[][] a, int i){
        for(int j=0;j<3;j++){
            String temp = a[i][j];
            a[i][j] = a[i+1][j];
            a[i+1][j] = temp;
        }
    }
}