package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
		customerManager.add("Arda sisteme kaydedildi");

	}

}
