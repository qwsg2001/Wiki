package day03;

public class ExamleTest {

	public static void main(String[] args) {
		
		 int [][] array = {
		 		{85,86},
		 		{83,92,96},
		 		{78,83,93,87,88}
		 };
		 
		int[][] array1 = new int[3][];
		array[0] = new int[2];
		array[1] = new int[3];
		array[2] = new int[5];
		
		array[0][0] = 95;
		array[0][1] = 85;
		array[1][0] = 75;
		array[1][1] = 65;
		array[2][0] = 55;
		array[2][1] = 45;
		array[2][2] = 35;
	
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j <array[i].length; j++) {
				System.out.println(array[i][j] + " ");				
			}
			System.out.println("");
		}
	}

}
