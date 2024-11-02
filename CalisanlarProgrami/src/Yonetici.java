
public class Yonetici extends Calisan{
	
	private int SorumluKisiSayi;
	
	public Yonetici(String ad,String soyad,int id,int SorumluKisiSayi)
	{
		super(ad,soyad,id);
		this.SorumluKisiSayi = SorumluKisiSayi;
		
	}

   

	public  void ZamYap(int zam)
	{
		System.out.println(getAd() + " calisanlara " + zam + " tl zam yapiyor.");
	}
	
	 
    public void BilgileriYaz(String ad, String soyad, int id,int SorumluKisiSayi) {
        super.BilgileriYaz(ad, soyad, id);  
        System.out.println("Sorumlu Kisi Sayisi : " + SorumluKisiSayi);
    }
	

}
