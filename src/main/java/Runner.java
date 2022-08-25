public class Runner {
    public static void main(String[] args) {

        ParenthesesChecker parenthesesChecker = new ParenthesesChecker();


       boolean result =  parenthesesChecker.checkParentheses("james)(");
        System.out.println(result);
    }
}
