import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("---Calisanlar Programina Hosgeldiniz---");
		
		String islemler = "-Ýslemler-\n"
						+ "1)Yazilimci Islemleri\n"
						+ "2)Yonetici Islemleri\n"
						+ "3)Cikis icin \"q\" basin";
		System.out.println(islemler);
		System.out.println("***********************");
		
		while(true)
		{
			System.out.println("Islemi Seciniz");
			String islem = input.nextLine();
			if(islem.equals("q"))
			{
				System.out.println("Programdan Cikiliyor...");
				break;
			}
			else if(islem.equals("1"))
			{
				Yazilimci yazilimci = new Yazilimci("Omer", "Ogutlu", 1406 ,"C , Java");
				String yazilimciIslem ="--Yazilimci Islemleri--\n" 
									  +	"1. Format At\n"
									  + "2. Bilgileri Goster\n"
									  + "Cikis icin \"q\" basin\n";
				System.out.println(yazilimciIslem);
				while(true)
				{
					System.out.println(" Yazilimci Islemi Seciniz");
					String yazilimci_islem = input.nextLine();
					if(yazilimci_islem.equals("q"))
					{
						System.out.println("Yazilimcidan cikiliyor.");
						break;
					}
					else if(yazilimci_islem.equals("1"))
					{
						System.out.println("Isletim Sistemi : ");
						String isletim_sistemi = input.nextLine();
						yazilimci.formatAt(isletim_sistemi);
					}
					else if(yazilimci_islem.equals("2"))
					{
						yazilimci.BilgileriYaz("Omer", "Ogutlu", 1406, "C , Java");
					}
					else
					{
						System.out.println("Gecersiz islem..");		
					}
				}
			}
			else if(islem.equals("2"))
			{
				Yonetici yonetici = new Yonetici("Omer", "Ogutlu", 1406, 20);
				String yoneticiIslem ="--Yonetici Islemleri--\n" 
						  +	"1. Zam Yap\n"
						  + "2. Bilgileri Goster\n"
						  + "Cikis icin \"q\" basin\n";
				System.out.println(yoneticiIslem);
				while(true)
				{
					System.out.println(" Yonetici Islemi Seciniz");
					String yonetici_islem = input.nextLine();
					if(yonetici_islem.equals("q"))
					{
						System.out.println("Yoneticiden cikiliyor.");
						break;
					}
					else if(yonetici_islem.equals("1"))
					{
						System.out.println("Zam Miktari : ");
						int zamMiktari = input.nextInt();
						input.nextLine();
						
						yonetici.ZamYap(zamMiktari);
					}
					else if(yonetici_islem.equals("2"))
					{
						yonetici.BilgileriYaz("Omer", "Ogutlu", 1406, 20);
					}
					else
					{
						System.out.println("Gecersiz islem..");
						
					}		
				}
			}
			else
			{
				System.out.println("Gecersiz islem..");
				 
			}	
		}
	}
}
