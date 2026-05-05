import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int cut=0;
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Number of Visiting N in their first line");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<large){
                large=arr[i];
                cut++;
            }
        }
        System.out.println("Number of ranks cut in the lis:"+cut);
    }
}
