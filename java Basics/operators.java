import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length :");
        int length = input.nextInt();
        System.out.println("Enter Breadth :");
        int breadth = input.nextInt();

        int area = length * breadth;
        System.out.println("Area of Rectangle : "+area);

        //perform + ,- ,* ,/ , %
        System.out.println("Enter a: ");
        float a = input.nextFloat();
        System.out.println("Enter b: ");
        float b = input.nextFloat();

        System.out.println("Addition : "+ (a+b));
        System.out.println("Subtraction : "+ (a-b));
        System.out.println("Multiplication : "+ (a*b));
        System.out.println("Division : "+ (a/b));
        System.out.println("Remainder : "+ (a%b));
    }
}
