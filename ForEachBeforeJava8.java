import java.util.ArrayList;
import java.util.List;

class LambdaExpression {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        List<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.forEach(item -> System.out.println(item * item));
    }
}
