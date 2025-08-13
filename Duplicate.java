import java.util.Scanner;

class Duplicate {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=scanner.nextInt();
        int num[]= new int[n];
        System.out.println("Enter all the elements:");
        for(int i=0;i<n;i++)
        {
            num[i]=scanner.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(num[j]>num[j+1])
                {
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.println(num[i]+" ");
        }
        //System.out.println();
        for(int i=0;i<n-1;i++)
        {
            if(num[i]==num[i+1])
            {
                System.out.println("True");
            }
            
        }


    }

    
    
}
