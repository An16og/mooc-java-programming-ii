import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
 private ArrayList<Person> list;

public Employees(){
    this.list= new ArrayList<>();
}
public void add(Person personToAdd){
    list.add(personToAdd);
} 
public void add(List<Person> peopleToAdd){
    peopleToAdd.stream()
    .forEach(people->list.add(people));
} //adds the given list of people to the employees list
public void print(){
    Iterator<Person> iterator= list.iterator();
    while (iterator.hasNext()) {
        System.out.println(iterator.next());
    }
   // list.stream()
   // forEach(person->System.out.println(person));
} 
public void print(Education education){
    Iterator<Person> iterator= list.iterator();
    while (iterator.hasNext()) {
        Person person = iterator.next();
        if(person.getEducation().equals(education)){
            System.out.println(person);
        }
    }
    //list.stream()
    //.filter(person->person.getEducation().matches(education))
    //.forEach(System.out::println);
}
public void fire(Education education){
    Iterator<Person> iterator= list.iterator();
    while (iterator.hasNext()) {
        if(iterator.next().getEducation().equals(education)){
            iterator.remove();
        }
    }
}
// prints the employees whose education matches the education given as a parameter.
}
