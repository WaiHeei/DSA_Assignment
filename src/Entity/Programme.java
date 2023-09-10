package entity;

import adt.HashMapInterface;
import adt.TreeSet;
import adt.TreeSetInterface;
//Name: Ng Wai Heei
//Student ID: 22WMR04095

public class Programme {

    //Programme data
    private String id;
    private String code;
    private String name;
    private String description;
    private String programmeLeader;
    private int duration;
    private TreeSetInterface<TutorialGroup> tutorialGroup;
    private TutorialGroup tutGrp;


    //Constructor
    public Programme(){

    }

    public Programme(String id, String code, String name, String description, String programmeLeader, int duration){
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.programmeLeader = programmeLeader;
        this.duration = duration;
        this.tutorialGroup = new TreeSet<>();
    }
    public Programme(String id, String code, String name, String description, String programmeLeader, int duration, TutorialGroup[] tutorialGroup){
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.programmeLeader = programmeLeader;
        this.duration = duration;
    }

    public Programme(TreeSetInterface tutorialGroup){
        this.tutorialGroup = tutorialGroup;
    }

    //Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProgrammeLeader(String programmeLeader) {
        this.programmeLeader = programmeLeader;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //Getter
    public String getId() {
        return id;
    }
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getProgrammeLeader() {
        return programmeLeader;
    }

    public int getDuration() {
        return duration;
    }

    public void setTutorialGroup(TutorialGroup tutorialGroup){
        this.tutGrp = tutGrp;
    }

    public TreeSetInterface getTutTree(){
        return tutorialGroup;
    }

    public void addTutGrp( TreeSetInterface tutorialGroup, TutorialGroup a){
        tutorialGroup.add(a);
    }

    @Override
    public String toString() {
        return "Programme ID: " + id +"\n" +
                "Programme Code: " + code + "\n" +
                "Programme Name: " + name + "\n" +
                "Programme Description: " + description + "\n" +
                "Programme Leader: " + programmeLeader + "\n" +
                "Duration: " + duration + "\n" +
                  tutorialGroup.toString() ;

    }
}


