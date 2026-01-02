package application;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.List;

public class AverageSensor implements Sensor{
   private ArrayList<Sensor>list=new ArrayList<>();
   private ArrayList<Integer>reading=new ArrayList<>();
   
   public void addSensor(Sensor toAdd){
    list.add(toAdd);
   }

   public List<Integer> readings(){
   return this.reading;}
   @Override
    public boolean isOn(){
        return list.stream()
        .allMatch(Sensor::isOn);
    };    // returns true if the sensor is on
   public void setOn(){
   list.stream().forEach(x->x.setOn());};      // sets the sensor on
   public void setOff(){
       list.stream().forEach(x->x.setOff());};      // sets the sensor on

   ;     // sets the sensor off
   public int read(){
    if(!this.isOn()||list.isEmpty()){
        throw new IllegalStateException("Khel khatam beta");
    }
  int a= (int) list.stream().mapToInt(x->x.read()).average().getAsDouble();
    reading.add(a);
    return a;

};        // returns the value of the sensor if it's on
    
}
