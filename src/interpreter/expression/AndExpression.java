package interpreter.expression;

import java.util.Map;

public class AndExpression implements Expression {

    private final Expression left;
    private final Expression right;

    public AndExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return left.interpret(context) && right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " AND " + right.toString() + ")";
    }
}
