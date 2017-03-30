
public class Hamburger {

	private String name;
	private String breadNormal;
	private String meat;
	private double price;
	
	private String addition1Name;
	private double addiion1Price;
	
	private String addition2Name;
	private double addiion2Price;
	
	private String addition3Name;
	private double addiion3Price;
	
	private String addition4Name;
	private double addiion4Price;
	
	
	
	public Hamburger(String name, String breadNormal, String meat, double price) {
		super();
		this.name = name;
		this.breadNormal = breadNormal;
		this.meat = meat;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreadNormal() {
		return breadNormal;
	}

	public void setBreadNormal(String breadNormal) {
		this.breadNormal = breadNormal;
	}

	public String getMeat() {
		return meat;
	}

	public void setMeat(String meat) {
		this.meat = meat;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void addHamburgerAddiciton(String name, double price){
		this.addiion1Price = price;
		this.addition1Name = name;
		
		System.out.println(this.addition1Name + " - " +this.addiion1Price );
	}
	
	
	public void addHamburgerAddiciton2(String name, double price){
		this.addiion2Price = price;
		this.addition2Name = name;
		System.out.println(this.addition2Name + " - " +this.addiion2Price );

	}
	
	
	public void addHamburgerAddiciton3(String name, double price){
		this.addiion3Price = price;
		this.addition3Name = name;
		System.out.println(this.addition3Name + " - " +this.addiion3Price );

	}
	public void addHamburgerAddiciton4(String name, double price){
		this.addiion4Price = price;
		this.addition4Name = name;
		System.out.println(this.addition4Name + " - " +this.addiion4Price );

	}
	public double itemizeHamburguer(){
		double hamburgerPrice = this.price;
		System.out.println(this.name + " with " + this.getMeat()+ " and " + this.breadNormal +" - " +this.price );

		if(this.addition1Name !=null){
			hamburgerPrice+=this.addiion1Price;
		}
		if(this.addition2Name !=null){
			hamburgerPrice+=this.addiion2Price;
		}
		if(this.addition3Name !=null){
			hamburgerPrice+=this.addiion3Price;
		}
		if(this.addition4Name !=null){
			hamburgerPrice+=this.addiion4Price;
		}
		return hamburgerPrice;
	}
}
