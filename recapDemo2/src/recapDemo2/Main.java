package recapDemo2;

public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2,1.3,4.3,5.6};
		double sum = 0;
		double max = myList[0];
		
		for(double  number :myList) {
			if (max < number) {
				max = number;
			}
			
			sum = sum + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam= " + sum);
		System.out.println("Maximum değer= " + max);
	}

}
