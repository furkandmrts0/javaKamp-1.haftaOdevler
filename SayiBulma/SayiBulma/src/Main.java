import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] dizi = new int[] {10,21,30,11,4,44,6};
		
		System.out.println("aranacak sayiyi giriniz");
		int aranacakSayi=input.nextInt();
		boolean varMi = false;
		for (int sayi : dizi) {
		if(aranacakSayi==sayi) {
			varMi=true;
		break;
		}
		}
		if(varMi==true)
			System.out.println("sayi mevcuttur");
		else
			System.out.println("sayi mevcut degildir");
	}

}
