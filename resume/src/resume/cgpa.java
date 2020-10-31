package resume;

public class cgpa {
	double[] gpa = {3.21, 3.53};
	double total = 0;
	double average;
	

	public void displayCGPA() {
		System.out.println("\nCGPA");
		System.out.println("Sem 1 : " + gpa[0]);
		System.out.println("Sem 2 : " + gpa[1]);
		
		//System.out.printf("Final CGPA is %.2f" , average);
	}
	
	
	public double calculateCGPA() {
		for (int i = 0; i < gpa.length; i++) {
			total+= gpa[i]; 
		}

		
		if (gpa.length != 0) {
			average = total/gpa.length;
		} else {
			average = 0.0;
		}
		return average;
	}	

}
