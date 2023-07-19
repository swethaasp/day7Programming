
import java.util.Scanner;



public class colsum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();//no.ofrows
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<r;i++){
		    for(int j=0;j<c;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int f=arr[0][0]+arr[1][0]+arr[2][0];
		int s=arr[0][1]+arr[1][1]+arr[2][1];
		int t=arr[0][2]+arr[1][2]+arr[2][2];
		int fo=arr[0][3]+arr[1][3]+arr[2][3];
		
		int res[]={f,s,t,fo};
		for (int i = 0; i < res.length; i++){
            System.out.print(res[i] + " ");
		}
		
		System.out.println(res);
		
	}
}
