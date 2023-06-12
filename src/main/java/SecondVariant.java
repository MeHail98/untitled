import java.util.ArrayDeque;
public class SecondVariant {
    public static boolean isAppropriate(String str) {
        ArrayDeque<Character> charDeque = new ArrayDeque<>();
        for (char symbol : str.toCharArray()) {
            switch (symbol) {
                case '[':
                case '{':
                case '(':
                    charDeque.addFirst(symbol);
                    break;
                case ']':
                    if (charDeque.isEmpty() || charDeque.pollFirst() != '[')
                        return false;
                    break;
                case '}':
                    if (charDeque.isEmpty() || charDeque.pollFirst() != '{')
                        return false;
                    break;
                case ')':
                    if (charDeque.isEmpty() || charDeque.pollFirst() != '(')
                        return false;
                    break;
            }
        }
        return charDeque.isEmpty();
    }
}

