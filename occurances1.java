import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt(); 
        int[] arr = new int[size]; 
     
        for (int i = 0; i < size; i++) {
            arr[i] = obj.nextInt(); 
        }

        int count;
        int min = 9; 
        
        for (int i = 0; i < size; i++) {
            count = 0;
            for (int j = 0; j < size; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            
            if (count > 1 && arr[i] < min) {
                min = arr[i];
                
                
            } else if (count == 1) {
                System.out.println(arr[i]); 
            }
        }

        System.out.println(min); 
    }
}
