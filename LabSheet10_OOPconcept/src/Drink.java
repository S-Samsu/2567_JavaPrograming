
public class Drink {
	private int type;
	private char size;
	
	Drink(int type, char size){
		this.type = type;
		this.size = size;
	}
	
	Drink(){
		
	}

	public String getTypeName() {
		if(this.type == 1) {
			return "Hot";
		}if(this.type == 2) {
			return "Cold";
		}else {
			return null;
		}
	}
	
	public int getTypePrice() {
		if(this.type == 1) {
			return 10;
		}if(this.type == 2) {
			return 20;
		}else {
			return 0;
		}
	}
	
	public String getSizeName() {
		if(this.size == 'S') {
			return "Small";
		}if(this.size == 'M') {
			return "Medium";
		}if(this.size == 'L') {
			return "Large";
		}else {
			return null;
		}
	}
	
	public int getSizePrice() {
		if(this.size == 'S') {
			return 15;
		}if(this.size == 'M') {
			return 20;
		}if(this.size == 'L') {
			return 25;
		}else {
			return 0;
		}
	}
	
	public int getTotalPrice() {
		return getSizePrice()+getTypePrice();
	}
	
}
