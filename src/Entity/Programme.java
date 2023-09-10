package entity;


public class Programme {

    //Programme data
    private String id;
    private String code;
    private String name;
    private String description;
    private String programmeLeader;
    private int duration;
    private TutorialGroup tutorialGroup;


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
    }
    public Programme(String id, String code, String name, String description, String programmeLeader, int duration, TutorialGroup[] tutorialGroup){
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.programmeLeader = programmeLeader;
        this.duration = duration;
    }

    public Programme(TutorialGroup tutorialGroup){
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

    public void setTutorialGroup(TutorialGroup tutorialGroup) {
        this.tutorialGroup = tutorialGroup;
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

    public TutorialGroup getTutorialGroup() {
        return tutorialGroup;
    }

    @Override
    public String toString() {
        return "Programme ID: " + id +"\n" +
                "Programme Code: " + code + "\n" +
                "Programme Name: " + name + "\n" +
                "Programme Description: " + description + "\n" +
                "Programme Leader: " + programmeLeader + "\n" +
                "Duration: " + duration + "\n" +
                "Tutorial Group: " + tutorialGroup ;

    }
}


