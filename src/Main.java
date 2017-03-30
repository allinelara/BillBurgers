
public class Main {

	public static void main(String[] args) {
		Hamburger h = new Hamburger("Basic", "white", "sausage", 4.23 );
		h.addHamburgerAddiciton("tomato", 1.22);
		h.addHamburgerAddiciton3("corn", 2.99);
		double price = h.itemizeHamburguer();
		System.out.println("Total "+ price);
	
		HelthyBurger hh = new HelthyBurger("bacon", 3.24);
		hh.itemizeHamburguer();
		
		hh.addHamburgerAddiciton("egg", 4.99);
		hh.itemizeHamburguer();
		hh.addHealthAddition1("lentils", 2);
		
		System.out.println("Total "+ hh.itemizeHamburguer());

		DeluxeBurger hd = new DeluxeBurger();
		hd.addHamburgerAddiciton("Não", 2);
		
		System.out.println("Total "+ hd.itemizeHamburguer());

	}
}