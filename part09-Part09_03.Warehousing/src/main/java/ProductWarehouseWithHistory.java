public class ProductWarehouseWithHistory extends ProductWarehouse {
private ChangeHistory change;

public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
    super(productName, capacity);
    super.addToWarehouse(initialBalance);
    this.change = new ChangeHistory();
    change.add(initialBalance);
    
}
@Override
public double takeFromWarehouse(double amount){
    if(super.getBalance()<amount){
        this.change.add(super.getBalance());
    return super.getBalance();}
    super.takeFromWarehouse(amount);
    change.add(super.getBalance());
    return super.getBalance();

    }

@Override
public void addToWarehouse(double amount){
    super.addToWarehouse(amount);
    change.add(super.getBalance());


}



//works just like the method in the Warehouse class, but we also record the changed state to the history. NB: the value recorded in the history should be the warehouse's balance after removing, not the amount removed!

public String history(){
    return change.toString();
}
public void printAnalysis(){
    System.out.println("Product: "+super.getName());
    System.out.println("History: "+history());
    System.out.println("Largest amount of product: " + this.change.maxValue());
    System.out.println("Smallest amount of product: "+ this.change.minValue()); 
    System.out.println("Average: "+this.change.average());  
}
}