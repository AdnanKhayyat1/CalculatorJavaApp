import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Calculator calc = new Calculator();
        System.out.println("welcome to the calculator\nEnter a command:");
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(input != "done"){
            input = scanner.nextLine();
            String[] cmds = input.split("\\W+");
            for(int i = 0; i < cmds.length; i++){
                System.out.println(i + ": " + cmds[i]);
            }
            int leftOp = Integer.parseInt(cmds[1]);
            if(cmds[0] == "fibonacciNumberFinder"){
                System.out.println(calc.fibonacciNumberFinder(leftOp));
            }
            else if(cmds[0] == "intToBinaryNumber"){
                System.out.println(calc.intToBinaryNumber(leftOp));
            } else {
                int result = -1;
                int rightOp = Integer.parseInt(cmds[2]);
                if(cmds[0] == "add"){
                    result = calc.add(leftOp, rightOp);
                }
                if(cmds[0] == "subtract"){
                    result = calc.add(leftOp, rightOp);
                }
                if(cmds[0] == "multiply"){
                    result = calc.multiply(leftOp, rightOp);
                }
                if(cmds[0] == "divide"){
                    result = calc.divide(leftOp, rightOp);
                }
                System.out.println("Output: " + Integer.toString(result) + "\n");
            
            }
        }
        scanner.close();


    }
}
