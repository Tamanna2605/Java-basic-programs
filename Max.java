import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=scanner.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++)
        {
            num[i]=scanner.nextInt();
        }
        int max=num[0];
        for(int i=0;i<n;i++)
        {
            if(num[i]>max)
            {
                max=num[i];
            }
        }
        System.out.println("The largest number is:"+max);
    }
    
}
