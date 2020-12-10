import java.util.Scanner;

public class TextAdventure {

    Scanner myScanner = new Scanner(System.in);
    Scanner enterScanner = new Scanner(System.in);
    int playerHP;
    String playerName;
    String playerWeapon;
    int choice;
    int monsterHP;

    int goldRing;

    public static void main(String[] args) {
        TextAdventure arkham;
        arkham = new TextAdventure();
        arkham.playerSetUp();
        arkham.townSquare();

    }

    public void playerSetUp(){

        playerHP = 10;
        monsterHP = 15;

        playerWeapon = "Dagger";

        System.out.println("Your HP is " + playerHP);
        System.out.println("Your Weapon is " + playerWeapon);

        System.out.println("What is your name?");

        playerName = myScanner.nextLine();

        System.out.println("Hello " + playerName + "!");

    }

    public void townSquare(){

        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("You wake up to a scorching hot sun and the sound of hooves and wagon wheels.");
        System.out.println("A shadow falls across your face and you see a police officer looking down at you.");
        System.out.println("");
        System.out.println("What do you want to do?");
        System.out.println("");
        System.out.println("1: Talk to the officer");
        System.out.println("2: Attack the officer");
        System.out.println("3: Go back to sleep");
        System.out.println("\n--------------------------------------------------------------------------------------\n");

        choice = myScanner.nextint();

        if(choice == 1){
            if(goldRing == 1){
                ending();
            } else {
                System.out.println("Officer: Are you ok? You look like you've seen better days.");
                System.out.println("");
                System.out.println("1: Reply");
                System.out.println("2: Walk away");
            }
        }
    }

}
