import java.util.ArrayList;

public class Pipe <T>{
private ArrayList<T> pipe= new ArrayList<>();

public Pipe(){}
public void putIntoPipe(T value){
    pipe.add(value);
}
public T takeFromPipe(){
    
    return pipe.remove(0);
}
public boolean inInPipe(){
    if(pipe.isEmpty()){return false;}
    return true;
}
}
