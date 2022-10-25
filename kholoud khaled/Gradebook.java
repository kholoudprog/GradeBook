package hello;

public class Gradebook {
float grade1 ;
float grade2 ;
float grade3 ;

public Gradebook(float g1,float g2,float g3) {
	grade1=g1;
	grade2=g2;
	grade3=g3;
}
public float sum() {
	float res=(grade1+grade2+grade3);
	  return res; 
}
public float rate() {
	float avg=(sum()/3);
	 
     return avg;
}

	public void print() {
		System.out.println("grade of subject 1 : "+ grade1);
		System.out.println("grade of subject 2 : "+ grade2);
		System.out.println("grade of subject 3 : "+ grade3);
		
		
	}
	
}















