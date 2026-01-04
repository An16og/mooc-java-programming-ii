public class List<Type> {
private Type[] values;
private int firstFreeIndex;

public List(){
    this.values= (Type[]) new Object[10];
    firstFreeIndex=0;
}



public void add(Type value){
    if(firstFreeIndex==values.length){
        grow();
    }
    values[firstFreeIndex]=value;
    firstFreeIndex++;
}
public void grow(){
int newSize= firstFreeIndex+ firstFreeIndex/2;
Type[] newVal = (Type[]) new Object[newSize];
for(int i=0;i<firstFreeIndex;i++){
    newVal[i]=values[i];
}
this.values=newVal;
}
public boolean contains(Type value){
    return indexOfValue(value)>=0;
}

public void remove(Type value){
    int t=indexOfValue(value);
    if(t<0){return;}
values[t]=null;
shiftValuesLeft(t);



}
public int indexOfValue(Type value){
    for(int i=0;i<firstFreeIndex;i++){
    if(values[i].equals(value)){
        return i;
    }}
    return -1;
}
public void shiftValuesLeft(int FromIndex){
for(int i=FromIndex;i<firstFreeIndex;i++){
    values[i]=values[i+1];
}
firstFreeIndex--;
}
public int size(){
return firstFreeIndex;
}
}
