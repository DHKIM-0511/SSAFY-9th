package play;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class play {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double grade = Double.parseDouble(br.readLine());
		System.out.println(grade);

	}
}
