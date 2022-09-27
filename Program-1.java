import java.util.Scanner;

class SmallCalculator {
  public static void main(String[] args) {

    char operator;
    Double a, b, result;

   
    Scanner input = new Scanner(System.in);

 

    
    System.out.println("Enter first number");
    a = input.nextDouble();

    System.out.println("Enter second number");
    b = input.nextDouble();
    
    System.out.println("type of operation: +, -, *, or /");
    operator = input.next().charAt(0);

    switch (operator) {

    
      case '+':
        result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        break;

   
      case '-':
        result = a - b;
        System.out.println(a+ " - " + b+ " = " + result);
        break;

  
      case '*':
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        break;

      
      case '/':
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}
