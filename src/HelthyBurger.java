
public class HelthyBurger extends Hamburger {

	private String healthyExtra1Name;
	private double healthyExtra1Price;
	
	private String healthyExtra2Name;
	private double healthyExtra2Price;
	
	public HelthyBurger(String meat, double price) {
		super("Healthy", "brow rye", meat, price);
	}
	
	public void addHealthAddition1(String name, double price){
		this.healthyExtra1Name = name;
		this.healthyExtra1Price = price;
		System.out.println(this.healthyExtra1Name + " - " +this.healthyExtra1Price );

	}
	
	public void addHealthAddition2(String name, double price){
		this.healthyExtra2Name = name;
		this.healthyExtra2Price = price;
		System.out.println(this.healthyExtra2Name + " - " +this.healthyExtra2Price );

	}

	@Override
	public double itemizeHamburguer() {

		double priceHamburger =  super.itemizeHamburguer();
		if(this.healthyExtra1Name!=null){
			priceHamburger+=this.healthyExtra1Price;
		}
		if(this.healthyExtra2Name!=null){
			priceHamburger+=this.healthyExtra2Price;
		}
		return priceHamburger;
	}

	
}

