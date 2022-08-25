import java.security.PublicKey;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Stack;

public class ParenthesesChecker {


    private Stack<String> stringStack;
    public ParenthesesChecker(){
        this.stringStack = new Stack<>();
    }


//    create stack of all characters
//    check if any open  parentheses
//    if there is one, check if closing one is present
//    if there is one, repeat checks
//    if stack is empty, return false



    public boolean checkParentheses(String testString){

        String[] stringArray = testString.split("");
        for (int i = 0; i < testString.length(); i++) {
            stringStack.push(stringArray[i]);
        }


        int closedBrackets = 0;
        int openBrackets = 0;
        int stackSize = stringStack.size();
        if (stringStack.isEmpty()){
            return true;
        }

        for (int i = 0; i < stackSize; i++) {

            if (stringStack.peek().equals(")")) {
               stringStack.pop();
               closedBrackets+=1;
            } else if (stringStack.peek().equals("(")) {
                stringStack.pop();
                openBrackets+=1;
            } else stringStack.pop();

        }

        return closedBrackets == openBrackets;
    }


}


