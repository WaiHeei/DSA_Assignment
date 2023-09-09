package entity;

public class Student implements Comparable<Student> {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //Getter and Setter
    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public String  getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    @Override
    public int compareTo(Student other) {
        /*int result = this.studentId.compareTo(other.studentId);
        if (result == 0) {
            result = this.compare(this.studentName, other.studentName);
        }
        return result;*/
        return 0;
    }
}
