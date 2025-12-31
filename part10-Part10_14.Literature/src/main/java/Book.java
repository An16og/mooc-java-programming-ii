import java.util.Comparator;

public class Book {
private String name;
private int age;

public Book(String name, int age){
    this.name=name;
    this.age=age;
}
public String getname(){
    return this.name;
}
public int getAge(){
    return this.age;
}
@Override 
public String toString(){
    return name+" (recommended for "+age+" year-olds or older)";
}
}
