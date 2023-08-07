package day03;

import java.util.Scanner;

public class ExamleTest2 {

	public static void main(String[] args) {
		
//		 int [][] array = {
//		 		{85,86},
//		 		{83,92,96},
//		 		{78,83,93,87,88}
//		 };
//		 
//		int[][] array1 = new int[3][];
//		array[0] = new int[2];
//		array[1] = new int[3];
//		array[2] = new int[5];
//		
//		array[0][0] = 95;
//		array[0][1] = 85;
//		array[1][0] = 75;
//		array[1][1] = 65;
//		array[2][0] = 55;
//		array[2][1] = 45;
//		array[2][2] = 35;
//	
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j <array[i].length; j++) {
//				System.out.println(array[i][j] + " ");				
//			}
//			System.out.println("");
//		}
//		
//		int max = 1;
//		 int min = 3;	
//		 
//		 int []array = {1,5,3,8,2};
//	
//		 for(int i = 0; i < array.length; i++) {
//			 max = Math.min(min,array[i]);
//		 }
//   		 System.out.println("MAX : " + max);	
//   		 System.out.println("Min : " + min);	
//		
//		 int [][] array = {
//		 		{95,86},
//		 		{83,92,96},
//		 		{78,83,93,87,88}
//		 };
		 
//		int[][] array = new int[3][];
//		array[0] = new int[2];
//		array[1] = new int[3];
//		array[2] = new int[5];
//		
//		array[0][0] = 95;
//		array[0][1] = 85;
//		array[1][0] = 75;
//		array[1][1] = 65;
//		array[2][0] = 55;
//		array[2][1] = 45;
//		array[2][2] = 35;
//
//		
//		
//		int sum = 0;
//		double avg = 0.0;
//		int count = 0;
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j <array[i].length; j++) {
//				sum += array[i][j];
//				count++;
//			
//		}avg = (double)sum /count;
//	}
//	System.out.println("sum" + sum);
//	System.out.printf("avg:%4.1f", avg);

		 boolean run = true;

		 int studentNum = 0;
		 int[] scores = null;
		 Scanner scanner = new Scanner(System.in);

		 while(run) {
		 System.out.println("--------------------------------------------------------------");
		 System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		 System.out.println("--------------------------------------------------------------");
		 System.out.print("선택> ");

		 int selectNo = scanner.nextInt();

		 if(selectNo == 1) {
		 System.out.print("학생수> ");
		 studentNum = scanner.nextInt();
		 scores = new int[studentNum];
		 } else if(selectNo == 2) {
			 for(int i=0; i<scores.length; i++) {
			 System.out.print("scores[" + i + "]> ");
			 scores[i] = scanner.nextInt();
			 }
		 } else if(selectNo == 3) {
			 for(int i=0; i<scores.length; i++) {
			 System.out.println("scores[" + i + "]: " + scores[i]);
			 }
		 } else if(selectNo == 4) {
			 int max = 0;
			 int sum = 0;
			 double avg = 0;
			 for(int i= 0; i<scores.length; i++) {
			 max = (max<scores[i])? scores[i] : max;
			 sum += scores[i];
			 }
			 avg = (double) sum / studentNum;
			 System.out.println("최고 점수: " + max);
			 System.out.println("평균 점수: " + avg);
		 } else if(selectNo == 5) {
			 run = false;
		 }
		}

		 System.out.println("프로그램 종료");
		}

	}

