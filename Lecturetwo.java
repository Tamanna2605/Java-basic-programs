import java.util.Scanner;

public class Lecturetwo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        if(n>=90)
        {
            System.out.println("Grade A");
        }
        else if(n>=70)
        {
            System.out.println("Grade B");
        }
        else if(n>=50)
        {
            System.out.println("Grade C");
        }
        else if(n>=35)
        {
            System.out.println("Grade D");
        }
        else
        {
            System.out.println("Fail");
        }
    }
    
}
