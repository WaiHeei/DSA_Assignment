package Client;

import Entity.Programme;
import adt.HashMap;
import adt.HashMapInterface;
import java.util.Scanner;

public class ProgrammeManager {
    static Scanner scan = new Scanner(System.in);
    public static boolean cont = true;

    public static void programmeMenu(){
        System.out.println("=====================================================");
        System.out.println("=============== Programme Management ================");
        System.out.println("=====================================================");
        System.out.println("             1.  Add a programme                     ");
        System.out.println("             2.  Delete a programme                  ");
        System.out.println("             3.  Search a programme                  ");
        System.out.println("             4.  Amend a programme                   ");
        System.out.println("             5.  List all programme                  ");
        System.out.println("=====================================================");
    }

    public static void main(String[] args) {
        HashMapInterface<String, Programme> programmeList = new HashMap<>();

        Programme programme1 = new Programme("FOCS01", "RSW", "Software Engineering", "Bachelor in Software Engineering", "Ts. Lim Shen Huoy", 3);
        Programme programme2 = new Programme("FOCS02", "RDS", "Data Science", "Bachelor in Data Science", "Ts. Lim Shen Huoy", 3);

        programmeList.put(programme1.getId(), programme1);
        programmeList.put(programme2.getId(), programme2);

        while (cont = true) {
            programmeMenu();
            String pOption = scan.nextLine();

            if (pOption.equals("1")) {
                String addProgrammeID = String.valueOf("FOCS0" + (programmeList.size() + 1));
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
                programmeList.put(programme.getId(), programme);

            } else if (pOption.equals("2")) {
                System.out.println("Please enter programme ID that you want to delete: ");
                String deleteProgrammeID = scan.nextLine();

                if (programmeList.containsKey(deleteProgrammeID)) {
                    programmeList.remove(deleteProgrammeID);
                } else {
                    System.out.println(deleteProgrammeID + " does not exist in the Programme! ");
                }
            } else if (pOption.equals("3")) {
                System.out.println("Please enter programme ID that you want to search: ");
                String searchProgrammeID = scan.nextLine();

                if (programmeList.containsKey(searchProgrammeID)) {
                    System.out.println(programmeList.get(searchProgrammeID));
                } else {
                    System.out.println(searchProgrammeID + " does not exist in the Programme! ");
                }

            } else if (pOption.equals("4")) {
                System.out.println("Please enter programme ID that you want to edit: ");
                String editProgrammeID = scan.nextLine();
                if (programmeList.containsKey(editProgrammeID)) {
                    //show chosen programme

                    Programme programme = programmeList.get(editProgrammeID);

                    System.out.println("Please enter programme code: ");
                    String programmeCode = scan.nextLine();
                    if (!(programmeCode.toUpperCase() == "SAME")) {
                        programme.setCode(programmeCode);
                    }

                    System.out.println("Please enter programme name: ");
                    String programmeName = scan.nextLine();
                    if (!(programmeName.toUpperCase() == "SAME")) {
                        programme.setName(programmeName);
                    }

                    System.out.println("Please enter programme description: ");
                    String programmeDesc = scan.nextLine();
                    if (!(programmeDesc.toUpperCase() == "SAME")) {
                        programme.setDescription(programmeDesc);
                    }

                    System.out.println("Please enter programme programmeLeader: ");
                    String programmeLeader = scan.nextLine();
                    if (!(programmeLeader.toUpperCase() == "SAME")) {
                        programme.setProgrammeLeader(programmeLeader);
                    }

                    System.out.println("Please enter programme duration: ");
                    int programmeDuration = scan.nextInt();

                    System.out.println(programmeList.get(editProgrammeID));
                } else {
                    System.out.println(editProgrammeID + " does not exist in the Programme! ");
                }
            } else if (pOption.equals("5")) {
                int index = 1;
                System.out.printf("%-2s %-3s %-25s %-35s %-20s %-8s \n", "", "Code", "Name", "Description", "Programme Leader", "Duration");
                for (int i = 1; i <= programmeList.size(); i++) {
                    String key = Integer.toString(i);
                    Programme programme = programmeList.get("FOCS0" + key);
                    if (programme != null) {
                        System.out.printf("%-2d %-4s %-25s %-35s %-20s %-1d \n", index, programme.getCode(), programme.getName(), programme.getDescription(),
                                programme.getProgrammeLeader(), programme.getDuration());
                    }
                    index++;
                }

            }else if (pOption.equals("6")) {

            }else if (pOption.equals("7")) {

            }
        }
    }
}
