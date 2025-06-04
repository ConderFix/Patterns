package interpreter;

import interpreter.expression.AndExpression;
import interpreter.expression.Expression;
import interpreter.expression.OrExpression;
import interpreter.expression.Variable;

import java.util.Stack;
import java.util.StringTokenizer;

public class ExpressionParser {

    public Expression parse(String str) {
        final Stack<Expression> stack = new Stack<>();
        final Stack<String> operators = new Stack<>();

        final StringTokenizer tokens = new StringTokenizer(str, " ()", true);

        while (tokens.hasMoreTokens()) {
            final String token = tokens.nextToken().trim();

            if (token.isEmpty()) continue;

            switch (token.toUpperCase()) {
                case "AND", "OR", "(" -> {
                    operators.push(token.toUpperCase());
                }
                case ")" -> {
                    while (!operators.isEmpty() && !"(".equals(operators.peek())) {
                        this.applyOperator(stack, operators);
                    }
                    operators.pop();
                }
                default -> stack.push(new Variable(token));
            }
        }

        while (!operators.isEmpty()) {
            this.applyOperator(stack, operators);
        }

        return stack.pop();
    }

    private void applyOperator(Stack<Expression> stack, Stack<String> operators) {
        if (stack.size() < 2) throw new IllegalStateException("There are no expression between operators");

        final Expression right = stack.pop();
        final Expression left = stack.pop();

        stack.push(buildExpression(left, right, operators.pop()));
    }

    public Expression buildExpression(Expression left, Expression right, String operator) {
        return switch (operator) {
            case "AND" -> new AndExpression(left, right);
            case "OR"-> new OrExpression(left, right);
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}
