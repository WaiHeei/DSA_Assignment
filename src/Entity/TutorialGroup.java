package entity;

/*Name : Leng Yen Rou
ID : 220WMR04092*/

import adt.TreeSet;
import adt.TreeSetInterface;

public class TutorialGroup implements Comparable<TutorialGroup>{
    private String tutorialGroupID;
    private String programmeCode;
    private int year;
    private int semester;
    private int groupNo;
    private TreeSetInterface<Student> students;

    public TutorialGroup(String tutorialGroupID,String programmeCode, int year, int semester, int groupNo) {
        this.tutorialGroupID = tutorialGroupID;
        this.programmeCode = programmeCode;
        this.year = year;
        this.semester = semester;
        this.groupNo = groupNo;
        this.students = new TreeSet<>();
    }

    //Getter and Setter

    public String getTutorialGroupID() {
        return tutorialGroupID;
    }

    public void setTutorialGroupID(String tutorialGroupID) {
        this.tutorialGroupID = tutorialGroupID;
    }

    public String getProgrammeId() {
        return programmeCode;
    }

    public void setProgrammeId(String programmeId) {
        this.programmeCode = programmeId;
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
        return "Tutorial Group : "+ tutorialGroupID +" " + programmeCode + " Y" + year + " S" + semester + " G" + groupNo;
    }

    @Override
    public int compareTo(TutorialGroup other) {
        // Check for null tutorialGroupID values
        if (this.tutorialGroupID == null && other.tutorialGroupID == null) {
            return 0; // Both are considered equal
        } else if (this.tutorialGroupID == null) {
            return -1; // This object is considered smaller
        } else if (other.tutorialGroupID == null) {
            return 1; // The other object is considered smaller
        }

        // Now, it's safe to compare non-null tutorialGroupID values
        int result = this.tutorialGroupID.compareTo(other.tutorialGroupID);

        if (result == 0) {
            // Compare other fields if necessary
            result = this.programmeCode.compareTo(other.programmeCode);
            if (result == 0) {
                result = Integer.compare(this.year, other.year);
                if (result == 0) {
                    result = Integer.compare(this.semester, other.semester);
                    if (result == 0) {
                        result = Integer.compare(this.groupNo, other.groupNo);
                    }
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
