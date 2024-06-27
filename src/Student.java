import java.io.Serializable;
import java.util.ArrayList;

public class Student  extends Person implements GPA  {
    //private String name;
    private String rollNo;
   // private String email;
    private ArrayList<Subject>subjects;
    private double GPA;
    public Student(){

    }
    // public Student(String n,String r,String e,ArrayList<Subject>s){
    //   this.name=n;
    //   this.rollNo=r;
    //   this.email=e;
    //   this.subjects= s;
    // }
    public Student(String n,String r,String e){
        // this.name=n;
        
        super(n,e);
        this.rollNo=r;
        //this.email=e;
        this.subjects = new ArrayList<>();
        //this.subjects= s;
      }
    // public void setName(String n){
    //     this.name = n;
    // }
    public void setRollNo(String r){
        this.rollNo = r;
    }
    // public void setEmail(String e){
    //     this.email = e;
    // }
    public void setSubjects(ArrayList<Subject>s){
      this.subjects = s;
    }
    public void setGPA(double g){
        this.GPA = g;
    }
    // public String getName(){
    //     return this.name;
    // }
    public String getRollNo(){
        return this.rollNo;
    }
    // public String getEmail(){
    //     return this.email;
    // }
    public ArrayList<Subject> getSubjects(){
        return this.subjects;
    }
    public double getGPA(){
        return this.GPA;
    }
    public void addSubject(Subject s){
        this.subjects.add(s);
    }
    public String toString(){
        return String.format("%s|%s|%s", super.getName(),this.rollNo,super.getEmail());
    }
}
