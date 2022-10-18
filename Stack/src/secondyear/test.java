package secondyear;
import java.util.*;
public class test {

	public static void main(String[] args) {
    Stack s =new Stack();
    s.push("A");
    s.push(20);
    s.push('A');
    s.push(3.14);
    System.out.println(s.size());
    System.out.println(s.peek());
    System.out.println(s.pop());
    char ch = (Character) s.pop();
    System.out.println(ch);
    int i = (Integer) s.pop();
    System.out.println(i);
	}

}
