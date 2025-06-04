package interpreter.expression;

import java.util.Map;

public class Variable implements Expression {

    private final String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return context.getOrDefault(name, Boolean.FALSE);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
