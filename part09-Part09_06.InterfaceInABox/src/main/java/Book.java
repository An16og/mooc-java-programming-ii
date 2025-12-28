public class Book implements Packable{
    private String Anamr;
    private String Bname;
    private double w;

public Book(String author, String book, double w){
    this.Anamr=author;
    this.Bname=book;
    this.w= w;
}
public double weight(){
    return this.w;
}
@Override 
public String toString(){
    return(Anamr+": "+Bname);
}
}
