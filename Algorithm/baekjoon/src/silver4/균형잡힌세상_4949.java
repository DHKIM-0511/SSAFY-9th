package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 균형잡힌세상_4949 {
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String tmp = br.readLine();
			if(tmp ==".")
				break;
			else {
				if(check(tmp))
					System.out.println("yes");
				else
					System.out.println("no");
			}
		}
	}

	private static boolean check(String tmp) {
		Stack<Character> s = new Stack<>(); 
		 if (tmp.length()==0) {
		        return false;
		 }
		for(char c : tmp.toCharArray()) {
			if(c == '(' || c=='[') {
				s.push(c);
			}else if(c == ')' || c==']') {
				if(c == ')') {
					if(s.isEmpty() || s.peek()=='[')
						return false;
					else
						s.pop();
				}else {
					if(s.isEmpty()|| s.peek()=='(')
						return false;
					else
						s.pop();
				}
			}
		}
		if(!s.isEmpty())
			return false;
		return true;
	}
}
