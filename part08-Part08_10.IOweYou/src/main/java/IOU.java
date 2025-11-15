import java.util.HashMap;

public class IOU {
    private HashMap<String, Double>IOU;
    
    public IOU() {
       this.IOU = new HashMap<>();
    }
    public void setSum(String toWhom, double amount){
        IOU.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        return IOU.get(toWhom);
    }
}
