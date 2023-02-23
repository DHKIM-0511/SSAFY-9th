package play;

import java.util.Scanner;
import java.util.Stack;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class play {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
        out: while (sc.hasNext()) {
        	
            Stack<Character> stack = new Stack<>();
            
            String line = sc.nextLine();
            
            char[] splt = line.toCharArray();
            
            if (splt.length == 1) {
                if (splt[0] == '.')
                    break out;
            } // 종료조건
            
            for (int i = 0; i < splt.length; i++) {
            	
                if (splt[i] == '(' || splt[i] == '[') {
                    stack.push(splt[i]);
//                        System.out.println(stack.peek());
                } else if (splt[i] == ')') {
                    stack.push(splt[i]);
                    if (!stack.empty()) {
                        if (stack.peek() == '(')
                            stack.pop();// ( pop

                    } else
                        stack.push(splt[i]);
                } else if (splt[i] == ']') {
                    stack.push(splt[i]);
//                        System.out.println(stack.peek());
                    if (!stack.empty())
                        if (stack.peek() == '[')
                            stack.pop();
                } else if (splt[i] == '.')
                    break;
            }

//                    System.out.println(stack.pop());

//                System.out.println(sb.toString());
            if (stack.empty())
                System.out.println("yes");
            else
                System.out.println("no");

            while (!stack.empty())
                stack.pop();

        }

	}
}
