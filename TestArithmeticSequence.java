import java.util.*;
abstract class Sequence {
	
	abstract int calculateNthElement(int term);
	
}

class ArithmeticSequence extends Sequence {
	
	private int firstNumber;
	private int commonDifference;
	
	public ArithmeticSequence (int firstNumber, int commonDifference) {
		
		this.firstNumber = firstNumber;
		this.commonDifference = commonDifference;
		
	}
	
	public void setFirstNumber(int firstNumber) {
		
		this.firstNumber = firstNumber;
		
	}
	
	public void setCommonDifference(int commonDifference) {
		
		if (commonDifference > 0 ) {
			
			this.commonDifference = commonDifference;
		
		}
		
	}
	
	public int getFirstNumber() {
		
		return firstNumber;
		
	}
	
	public int getCommonDifference() {
		
		return commonDifference;
		
	}
	
	@Override
	public int calculateNthElement(int term) {
		
		return firstNumber + (term - 1) * commonDifference; // a+(n - 1)d
		
	}
	
}

class GeometricSequence extends Sequence{
	
	private int firstNumber;
	private int commonRatio;
	
	public GeometricSequence (int firstNumber, int commonRatio) {
		
		this.firstNumber = firstNumber;
		this.commonRatio = commonRatio;
		
	}
	
	public void setFirstNumber(int firstNumber) {
		
		this.firstNumber = firstNumber;
		
	}
	
	public void setCommonRatio(int commonRatio) {
		
		if (commonRatio > 0 ) {
			
			this.commonRatio = commonRatio;
		
		}
		
	}
	
	public int getFirstNumber() {
		
		return firstNumber;
		
	}
	
	public int getCommonRatio() {
		
		return commonRatio;
		
	}
	
	
	@Override
	public int calculateNthElement(int term) {
		
		return firstNumber * (int)Math.pow(commonRatio,term - 1);
		
	}
	
}
	

public class TestArithmeticSequence {
	
	public static void main (String...args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the first element of the sequence : ");
		int firstNumber = sc.nextInt();
			
		System.out.print("Enter the term you want to find : ");
		int term = sc.nextInt();
		
		System.out.print ("\nDo you want to find this in Arithmetic or Geometric sequences (type a / g) : ");
		String type = sc.next();
		
		if (type.equalsIgnoreCase("a")) {
			
			System.out.print("\nEnter the common difference of the arithmetic sequence : ");
			int commonDifference = sc.nextInt();
			
			ArithmeticSequence as = new ArithmeticSequence(firstNumber,commonDifference);
			System.out.println ("The "+term+"'th element is : "+as.calculateNthElement(term));
			
		} else if (type.equalsIgnoreCase("g")) {
			
			System.out.print("\nEnter the common ratio of the geometric sequence : ");
			int commonRatio = sc.nextInt();
		
			GeometricSequence gs = new GeometricSequence(firstNumber,commonRatio);
			System.out.println ("The "+term+"'th element is : "+gs.calculateNthElement(term));
			
		} else {
			
			System.out.println ("Invalid choice!");
			
		}
		
	}
	
}