package askingquestions;

import java.util.Scanner;

public class AskingQuestions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int age;
        String height, inches;
        double weight;
        
        System.out.print("How old are you? ");
        age = keyboard.nextInt();
        
        System.out.print("How tall are you? ");
        height = keyboard.next();
        
        System.out.print("and how many inches are you?");
        inches = keyboard.next();
        
        System.out.print("How much do you weigh? ");
        weight = keyboard.nextDouble();
        
        System.out.println("So you're " + age + " years old, " + height + "  feet and " + inches +  " inches tall and " + weight + " pounds heavy. ");
    }
    
}
