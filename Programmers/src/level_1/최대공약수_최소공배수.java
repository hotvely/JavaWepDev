package level_1;
import java.util.*;
public class 최대공약수_최소공배수 {

	public static void main(String[] args) {
		
		Solution sl = new Solution();
		
		System.out.println(sl.solution(3, 12)[0]+","+sl.solution(3, 12)[1]);
	}	
	
}



class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        answer = new int[2];
        
        double rootN = Math.sqrt(n);
                
		// 두수의 최대 공약수
		for(int i = 2 ; i <= (int)rootN + 2; i++)
		{
			// 나눠서 0으로 떨어진다? 약수다 ~
			if(n % i == 0)
			{
				// m도 나눴는데 0으로 떨어진다???? 걔한테도 약수다 ~~
				if(m % i == 0)
				{
					answer[0] = i;    				
					break;
				}
			}        			
		}
		
		List<Integer> temp = new ArrayList<Integer>();
		// 두수의 최소 공배수
		if(n < m)
		{			
			int i = 1;
			while(true)
			{				
				temp.add(i * n);
				for(int k = 0; k < temp.size(); k++)
				{
					if(temp.contains(m * (k+1)))
					{
						answer[1] = (m * (k + 1));
						return answer;
					}
				}
				i++;
			}
		}
		else if(m < n)
		{
			for(int i = 1; ; i++)
			{
				temp.add(i * m);
				for(int k = 0; k < temp.size(); k++)
				{
					if(temp.contains(n * (k+1)))
					{
						answer[1] = (n * (k + 1));
						return answer;
					}
				}
			}
		}
		else
		{
			answer[1] = n;
			return answer;
		}
     
    }
}