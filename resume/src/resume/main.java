package resume;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------------Resume-------------------\n");
		
		biodata b = new biodata(); 
		result r = new result();
		cgpa c = new cgpa();
		workExperience w = new workExperience();
		talent t = new talent();
		workskills s = new workskills();
		
		
		System.out.println("Name : " + b.name + "\nMatric Number : " + b.matricno + "\nAge : " + b.age + "\nDOB : " + b.dob  + "\nNationality : " + b.nationality + "\nAddress : " + b.address + "\nContact Number : " + b.hp);
		System.out.println("Result in programming1 : " + r.result);
		c.displayCGPA();
		System.out.printf("Final CGPA is %.2f" , c.calculateCGPA());
		System.out.println("\nWork Experience :" + w.work);
		System.out.println("Talents :" +t.talent);
		System.out.println("\nWorking Skills :" +s.skills);
	}

}

