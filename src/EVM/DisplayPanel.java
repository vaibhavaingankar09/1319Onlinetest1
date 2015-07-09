package EVM;

public class DisplayPanel {
	
	int numberofdigit;
	int value;
	
	
	DisplayPanel(int numberofdigit, int value) {
		this.numberofdigit = numberofdigit;
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getNumberofdigit() {
		return numberofdigit;
	}
	
	
}
