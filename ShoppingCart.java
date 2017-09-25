import java.util.*;
public class ShoppingCart implements Cart {
    private double sum;
    private double psum;
    private double tax;
    private double ship;
    
    ArrayList<SelectedItem> index = new ArrayList<SelectedItem>();

    
    public ShoppingCart(){
    }
    public void addItem(SelectedItem newItem) {
    	index.add(newItem);
        for (int i=0;i<index.size();i++){
        	if(index.get(i).getItemNumber() == index.get(i).getItemNumber()){
            	index.get(i).setQuantity(index.get(i).getQuantity());
            }
        }
    }

    public void deleteItem(int deleteItemNumber) {            
    		for(int i = 0;i<index.size();i++)
            	if (index.get(i).getItemNumber() == deleteItemNumber){
                	index.remove(i);
                }
     }

    public double getpsum() {
        for(int i = 0; i<index.size();i++ ){
        psum = psum + (index.get(i).getQuantity() * index.get(i).getUnitPrice());
        }
        return psum;
    } 
    public double getTax() {
    	tax = psum * 0.045;
        return tax;
    }
    public double getShipping() {
        if(psum <= 10){
           ship = 2.5;
        }
        else{
            ship = psum*0.15;    
        }
		return ship;
    }
    public String toString(){
    	sum = psum + tax + ship;
        for(int i = 0;i<index.size();i++){
        System.out.print("Item: " + index.get(i).getDescription() + "\n" + "Quantity: " + index.get(i).getQuantity() + "\n" + "Unit Price: $" + index.get(i).getUnitPrice() +"\n" + "Total Price: $" +index.get(i).getQuantity() * index.get(i).getUnitPrice() + "\n" + "\n");
        }
        return "Total: " + psum + "\n" + "Tax: " + tax +"\n" + "Shipping: " + ship +"\n" + "Grand total: " + sum;
    }
 
}
