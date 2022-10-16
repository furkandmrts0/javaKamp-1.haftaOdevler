import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("1. Sayiyi giriniz");
		int sayi1=input.nextInt();
		System.out.println("2. sayiyi giriniz");
		int sayi2=input.nextInt();
		System.out.println("3. sayiyi giriniz");
	int sayi3=input.nextInt();
	
	int enBuyuk=sayi1;
	if(enBuyuk<sayi2) 
		enBuyuk=sayi2;
	if (enBuyuk<sayi3)
		enBuyuk=sayi3;

	System.out.println("en buyuk sayi : " + enBuyuk);
}
}