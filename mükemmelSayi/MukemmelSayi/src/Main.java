import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
System.out.println("sorgulanacak sayiyi giriniz");
int sayi = input.nextInt();
int toplam=0;
for (int i = 1; i < sayi; i++) {
	if(sayi%i==0)
		toplam=toplam+i;
	
}
if (toplam==sayi) 
	System.out.println("girdiginiz sayi mukemmel sayidir");

else
	System.err.println("girdiginiz sayi mukemmel sayi degildir");
	}

}
