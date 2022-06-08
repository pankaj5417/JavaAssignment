package studentPackage;

public class Student {
//	private int roll;
//	private String name;
//	private int age;
//	private int marks;
	
	private String name;
	private int[] marks;
	
	Student(String name,int[] marks){
		this.name=name;
		this.marks=marks;

	}
	public int getNumberOfMarks() {
		return marks.length;
	}
	
	public int getTotalSumOfMarks() {
		int sum=0;
		for(int x:marks) {
			sum+=x;
		}
		return sum;
	}
	
	public int getMaximumMarks() {
		int max=-99999;
		for(int x:marks) {
			if(x>max)
			max=x;
		}
		return max;
	}
	
	public int getMinimumMarks() {
		int min=99999;
		for(int x:marks) {
			if(x<min)
			min=x;
		}
		return min;
	}
//	public void setAge(int age) {
//		if(age>18 && age <60) {
//			this.age=age;
//		}
//		
//	}
//	
//public int getAge() {
//		return age;
//	}
//
//
//
//public void setMarks(int marks) {
//	if(marks>0 && marks <500) {
//		this.marks=marks;
//	}
	
//}
//
//public int getMarks() {
//	return marks;
//}
}
