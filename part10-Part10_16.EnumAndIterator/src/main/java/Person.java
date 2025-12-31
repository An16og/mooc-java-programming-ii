public class Person {
private String name;
private Education study;

public Person(String name, Education study){
    this.name=name;
    this.study=study;
}
public Education getEducation(){
    return this.study;
}
@Override 
public String toString(){
    return name+", "+study;
}
}
