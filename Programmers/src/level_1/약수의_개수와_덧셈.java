package level_1;


public class 약수의_개수와_덧셈 {

	public static void main(String[] args) {

	}

}

//class Solution 
//{
//    public int solution(int left, int right) 
//    {
//    	
////	    	두 정수 left와 right가 매개변수로 주어집니다. 
////	    	left부터 right까지의 모든 수들 중에서, 
////	    	약수의 개수가 짝수인 수는 더하고, 
////	    	약수의 개수가 홀수인 수는 뺀 수를 return 하도록
////			solution 함수를 완성해주세요.
//
//        int answer = 0;
//        Solution sl = new Solution();
//        for(int i = left; i <= right; i++)
//        {
//        	// 제곱근이 존재 하면(근의 개수는 홀수(자기자신이 포함되어야 하니까)
//        	// 제곱근이 존재 하지 않으면(근의 개수는 짝수(자기자신이 포함되지 않으니까)
//        	
//			double rootNum = Math.sqrt(i);
//        	if(rootNum % 1 != 0)	// 제곱근이 존재 하지 않음~
//        		answer -= i;
//        	else
//        		answer += i;
//        }
//        
//        return answer;
//    }
//    
//}
//
