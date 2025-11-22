public class ProductWarehouse extends Warehouse{
    private String name;

    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.name=productName;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name=newName;
    }
public String toString(){
    String s= name+": balance = "+super.getBalance()+", space left "+super.howMuchSpaceLeft();
    return s;

}
}