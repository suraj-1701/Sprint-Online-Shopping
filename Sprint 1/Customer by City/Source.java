import java.util.*;
public class Source {
  
    static String customerDetails[][]=new String[5][3];
    static {
	customerDetails[0][0]="1001";
	customerDetails[0][1]="Raj";
	customerDetails[0][2]="Chennai";
	
	customerDetails[1][0]="1008";
	customerDetails[1][1]="Akshay";
	customerDetails[1][2]="Pune";
	
	customerDetails[2][0]="1002";
	customerDetails[2][1]="Simrath";
	customerDetails[2][2]="Amristar";
	
	customerDetails[3][0]="1204";
	customerDetails[3][1]="Gaurav";
	customerDetails[3][2]="Delhi";
	
	customerDetails[4][0]="1005";
	customerDetails[4][1]="Ganesh";
	customerDetails[4][2]="Chennai";
    }
    
	public static void main(String args[]){
    Source s1 = new Source();
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    boolean f = false;
    for(int i=0;i<5;i++){
        if(customerDetails[i][2].equals(s)){
            for(int j=0;j<3;j++){
                System.out.println(customerDetails[i][j]);
            }
            f=true;
        }
    }
    if(!f)
        System.out.println("No Record Found");

    }
}