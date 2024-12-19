
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in) ;
	    int n=sc.nextInt();
	    int [] arr=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		//occuances check 
		for(int i=0;i<arr.length;i++){
		    int count=0;
		    if(arr[i]==-1){
		        continue;
		    }
		    for(int j=0;j<arr.length;j++){
		        if(arr[i]==arr[j]){
		            count+=1;
		             if (i != j) {  // Mark the element as counted
                        arr[j] = -1;
                    }
		        }
		    }System.out.println(arr[i]+"->"+count);
		    arr[i]=-1;
		}
			for(int i=0;i<n;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
