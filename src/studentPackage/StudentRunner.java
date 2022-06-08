package studentPackage;

public class StudentRunner {
	public static void main(String[] args) {
		
//		Student Rahul=new Student();
//		Student Sahil=new Student();
		
		
      int[] marks = {97, 99, 100};
		
		Student student = new Student("Mohan", marks);
		
		// length of marks array
		int number = student.getNumberOfMarks();
		System.out.println("Number Of Marks "+number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of Marks "+sum);
		
		int maxMark = student.getMaximumMarks();
	    System.out.println("Max Mark "+maxMark);	
		int minMark = student.getMinimumMarks();
		System.out.println("Minimum Mark "+minMark);
				
		//BigDecimal average = student.getAverageMarks();
//		
//		Rahul.setAge(19);
//		Sahil.setAge(23);
//		Rahul.setMarks(100);
//		Sahil.setMarks(120);
//		int rahulAge=Rahul.getAge();
//		System.out.println(rahulAge);
		
				
				

	}
}
