package day03;

public class ArrayTEst3 {

	public static void main(String[] args) {
		//2차원 배열
		//행렬구조(표, 구조)
		//2 x 3 행렬 구조
		
		int[][] arr = new int[2][3]; 
		/*
		 * [0][0] [0][1] [0][2]
		 * [1][0] [1][1] [1][2]
		 */
		arr[0][0] = 20;
		arr[0][1] = 30;
		arr[0][2] = 40;
		arr[1][0] = 50;
		arr[1][1] = 60;
		arr[1][2] = 70;
		
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j < 3; j++) {
			System.out.println("arr{" + i + "}=" + "{" + j + "}= " + arr[i][j]);
				//System.out.println(arr[i][j]);
	
			}
		}
	}
}
