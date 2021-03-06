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
            int leftOp = Integer.parseInt(cmds[1]);
            if(cmds[0].contains("fibonacci") || cmds[0].contains("binary")){
                if(cmds[0].contains("fibonacci")){
                    System.out.println(calc.fibonacciNumberFinder(leftOp));
                }
                else if(cmds[0].contains("binary")){
                  
                    System.out.println(calc.intToBinaryNumber(leftOp));
                } 
            }else {
                int result = -1;
                int rightOp = Integer.parseInt(cmds[2]);
                if(cmds[0].contains("add")){

                    result = calc.add(leftOp, rightOp);
                }
                if(cmds[0].contains("subtract")){
                    result = calc.subtract(leftOp, rightOp);
                }
                if(cmds[0].contains("multiply")){
                    result = calc.multiply(leftOp, rightOp);
                }
                if(cmds[0].contains("divide")){
                    result = calc.divide(leftOp, rightOp);
                }
                System.out.println(Integer.toString(result));
            
            }
        }
        scanner.close();


    }
}
