import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
/*        int MaxNum = (int)(Math.random() * 11);

        for(int i = 0; i < MaxNum; i++)
        {
            System.out.println("Hello World");
        }*/

        System.out.println("Random bs go");

        Scanner inputScanner = new Scanner(System.in);
        String name = inputScanner.nextLine();

        System.out.println("Hello " + name + "!");
    }
}