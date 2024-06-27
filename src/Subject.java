//import java.util.ArrayList;

public class Subject implements TotalMarks {
    // private ArrayList<Quiz> quiz;
    // private ArrayList<Assignment> a;
    private String name;
    private double totalMarks;
    private double gpa;
    private String teacher;
    private int attendance;
    public Subject(){

    }
    // public Subject(String t,int attend,double m){
    //    this.teacher = t;
    //    this.attendance = attend;
    //    this.totalMarks = m;
    // }
    public Subject(String n,String t){
        this.name = n;
        this.teacher = t;
    }
    public void setTeacherName(String t){
        this.teacher = t;
    }
    public void setAttendence(int a){
        this.attendance = a;
    }
    public void setTotalMarks(double t){
        this.totalMarks = t;
    }
    public void setGPA(double g){
        this.gpa = g;
    }
    public String getName(){
        return this.name;
    }
    public String getTeacherName(){
        return this.teacher ;
    }
    public int getAttendence(){
        return this.attendance ;
    }
    public double getTotalMarks(){
        return this.totalMarks ;
    }
    public double getGPA(){
        return this.gpa;
    }
    // public String toString(){
    //     return String.format("%", null)
    // }

}
