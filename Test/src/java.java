/**
 * Created by Farkas on 4/2/2017.
 */
import java.util.Scanner;

public class java
{

 public String name;


 public void start(){


    Scanner in = new Scanner(System.in);
    System.out.println("Welcome to a simple app... \n"
            + " Enter your name:");
    name = in.next();
    run();

}

 public void run(){

     System.out.println("Omg it's Working!!!! Such wow");

 }
}
