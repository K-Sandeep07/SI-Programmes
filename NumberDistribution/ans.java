import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]>0)
                pos+=1;
            else if(arr[i]==0)
                zero+=1;
            else
                neg+=1;
        }
        System.out.println(zero+" "+pos+" "+neg);

    }
}
