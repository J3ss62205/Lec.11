package cs141.jlhenry2;

public class GradeCalc {
	
	public static void main(String[] args) {
		
		String[] hw = {"Homework: 1", "Homework: 2", "Homework: 3", "Homework: 4", "Homework: 5", "Homework: 6", "Homework: 7", "Homework: 8", "Homework: 9", "Homework: 10"};
		
		int[][] grades = new int[][] {
			{100, 60, 89, 18, 30, 79, 80, 99, 87, 67}, 
			{10,20,30,40,50,60,70,80,90,100},
			{29,37,57,86,92,84,65,66,88,99},
			{100,100,100,100,47,79,57,69,100,1},
			{25,35,45,55,65,75,85,77,79,78},
			{10, 60, 9, 19, 30, 79, 80, 90, 87, 67}, 
			{1,2,79,45,50,60,70,80,90,100},
			{29,37,57,86,2,84,65,66,8,99},
			{100,100,10,19,47,79,57,69,100,1},
			{25,35,45,55,65,80,85,77,79,78}};
			
		double[] avg = new double[hw.length];
		
		for (int i = 0; i < hw.length; i++) {
			for (int j = 0; j < grades[i].length; j++) {
				avg[i] = avg[i] + grades[i][j];
			}
			avg[i] = avg[i] / grades[i].length;
			System.out.printf("%-15s average is: %4.2f \n", hw[i], avg[i]);

		}
					
	}
}

