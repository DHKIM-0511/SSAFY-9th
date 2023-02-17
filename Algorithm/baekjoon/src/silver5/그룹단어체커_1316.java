package silver5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 그룹단어체커_1316 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		int flag = 0;
		
		for(int i = 0 ; i < tc ; i++)
		{
			
			String n = br.readLine();
			for(int j = 0 ; j < n.length() ; j++)
			{
				if(n.length()-j>=1) {
					if(n.charAt(j)!= n.charAt(j+1))
						flag++;
				}
			}
		}
		
		System.out.println(tc-flag);
	}
}