import java.lang.Math;
import java.util.Scanner;

public class game {
    static Scanner sc = new Scanner(System.in);
    public static int rand() {
        return (int)(Math.random()*100);
    }
    public static void rungame(){
        while(true){
            System.out.println("Enter the Number");
            int guess = sc.nextInt();
            int num = rand();
            if(num==guess){
                System.out.println("You guessed the correct number");
                System.exit(0);
            } else if(num>guess){
                System.out.println("Your number is Smaller");
            }else if(num<guess){
                System.out.println("Your number is Bigger");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To the Game \"Guess The number\"");
        rungame();
    }
}
