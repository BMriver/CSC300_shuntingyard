package drive;
public class OpStack extends Stack {
    private String Ops = "+-*/";
    private char leftParenthesis = '(';
    private char rightParenthesis = ')';

    @Override
    public void push(String data) {
        this.prepend(data);
    }

    @Override
    public Node pop() {
        Node result = this.Head;
        this.removeHead();
        return result;
    }

    //Returns the operator at the top of the stack without removing it
    public Node peek() {
        return this.Head;
    }
    // Checks if a character is an operator
    public boolean isOperator(char c) {
        return Ops.indexOf(c) != -1;
    }

    // Returns the precedence of an operator
    public int precedence(String op) {
        switch (op) {
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return -1;
        }
    }
}
