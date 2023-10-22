package Dersİki3;

public class AnaSayfa {

	public static void main(String[] args) {
		Account person1 = new Account("Sude", "Öztürk", 5);
		Account person2 = new Account("Zemzem", "Cabbar", 10);
		System.out.println(person1.getAdi());
		System.out.println(person2.getPara());
		// person1.setPara(15); kapsül içine almak, Accountta private yaptık
		System.out.println(person1.getPara());
		person1.bakiye(100);
		System.out.println(person1.getPara());
	}
}
