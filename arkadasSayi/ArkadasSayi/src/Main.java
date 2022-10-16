import java.util.Iterator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("birinci sayiyi giriniz");
		int sayi1=input.nextInt();
		System.out.println("ikinci sayiyi giriniz");
		int sayi2=input.nextInt();
		int toplam1 = 0,toplam2=0;
		for (int i = 1; i <sayi1; i++) {
			if (sayi1%i==0) 
				toplam1+=i;
			
		}
		for (int j = 1; j <sayi2; j++) {
			if (sayi2%j==0) 
				toplam2+=j;
			
		}
		if (sayi1==toplam2 && sayi2==toplam1) 
			System.out.println("sayilar arkadas sayilardir");
		else
			System.out.println("sayilar arkadas sayilar degildir");


	}

}
