package entity;

/*Name : Leng Yen Rou
ID : 220WMR04092*/

import adt.TreeSet;
import adt.TreeSetInterface;

public class TutorialGroup implements Comparable<TutorialGroup>{
    private String programmeId;
    private int year;
    private int semester;
    private int groupNo;
    private TreeSetInterface<Student> students;

    public TutorialGroup(String programmeId, int year, int semester, int groupNo) {
        this.programmeId = programmeId;
        this.year = year;
        this.semester = semester;
        this.groupNo = groupNo;
        this.students = new TreeSet<>();
    }

    //Getter and Setter
    public String getProgrammeId() {
        return programmeId;
    }

    public void setProgrammeId(String programmeId) {
        this.programmeId = programmeId;
    }

    public int getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(int groupNo) {
        this.groupNo = groupNo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public TreeSetInterface<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }



    @Override
    public String toString() {
        return "Tutorial Group : " + programmeId + " Y" + year + " S" + semester + " G" + groupNo;
    }

    @Override
    public int compareTo(TutorialGroup other) {
        int result = this.programmeId.compareTo(other.programmeId);
        if (result == 0) {
            result = Integer.compare(this.year, other.year);
            if (result == 0) {
                result = Integer.compare(this.semester, other.semester);
                if (result == 0) {
                    result = Integer.compare(this.groupNo, other.groupNo);
                }
            }
        }
        return result;
    }

    public boolean contains(TutorialGroup other) {
        return this.equals(other);
    }

    public boolean hasStudent(){
        if (students.isEmpty()){
            return false;
        }else {
            return true;
        }
    }





}
