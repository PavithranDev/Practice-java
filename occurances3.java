import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
       
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
       
        
        int[] arr = new int[n];
      
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] frequency = new int[n];
        for (int i = 0; i < n; i++) {
            frequency[i] = 1;  // Initially, each element has a frequency of 1
            if (arr[i] == -1) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    frequency[i]++;
                    arr[j] = -1;  // Mark the element as counted
                }
            }
        }

       
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (frequency[i] > frequency[j] || (frequency[i] == frequency[j] && arr[i] > arr[j])) {
               
                    int tempFreq = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = tempFreq;

                   
                    int tempVal = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempVal;
                }
            }
        }

        System.out.println("Sorted array by frequency:");
        for (int i = 0; i <n; i++) {
               if(arr[i]>0)
                System.out.print(arr[i] + " ");
            }
        }
        
    }
