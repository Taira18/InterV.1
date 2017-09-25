import java.util.ArrayList;

public class ShoppingCart implements Cart {
	private int am;
	private double add;
	private double tax;
	private double shipAdd;
	String f;
	ArrayList<SelectedItem> index = new ArrayList<SelectedItem>();
	
	public void addItem(SelectedItem newItem) {
		for (int i = 0; i < index.size(); i++) {
			if (index.get(i).getItemNumber() == newItem.getItemNumber() ){
				am = newItem.getQuantity();
				newItem.setQuantity(am + newItem.getQuantity());
			}
		}
	}

	public void deleteItem(int deleteItemNumber) {
		//index.remove(deleteItemNumber);
	}

	public double getTotal() {
		for (int i = 0; i < index.size(); i++) {
			add = add + index.get(i).getUnitPrice();

		}
		return add;
	}

	public double getTax() {
		tax = 0.045 * add;
		return tax;
	}


	public double getShipping() {
		if (add < 10) {
			shipAdd = 2.5;
		} else if (add > 10) {
			shipAdd = add * .15;
		}
		return shipAdd;
	}
	public String toString() {
		for (int i = 0; i < index.size(); i++) {
			f = "Item: " + index.get(i).getDescription()+"Quantity: "+index.get(i).getQuantity();
			System.out.println(f);
		}
		return f;
	}
}
