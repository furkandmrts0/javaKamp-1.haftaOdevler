import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("sorgulamak istediginiz harfi giriniz");
		char harf=input.next().charAt(0);
		
		switch (harf) {
		case 'A':
		case 'a':
		case 'ı':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("girilen harf kalin seslidir");
			break;
		case 'e':
		case 'E':
		case 'i':
		case 'İ':
		case 'ö':
		case 'Ö':
		case 'ü':
		case 'Ü':
			System.out.println("girilen harf ince seslidir");
			break;
		default:
			System.out.println("yanlis harf girdiniz tekrar deneyiniz ");
			break;
		}
	}

	

}
