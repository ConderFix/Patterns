package interpreter;

import interpreter.expression.Expression;
import lombok.SneakyThrows;

import java.util.Map;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        final String query = "John AND ( Developer OR Manager )";

        final ExpressionParser parser = new ExpressionParser();
        final Expression expression = parser.parse(query);

        final Map<String, Boolean> context = Map.of(
                "John", true,
                "Developer", true,
                "Manager", false
        );

        final boolean result = expression.interpret(context);
        System.out.println(query);
        System.out.println(result);
    }
}
