public class Person {
    private String name;
    private String add;

public Person(String name,String add){
    this.name=name;
    this.add=add;
}
public String getName(){
    return name;
}
public String GetAdd(){
    return add;
}

@Override
public String toString(){
   return name + '\n' + "  " + add; 
}
}
