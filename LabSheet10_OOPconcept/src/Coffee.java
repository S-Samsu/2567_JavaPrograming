
public class Coffee extends Drink{
	private int typeCoffee;
	private char sizeCoffee;
	private Barista barista;
	
	Coffee(int type , char sizeCoffee , int typeCoffee , Barista barista) {
		super(type,sizeCoffee);
		//this.sizeCoffee = sizeCoffee;
		this.typeCoffee = typeCoffee;
		this.barista = barista;
	}
}
