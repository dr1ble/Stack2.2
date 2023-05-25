import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] sim = str.toCharArray();
        boolean flag = false;
        try {
            for (int i = 0; i < str.length(); i++) {
                if (sim[i] == '{' || sim[i] == '(' || sim[i] == '[')
                    s.push(sim[i]);
                else if ((sim[i] == ')' || sim[i] == '}' || sim[i] == ']') && s.empty()){
                    flag = true;
                }
                else if (sim[i] == ')' && s.top() == '('
                        || sim[i] == ']' && s.top() == '['
                        || sim[i] == '}' && s.top() == '{')
                    s.pop();
            }
        }
        catch(Exception e) {;
        }
        if (s.count() == 0 && flag == false)
            System.out.println("Correct");
        else
            System.out.println("Incorrect");
    }
}