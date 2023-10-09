import java.util.Scanner;

public class Calculator {
    private Scanner m_scanner;
    private double m_firstOperand;
    private double m_secondOperand;
    private double m_result;
    private int m_operation;

    public Calculator(){
        this.m_scanner = new Scanner(System.in);
        this.m_firstOperand = 0.0;
        this.m_secondOperand= 0.0;
        this.m_result = 0.0;
        this.m_operation = 0;
    }

    public void startCalculator() {
        askForOperands();
        askForOperation();
        performOperation();
    }

    private void askForOperands() {
        System.out.println("Enter your first operand");
        this.m_firstOperand = askForOperand();

        System.out.println("Enter your second operand");
        this.m_secondOperand= askForOperand();
    }

    private void askForOperation() {
        System.out.println("¿What operation do you want to do?");
        System.out.println("1)Sum \n2)Substract \n3)Divide \n4)Multiply \n5)Power \n6)Module");
        this.m_operation = askForOperationValue();
    }

    private double askForOperand() {
        while (true) {
            try {
                String userInput = m_scanner.nextLine();
                double operand = Double.valueOf(userInput);
                return operand;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid operand.");
            }
        }
    }

    private int askForOperationValue() {
        while (true) {
            try {
                String userInput = m_scanner.nextLine();
                int operation = Integer.valueOf(userInput);
                return operation;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid value.");
            }
        }    
    }

    private void performOperation() {
        switch (this.m_operation) {
            case 1:
                // Sum implementation
                break;
            case 2:
                //Substraction implementation
                break;
            case 3:
                // Divide implmenetation
                break;
            case 4:
                // Multiplication implmenetation
                break;
            case 5:
                // Power implmenetation
                break;
            case 6:
                // Module implmenetation
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
    }

    private void printResult() {
        System.out.println("The result is: " + this.m_result);
    }
}
