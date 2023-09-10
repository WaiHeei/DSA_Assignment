package client;

import adt.TreeSet;
import entity.Programme;
import adt.HashMap;
import adt.HashMapInterface;
import client.Tutor1;


import java.util.Scanner;

public class ProgrammeManager {
    private HashMapInterface<String, Programme> p;

    public ProgrammeManager(HashMapInterface<String, Programme> p){
        this.p = p;
    }

    static Scanner scan = new Scanner(System.in);
    public static boolean cont = true;

    public void addProgramme(HashMapInterface<String, Programme> p){
        String addProgrammeID = "FOCS" + (p.size() + 1);
        System.out.println("Please enter programme code: ");
        String programmeCode = scan.nextLine();
        System.out.println("Please enter programme name: ");
        String programmeName = scan.nextLine();
        System.out.println("Please enter programme description: ");
        String programmeDesc = scan.nextLine();
        System.out.println("Please enter programme programmeLeader: ");
        String programmeLeader = scan.nextLine();
        System.out.println("Please enter programme duration: ");
        int programmeDuration = scan.nextInt();
        Programme programme = new Programme(addProgrammeID, programmeCode, programmeName, programmeDesc, programmeLeader, programmeDuration);
        p.put(programme.getId(), programme);
    }

    public String deleteProgramme(HashMapInterface<String, Programme> p){
        System.out.println("Please enter programme ID that you want to delete: ");
        String deleteProgrammeID = scan.nextLine();

        if (p.containsKey(deleteProgrammeID)) {
            Programme a = p.get(deleteProgrammeID);
            String pCode = a.getCode();

            p.remove(deleteProgrammeID);
            return pCode;
        } else {
            System.out.println(deleteProgrammeID + " does not exist in the Programme! ");
            return null;
        }
    }

    public void searchProgramme(HashMapInterface<String, Programme> p){
        System.out.println("Please enter programme ID that you want to search: ");
        String searchProgrammeID = scan.nextLine();

        if (p.containsKey(searchProgrammeID)) {
            System.out.println(p.get(searchProgrammeID));
        } else {
            System.out.println(searchProgrammeID + " does not exist in the Programme! ");
        }
    }

    public void displayAllProgramme(HashMapInterface<String, Programme> p){
        int index = 1;
        System.out.printf("%-2s %-3s %-25s %-35s %-20s %-8s \n", "", "Code", "Name", "Description", "Programme Leader", "Duration");
        for (int i = 1; i <= p.size(); i++) {
            String key = Integer.toString(i);
            Programme programme = p.get("FOCS" + key);
            if (programme != null) {
                System.out.printf("%-2d %-4s %-25s %-35s %-20s %-1d \n", index, programme.getCode(), programme.getName(), programme.getDescription(),
                        programme.getProgrammeLeader(), programme.getDuration());
            }
            index++;
        }
    }

    public void editProgramme(HashMapInterface<String , Programme> p){
        displayAllProgramme(p);
        System.out.println("Please enter programme ID that you want to edit: ");
        String editProgrammeID = scan.nextLine();
        if (p.containsKey(editProgrammeID)) {
            Programme programme = p.get(editProgrammeID);

            System.out.println("Please enter new programme code: (Press Enter to keep the same)");
            String programmeCode = scan.nextLine();
            if (!programmeCode.isEmpty()) {
                programme.setCode(programmeCode);
            }

            System.out.println("Please enter new programme name: (Press Enter to keep the same)");
            String programmeName = scan.nextLine();
            if (!programmeName.isEmpty()) {
                programme.setName(programmeName);
            }

            System.out.println("Please enter new programme description: (Press Enter to keep the same)");
            String programmeDesc = scan.nextLine();
            if (!programmeDesc.isEmpty()) {
                programme.setDescription(programmeDesc);
            }

            System.out.println("Please enter new programme programme leader: (Press Enter to keep the same)");
            String programmeLeader = scan.nextLine();
            if (!programmeLeader.isEmpty()) {
                programme.setProgrammeLeader(programmeLeader);
            }

            System.out.println("Please enter programme duration: ");
            int programmeDuration = scan.nextInt();
            programme.setDuration(programmeDuration);

            System.out.println(p.get(editProgrammeID));
        } else {
            System.out.println(editProgrammeID + " does not exist in the Programme! ");
        }
    }

}
