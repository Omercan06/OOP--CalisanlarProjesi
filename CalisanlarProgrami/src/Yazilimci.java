
public class Yazilimci extends Calisan {

	private String diller;
	
	public Yazilimci(String ad,String soyad,int id,String diller)
	{
		super(ad,soyad,id);
		this.diller = diller;
	}
	
	public void formatAt(String isletimSistemi)
	{
		System.out.println(getAd() + " " + isletimSistemi + " yukluyor.");
		
	}
	public void BilgileriYaz(String ad, String soyad, int id,String diller) {
        super.BilgileriYaz(ad, soyad, id);  
        System.out.println("Bildigi Diller : " + diller);
    }
	
	
}
