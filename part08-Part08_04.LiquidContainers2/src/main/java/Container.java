public class Container {
    private int vol;

public Container(){
    this.vol=0;
}
public int contains(){
    return vol;
}
public void add(int amount){
    if(amount>0){
    vol+=amount;
    if(vol>100){vol=100;}}
}
public void remove(int amount){
    if(amount>0){
    vol-=amount;
    if(vol<0){vol=0;}}
}
public String toString(){
    return vol+"/100";
}
}
