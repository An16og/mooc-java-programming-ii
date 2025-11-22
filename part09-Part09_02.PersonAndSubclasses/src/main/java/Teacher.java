public class Teacher extends Person{
   private int Salary;
    
    public Teacher(String name, String add,int Salary){
        super(name, add);
        this.Salary=Salary;
    }
    public int getSalary() {
		return Salary;
	}
    @Override
    public String toString(){
        return super.getName() + '\n' + "  " + super.GetAdd()+ '\n' + "  "+"salary " + Salary+" euro/month";
    }

}
