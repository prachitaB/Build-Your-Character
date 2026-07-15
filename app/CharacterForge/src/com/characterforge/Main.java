package com.characterforge;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CharacterDAO dao = new CharacterDAOImpl();

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("       CHARACTER FORGE");
            System.out.println("======================================");
            System.out.println("1. Create Character");
            System.out.println("2. Update Character");
            System.out.println("3. Delete Character");
            System.out.println("4. Search Character");
            System.out.println("5. View All Characters");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:

                Character c1 = new Character();

                System.out.print("Enter Character ID : ");
                c1.setId(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter Character Name : ");
                c1.setName(sc.nextLine());

                System.out.print("Enter Level : ");
                c1.setLevel(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter Class : ");
                c1.setClassType(sc.nextLine());

                System.out.print("Enter Species : ");
                c1.setSpecies(sc.nextLine());

                System.out.print("Enter Background : ");
                c1.setBackground(sc.nextLine());

                System.out.print("Enter Strength : ");
                c1.setStrength(sc.nextInt());

                System.out.print("Enter Dexterity : ");
                c1.setDexterity(sc.nextInt());

                System.out.print("Enter Constitution : ");
                c1.setConstitution(sc.nextInt());

                System.out.print("Enter Intelligence : ");
                c1.setIntelligence(sc.nextInt());

                System.out.print("Enter Wisdom : ");
                c1.setWisdom(sc.nextInt());

                System.out.print("Enter Charisma : ");
                c1.setCharisma(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter Weapon : ");
                c1.setWeapon(sc.nextLine());

                dao.addCharacter(c1);

                break;

            case 2:

                Character c2 = new Character();

                System.out.print("Enter Character ID to Update : ");
                c2.setId(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter Character Name : ");
                c2.setName(sc.nextLine());

                System.out.print("Enter Level : ");
                c2.setLevel(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter Class : ");
                c2.setClassType(sc.nextLine());

                System.out.print("Enter Species : ");
                c2.setSpecies(sc.nextLine());

                System.out.print("Enter Background : ");
                c2.setBackground(sc.nextLine());

                System.out.print("Enter Strength : ");
                c2.setStrength(sc.nextInt());

                System.out.print("Enter Dexterity : ");
                c2.setDexterity(sc.nextInt());

                System.out.print("Enter Constitution : ");
                c2.setConstitution(sc.nextInt());

                System.out.print("Enter Intelligence : ");
                c2.setIntelligence(sc.nextInt());

                System.out.print("Enter Wisdom : ");
                c2.setWisdom(sc.nextInt());

                System.out.print("Enter Charisma : ");
                c2.setCharisma(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter Weapon : ");
                c2.setWeapon(sc.nextLine());

                dao.updateCharacter(c2);

                break;

            case 3:

                System.out.print("Enter Character ID to Delete : ");
                int deleteId = sc.nextInt();

                dao.deleteCharacter(deleteId);

                break;

            case 4:

                System.out.print("Enter Character ID to Search : ");

                int searchId = sc.nextInt();

                Character character = dao.searchCharacter(searchId);

                if (character != null) {

                    System.out.println("\n====================================");
                    System.out.println("        CHARACTER SHEET");
                    System.out.println("====================================");

                    System.out.println("ID           : " + character.getId());
                    System.out.println("Name         : " + character.getName());
                    System.out.println("Level        : " + character.getLevel());
                    System.out.println("Class        : " + character.getClassType());
                    System.out.println("Species      : " + character.getSpecies());
                    System.out.println("Background   : " + character.getBackground());

                    System.out.println("------------------------------------");

                    System.out.println("Strength     : " + character.getStrength());
                    System.out.println("Dexterity    : " + character.getDexterity());
                    System.out.println("Constitution : " + character.getConstitution());
                    System.out.println("Intelligence : " + character.getIntelligence());
                    System.out.println("Wisdom       : " + character.getWisdom());
                    System.out.println("Charisma     : " + character.getCharisma());

                    System.out.println("------------------------------------");

                    System.out.println("Weapon       : " + character.getWeapon());

                    System.out.println("====================================");

                } else {

                    System.out.println("Character Not Found!");

                }

                break;

            case 5:

                List<Character> list = dao.displayAllCharacters();

                if (list != null && !list.isEmpty()) {

                    System.out.println("\n================ CHARACTER LIST ================");

                    for (Character c : list) {

                        System.out.println(
                                c.getId() + " | " +
                                c.getName() + " | " +
                                "Lv." + c.getLevel() + " | " +
                                c.getClassType() + " | " +
                                c.getSpecies() + " | " +
                                c.getWeapon());

                    }

                } else {

                    System.out.println("No Characters Found!");

                }

                break;

            case 6:

                System.out.println("Exiting Character Forge...");
                break;

            default:

                System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

        sc.close();

    }

}