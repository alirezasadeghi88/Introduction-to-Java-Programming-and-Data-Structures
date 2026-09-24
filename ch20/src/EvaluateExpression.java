import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println(
                    "Usage: java EvaluateExpression \"expression\"");
            System.exit(1);
        }

        try {
            System.out.println(evaluateExpression(args[0]));
        } catch (Exception ex) {
            System.out.println("Wrong expression: " + args[0]);
        }
    }

    public static int evaluateExpression(String expression) {
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        expression = insertBlanks(expression);

        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.length() == 0)
                 else if (token.charAt(0) == '+' || token.charAt(0) == '−') {
                while (!operatorStack.isEmpty() &&
                        (operatorStack.peek() == '+' ||
                                operatorStack.peek() == '−' ||
                                operatorStack.peek() == '*' ||
                                operatorStack.peek() == '/')) {
                    processAnOperator(operandStack, operatorStack);
                }

                operatorStack.push(token.charAt(0));
            }else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
                while (!operatorStack.isEmpty() &&
                        (operatorStack.peek() == '*' ||
                                operatorStack.peek() == '/')) {
                    processAnOperator(operandStack, operatorStack);
                }

                operatorStack.push(token.charAt(0));
            } else if(token.trim().charAt(0) =='(') {
                operatorStack.push('(');
            }else if (token.trim().charAt(0) ==')') {
                while (operatorStack.peek() != '(') {
                    processAnOperator(operandStack, operatorStack);
                }

                operatorStack.pop();
            }
        }
    }
}

