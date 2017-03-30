
public class DeluxeBurger extends Hamburger{

	public DeluxeBurger() {
		super("Deluxe", "white", "sausage", 4.20);	
		super.addHamburgerAddiciton("chips", 9.43);
		super.addHamburgerAddiciton2("refri", 3.22);
	}

	@Override
	public void addHamburgerAddiciton(String name, double price) {
		System.out.println("Não pode");
	}

	@Override
	public void addHamburgerAddiciton2(String name, double price) {
		System.out.println("Não pode");
	}

	@Override
	public void addHamburgerAddiciton3(String name, double price) {
		System.out.println("Não pode");
	}

	@Override
	public void addHamburgerAddiciton4(String name, double price) {
		System.out.println("Não pode");
	}
	

	
}
