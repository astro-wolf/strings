import java.util.Stack;

public class ValidParantheses {

    public static void main(String[] args) {
        ValidParantheses validParantheses = new ValidParantheses();
        boolean isValid = validParantheses.isValid("]");
        System.out.print("");
    }

    public boolean isValid(String s) {
        if(s.length() == 0)
            return true;
        Stack<Character> paranthesesStack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            switch (chr) {
                case '{':
                    paranthesesStack.push(chr);
                    break;
                case '[':
                    paranthesesStack.push(chr);
                    break;
                case '(':
                    paranthesesStack.push(chr);
                    break;
                case '}':
                    if(paranthesesStack.isEmpty())
                        return false;
                    char topChar = paranthesesStack.pop();
                    if(topChar != '{')
                        return false;
                    break;
                case ']':
                    if(paranthesesStack.isEmpty())
                        return false;
                    char topChar1 = paranthesesStack.pop();
                    if(topChar1 != '[')
                        return false;
                    break;
                case ')':
                    if(paranthesesStack.isEmpty())
                        return false;
                    char topChar2 = paranthesesStack.pop();
                    if(topChar2 != '(')
                        return false;
                    break;
            }
        }
        return paranthesesStack.isEmpty();
    }

}
