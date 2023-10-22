package Dersİki3;

public class Account {
	String adi, soyadi;
	int para;
	public Account(String adi, String soyadi, int para) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
		this.para = para;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public int getPara() {
		return para;
	}
	private void setPara(int para) { //aynı class içi görür farklı classtan ulaşılamaz
		this.para = para;
	}
	public void bakiye(int a) {
		this.para = this.para+a;
		setPara(this.para); 
	}
}