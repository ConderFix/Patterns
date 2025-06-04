package interpreter.expression;

import java.util.Map;

public interface Expression {
    boolean interpret(Map<String, Boolean> context);
}
