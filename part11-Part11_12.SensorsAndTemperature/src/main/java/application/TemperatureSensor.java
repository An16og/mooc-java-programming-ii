package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{
    private int reading;
    private boolean state=false;
public TemperatureSensor(){}

public boolean isOn(){
    return state;
}    // returns true if the sensor is on
   public void setOn(){
        state=true;
    }      // sets the sensor on
    public void setOff(){
        state=false;
    }     // sets the sensor off
    public int read(){
        if(!state){
            throw new IllegalStateException("Turn on the sensor");
        }
        return new Random().nextInt(61)-30;
    }        // returns the value of the sensor if it's on
    




}
