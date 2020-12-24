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

        choice = myScanner.nextInt();

        if(choice == 1){
            if(goldRing == 1){
//                ending();
            } else {
                System.out.println("Officer: Are you ok? You look like you've seen better days.");
                System.out.println("");
                System.out.println("1: Reply");
                System.out.println("2: Attack");
                System.out.println("3: Walk Away");

                choice = myScanner.nextInt();

                if(choice == 1){
                    System.out.println("You try to reply, but soon you realize that for some unknown reason you are unable to speak.");
                    System.out.println("");
                    System.out.println("The officer shakes their head.");
                    System.out.println("");
                    System.out.println("Officer: A mute huh? You must be a victim of one of those wizards from out in the wildlands. Go see the local healer, they're just north of the square.");
                    healerShop();
                }
                else if(choice == 2){
                    playerHP = playerHP-1;
                    System.out.println("Guard: Hey don't be stupid.\nThe guard hit you so hard and you fainted.\n(You receive 1 damage)\n");
                    System.out.println("Your HP: " + playerHP);
                    enterScanner.nextLine();
                    townSquare();
                }
                else if(choice == 3){
                    sideStreet();
                }
            }
        }
        else if(choice == 2){
            playerHP = playerHP-1;
            System.out.println("Guard: Hey don't be stupid.\n\nThe guard hit you so hard and you fainted.\n(You receive 1 damage)\n");
            System.out.println("Your HP: " + playerHP);
            enterScanner.nextLine();
            townSquare();
        }
        else if(choice == 3){
            playerHP = 0;
            System.out.println("You slip back into unconsciousness.");
            System.out.println("Suddenly you see a white light as you are greeted by all of your deceased family members.");
            System.out.println("It appears that while you slept the town was overrun by nameless horrors and you became a monster's lunch.");
            System.out.println("Your HP: " + playerHP);
        }
    }

    public void healerShop(){
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("You follow the officer's directions and soon find yourself in front of a shop with the five pointed star set with a flaming eye set in the middle, \nthe sign for a healer in these parts.");
        System.out.println("As you enter the shop you are assaulted with a melange of herbs and spices.");
        System.out.println("You begin to call out to see if there is anyone in the shop before you remember your predicament.");
        System.out.println("You see a bell sitting on a counter next to bottles filled with various powders and liquids.");
        System.out.println("");
        System.out.println("What do you want to do?");
        System.out.println("");
        System.out.println("1: Ring the bell");
        System.out.println("2: Pick up a bottle");
        System.out.println("3: Leave the shop");
        System.out.println("\n--------------------------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if(choice == 1){
            System.out.println("As soon as you ring the bell you hear the shuffling of feet as a bearded old man appears behind the counter as if from nowhere. \nYou notice an unusual glint in his eyes.");
            System.out.println("Old Man: Hello there! What can I do for you today?");
            System.out.println("You attempt to explain your problem through gestures and pointed looks.");
            System.out.println("The old man appears to understand. He reaches for one of the innumerable bottles on the counter and hands it to you.");
            System.out.println("Old Man: Here you are, free of charge. This potion will lead you back to your lost voice.");
            System.out.println("As you drink the potion you feel an unusual sensation in your stomach before your vision goes dark.");
//            forestPath();
        }
        else if(choice == 2){
            System.out.println("You choose a bottle at random and uncork it. The pleasant odor of peppermint and cocoa wafts up to your nose.");
            System.out.println("");
            System.out.println("What do you want to do?");
            System.out.println("");
            System.out.println("1: Drink the contents of the bottle");
            System.out.println("2: Close the bottle and set it back down");
            System.out.println("3: Throw the bottle at the wall");

            choice = myScanner.nextInt();

            if(choice == 1){
                System.out.println("As you drink the potion you feel an unusual sensation in your stomach before your vision goes dark.");
//                forestPath();
            }
            else if(choice == 2){
                System.out.println("You close up the bottle and set it back down on the counter.");
                System.out.println("As you continue to look around the shop you begin to feel a growing sense of unease.\n You decide that you would rather take your chances in the city streets than stay in this shop another minute.");
//                sideStreet();
            }
            else if (choice == 3){
                playerHP = 0;
                System.out.println("You instantly regret your decision as the breaking of the potion causes a chain reaction among the other potions in the store.");
                System.out.println("Soon you find yourself engulfed in an incredible explosion.");
                System.out.println("They don't find much more of you in the aftermath than scraps of cloth.");
                System.out.println("Your HP:" + playerHP );
            }
        }
        else if(choice == 3){
            sideStreet();
        }
    }

    public void sideStreet(){
        System.out.println("\n-------------------------------------------------------------------------------------\n");
        System.out.println("You wander the maze of city streets until you find yourself in a dim back alley.");
        System.out.println("Looking around you notice that there are only a few other people in the alley with you.");
        System.out.println("The people are huddled together in a group. They seem to be arguing about something.");
        System.out.println("");
        System.out.println("What do you want to do?");
        System.out.println("");
        System.out.println("1: Walk up to the people");
        System.out.println("2: Walk out of the alley");
        System.out.println("3: Attack the people");
        System.out.println("\n-------------------------------------------------------------------------------------\n");

        choice = myScanner.nextInt();

        if (choice == 1){
            System.out.println("As you walk up to the people you begin to smell an unusual odor, like sulphur and brimstone.");
            System.out.println();
        }
    }

}
