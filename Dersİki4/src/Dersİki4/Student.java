package Dersİki4;
public class Student {
	String adi, soyadi;
	double num;
	public Student(String adi, String soyadi, double num) {
		super();
		this.adi = adi;
		this.soyadi = soyadi;
		this.num = num;
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
	public double getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getHarfNotu() {
        if (num >= 90) {
            return "A";
        } else if (num >= 80) {
            return "B";
        } else if (num >= 70) {
            return "C";
        } else if (num >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void show() {
        System.out.println("Öğrenci Adı: " + adi);
        System.out.println("Öğrenci Soyadı: " + soyadi);
        System.out.println("Ders Ortalaması: " + num);
        System.out.println("Harf Notu: " + getHarfNotu());
    }
}

