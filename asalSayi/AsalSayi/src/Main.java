import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("sorgulanacak sayiyi giriniz");
		int sayi=input.nextInt();
		boolean sorgu =true;
		if(sayi<1) {
			System.out.println("gecersiz sayi tekrar deneyiniz");
		return;
		}
		if(sayi==1){
			System.out.println("ozel durum sayi asal degildir");
		return;
		}
		
		else {
		for (int i = 2; i < sayi; i++) {
			if(sayi%i==0) 
				sorgu=false;	
		}
		
		
		if(sorgu==true)
			System.out.println("sayi asaldir");
		else
			System.out.println("sayi asal degildir");

		}
		}

}
