package level_1;

public class 행렬의_덧셈 
{

	public static void main(String[] args) 
	{
//		행렬의 덧셈은 행과 열의 크기가 같은 
//		두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
//		2개의 행렬 arr1과 arr2를 입력받아, 
//		행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
		int arr[][] = new int[2][3];
		System.out.println(arr[2].length);
		
		arr = new int[3][5];
	}

}
//
//class Solution 
//{
//    public int[][] solution(int[][] arr1, int[][] arr2) {
//        int[][] answer = {};
//        
//        int row = arr1.length;	//행
//        int column = arr1[0].length;	//열
//        
//        for(int r = 0; r <row; r++)
//        {
//        	for(int c = 0; c <column; c++)
//        	{
//        		answer[r][c] = arr1[r][c] + arr2[r][c];
//        	}
//        }
//        
//        return answer;
//    }
//}