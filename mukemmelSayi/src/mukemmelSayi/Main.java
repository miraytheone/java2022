package mukemmelSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz.");
		num = scan.nextInt();
		
		for(int i = 1; i<num;i++) {
			if(num % i == 0) {
				sum = sum + i;
			}
		}
		
		if(sum  == num ) {
			System.out.println(num + " mükemmel sayıdır.");
		}
		else {
			System.out.println(num + " mükemmel sayı değildir.");
		}
	}

}
