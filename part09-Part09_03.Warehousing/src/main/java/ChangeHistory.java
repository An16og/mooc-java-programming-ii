import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double>list;

public ChangeHistory(){
    
    this.list= new ArrayList<>();

}
public void add(double status){
    list.add(status);
}
public void clear(){
    list.clear();
}
@Override
public String toString(){
    return list.toString();
}
public double maxValue(){
    double temp =0;
    if(list.isEmpty()){
    temp=0;
        
    }
    else{
    temp =list.get(0);}
    for (double i:list){
        if(i>temp){
            temp=i;
        }
    }
    return temp;
}
//returns the largest value in the change history. If the history is empty, the method should return zero.
public double minValue(){
  double temp =0;
    if(list.isEmpty()){
    temp=0;
        
    }
    else{
    temp =list.get(0);}
        for (double i:list){
        if(i<temp){
            temp=i;
        }
    }
    return temp;

}
 //returns the smallest value in the change history. If the history is empty, the method should return zero.
public double average(){
    double temp= 0.0;
        for (double i:list){
        temp+=i;
        }
    if(list.isEmpty()){
    return 0;
        
    }
    else{
        return temp/list.size();
    }
    
}
}



