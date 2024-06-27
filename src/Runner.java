import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        

        ArrayList<Student> studentsList = studentObjects();
        studentsList = students(studentsList);
        
        System.out.println("marks"+studentsList.get(12).getSubjects().get(0).getTotalMarks());

        myFrame frame = new myFrame(studentsList);
    }
//TAKING DATA FROM FILE AND MAKING OBJECTS
    public static ArrayList<Student> studentObjects(){
        ArrayList<Student> studentsList = new ArrayList<>();
        String line;
        int count = 0;
        int i = -2;
        String filePath = "studentinfo.txt"; 
        // Replace "books.txt" with the path to your file
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                while ((line = reader.readLine()) != null){
                    count++;
                }
                reader.close();
                System.out.println(count);
               
            }
            catch(IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
            
              try( BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                while ((line = reader.readLine()) != null && i<(count-2)) {
                    // Skip the header line
                    if (i<0) {
                        i++;
                        continue;
                    }
                    Subject oopSubj = new Subject("OOP","BUSHRA");
                    Subject dsaSubj = new Subject("DSA","ZUBIYA");
                    Subject calculusSubj = new Subject("CALCULUS","HINA SALMAN");
                    Subject IAISubj = new Subject("IAI","AHMED QASIM");
                    String[] data = line.split("\\|");
                    studentsList.add(new Student(data[0].trim(), data[1].trim(), data[2].trim()));
                    studentsList.get(i).addSubject(oopSubj);
                    studentsList.get(i).addSubject(dsaSubj);
                    studentsList.get(i).addSubject(calculusSubj);
                    studentsList.get(i).addSubject(IAISubj);
                    //System.out.println(studentsList.get(i));
                    i++;
                }
              }
            catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
            return studentsList;
        }
        //READING MARKS AND GPA  FROM FILE AND ADDING TO THE OBJECTS
        public static  ArrayList<Student> students(ArrayList<Student>studentsList){
            String line;
            int count = 0;
            int i = -2;
            String filePath = "marks.txt"; 
            // Replace "books.txt" with the path to your file
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    while ((line = reader.readLine()) != null){
                        count++;
                    }
                    reader.close();//must
                    System.out.println(count);
                   
                }
                catch(IOException e) {
                    System.err.println("Error reading the file: " + e.getMessage());
                }
                
                  try( BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                    while ((line = reader.readLine()) != null && i<(count-2)) {
                        // Skip the header line
                        if (i<0) {
                            i++;
                            continue;
                        }
                        String[] data = line.split("\\|");
                       for(int j =0;j<4;j++){
                        studentsList.get(i).getSubjects().get(j).setTotalMarks(Double.parseDouble(data[2+(j*2)]));
                        //System.out.print(studentsList.get(0).getSubjects().get(0).getTotalMarks()+" ");
                        studentsList.get(i).getSubjects().get(j).setGPA(Double.parseDouble(data[3+(j*2)]));
                        }
                        studentsList.get(i).setGPA(Double.parseDouble(data[data.length-1]));
                        i++;
                    }
                    System.out.println("marks1"+studentsList.get(12).getSubjects().get(0).getTotalMarks());

                    reader.close();
                    System.out.println("marks2"+studentsList.get(0).getSubjects().get(0).getTotalMarks());

                  }

                catch (IOException e) {
                    System.err.println("Error reading the file: " + e.getMessage());
                }
                
                return studentsList;
            }
        


}
