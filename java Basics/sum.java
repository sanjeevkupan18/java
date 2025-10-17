import java.util.Scanner;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a :");
        int a = sc.nextInt();

        System.out.print("Enter the value of b :");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.println("The required sum of " + a + " and " + b + " is " + sum);

        //input string and print

        sc.nextLine(); // nextInt() contains \n in it so, to consume we have to write this for taking next input
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter Age: ");
        int age =sc.nextInt();
        
        System.out.println("Hello "+ name + " ,You are "+ age+ " Years old.");
    }
}
