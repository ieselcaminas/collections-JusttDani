import java.util.Stack;

public class Parentesis {
    public static void main(String[] args) {
        System.out.println(esBalanceado("{{[([]{})]}}"));
    }

    public static boolean esBalanceado(String cadena) {
        boolean balanced;
        char character;
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < cadena.length(); i++) {
            character = cadena.charAt(i);
            if (character == '(' || character == '{' || character == '[') {
                pila.push(character);
            } else if (character == ')' || character == '}' || character == ']') {
                if (pila.isEmpty()) {
                    return false;
                }
                char top = pila.pop();
                if ((character == ')' && top != '(') ||
                        (character == '}' && top != '{') ||
                        (character == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
