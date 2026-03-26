import java.util.Scanner;

public class HomeEscape {
    public static Scanner sc = new Scanner(System.in);
    public static int digit1;      // First  digit of final code
    public static int digit2;      // Second  digit of fimal code
    public static boolean clue1Found; // to keep track if the player Found first digit?
    public static boolean clue2Found; // to keep track if the player Found second digit?
    public static boolean hasKey;     // to keep track if the player Found physical key?
    public static boolean escaped;    // To decide whether the user won the game or not.
    public static int attemptsLeft;   // Attempts remaining

    // ========== MAIN ==========
    public static void main(String[] args) throws InterruptedException
    {
        boolean playAgain = true;

        while (playAgain) {
            // Initialize the code digits to something wrong.
            digit1 = 0;
            digit2 = 0;
            clue1Found = false;
            clue2Found = false;
            hasKey = false;
            escaped = false;
            attemptsLeft = 5;

            //loading starts
            System.out.println();
            System.out.print("Getting you Locked inside the House");
            for(int q=1; q<=10; q++)
            {
                System.out.print(". ");
                Thread.sleep(600);
                
            } 
            System.out.println();
            for(int q=1; q<=3; q++)
            {
                System.out.print("\rLocking the Rooms");
                Thread.sleep(300);
                System.out.print("\rHiding the Clues");
                Thread.sleep(300);
                System.out.print("\rGenerating Lock Code");
                Thread.sleep(300);
                System.out.print("\rLocking the Front Door");
                Thread.sleep(300);
                System.out.print("\rHiding the Physical key");
                Thread.sleep(300);
            } 
            Thread.sleep(300);
            System.out.print("\rPhysical Key Hidden, You Are Locked! Get to Work!");
            //loading ends here

            // HERE WE WELOCME THE USER OR THE PLAYER
            System.out.println();
            System.out.println("╔════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                           HOME ESCAPE ADVENTURE                    ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            Thread.sleep(1500);
            System.out.println("╔════════════════════════════════════════════════════════════════════╗");
            Thread.sleep(1000);
            System.out.println("║ You wake up inside a locked house.                                 ║");
            Thread.sleep(1000);
            System.out.println("║ Find two code digits and a physical key.                           ║");
            Thread.sleep(1000);
            System.out.println("║ Use both to unlock the Front Door and escape.                      ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            System.out.println();

            
            Thread.sleep(2000);
            System.out.println("╔════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                          CHOOSE DIFFICULTY                         ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║  [1] EASY    - 7 Attempts                                          ║");
            System.out.println("║  [2] NORMAL  - 5 Attempts                                          ║");
            System.out.println("║  [3] HARD    - 3 Attempts                                          ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            System.out.print("Enter choice (1/2/3): ");

            char diff = sc.next().charAt(0);
            if (diff == '1') attemptsLeft = 7;
            else if (diff == '2') attemptsLeft = 5;
            else if (diff == '3') attemptsLeft = 3;
            else 
            {
                Thread.sleep(1000);
                System.out.println();
                System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                System.out.printf("║ Invalid choice. Defaulting to NORMAL (5 attempts)");
                for(int q=1; q<=9; q++)
                {
                    System.out.print(". ");
                    Thread.sleep(600);
                }
                System.out.print("║");
                System.out.println("\n╚════════════════════════════════════════════════════════════════════╝");
                attemptsLeft = 5;
            }

            // Generating lock-code digits which we will use later to unlokc the final door.
            digit1 = (int) (Math.random() * 10); // 0-9 DIGITS
            digit2 = (int) (Math.random() * 10); // 0-9 DIGITS
            if (digit1 == digit2) 
            {
                digit2 = (digit2 + 3) % 10;
            }

             System.out.print("LOADING HOUSE LAYOUT");
            for(int q=1; q<=10; q++)
            {
                System.out.print(". ");
                Thread.sleep(600);     
            }
            System.out.println();
            System.out.println("╔════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                          THE HOUSE LAYOUT                          ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║ Explore four places to uncover clues:                              ║");
            System.out.println("║  1) Living Room                   2) Kitchen                       ║");
            System.out.println("║  3) Study                         4) Front Door                    ║");
            System.out.println("║ Check Status anytime to see your progress.                         ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════╝");

            //========== Main loop =============
            while (!escaped && attemptsLeft > 0) {
                System.out.println();
                System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                System.out.println("║   Where do you want to go?                                         ║");
                System.out.println("╠════════════════════════════════════════════════════════════════════╣");
                System.out.println("║ [1] Living Room                                                    ║");
                System.out.println("║ [2] Kitchen                                                        ║");
                System.out.println("║ [3] Study                                                          ║");
                System.out.println("║ [4] Front Door                                                     ║");
                System.out.println("║ [5] Status                                                         ║");
                System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                System.out.print(" Choice: ");

                char choice = sc.next().charAt(0);
                switch (choice) 
                {
                    case '1':
                    {
                        System.out.print("You are going to the LIVING ROOM");
                        for(int q=1; q<=10; q++)
                        {
                            System.out.print(". ");
                            Thread.sleep(600);     
                        }
                        livingRoom();
                        break;
                    }    
                    case '2':
                    {
                        System.out.print("You are going to the KITCHEN");
                        for(int q=1; q<=10; q++)
                        {
                            System.out.print(". ");
                            Thread.sleep(600);     
                        }
                        kitchen();
                        break;
                    }    
                    case '3':
                    {
                        System.out.print("Approaching STUDY ROOM");
                        for(int q=1; q<=10; q++)
                        {
                            System.out.print(". ");
                            Thread.sleep(600);     
                        }
                        study();
                        break;
                    }    
                    case '4':
                    {
                        System.out.print("Going to FRONT DOOR");
                        for(int q=1; q<=10; q++)
                        {
                            System.out.print(". ");
                            Thread.sleep(600);     
                        }
                        frontDoor();
                        break;
                    }    
                    case '5':
                    {
                        System.out.print("Fetching your Status");
                        for(int q=1; q<=10; q++)
                        {
                            System.out.print(". ");
                            Thread.sleep(600);     
                        }
                        showStatus();
                        break;
                    } 
                    default:
                    {
                        System.out.println();
                        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                        System.out.println("║ Invalid choice. Try again.                                         ║");
                        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                        break;
                    }   
                }
            }

            if (escaped) {
                System.out.println();
                System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                System.out.println("║                     Great job!  You escaped!                       ║");
                System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            } else {
                System.out.println();
                System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                System.out.println("║                             LOCKED OUT!                            ║");
                System.out.println("║         Out of Attempts. No Way Out, You Are Locked Inside!        ║");
                System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            }

            // Replay
            System.out.println("\n");
            System.out.print(" Play again? (y/n): ");
            char replayChoice = sc.next().charAt(0);
            System.out.println();
            playAgain = (replayChoice == 'y' || replayChoice == 'Y');
        }

        System.out.println();
        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                            Thanks for playing!                     ║");
        System.out.println("║                        Good Luck Finding Your New Home             ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
        Thread.sleep(1500);
        System.out.printf("\u0007 \u0007 \u0007 \u0007 \u0007 \u0007 \u0007 \u0007");

    }

    public static void livingRoom() throws InterruptedException
    {
        boolean stay = true;
        while (stay && !escaped && attemptsLeft > 0) {
            System.out.println();
            System.out.println("╔════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                             LIVING ROOM                            ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║ A couch faces a small table. A family                              ║");
            Thread.sleep(1000);
            System.out.println("║ photo hangs on the wall.                                           ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║ Options:                                                           ║");
            System.out.println("║  [1] Check under the couch                                         ║");
            System.out.println("║  [2] Look behind the photo                                         ║");
            System.out.println("║  [3] Return to hallway                                             ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            System.out.print(" Choice: ");

            char c = sc.next().charAt(0);
            if (c == '1') {
                if (!clue1Found) {
                    System.out.println();
                    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║                     You find a folded note                         ║");
                    System.out.println("║                         \"First digit is " + digit1 + "\"                         ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                    clue1Found = true;
                } else {
                    System.out.println();
                    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║                    Nothing else under the couch.                   ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                }
            } else if (c == '2') {
                System.out.println();
                System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                System.out.println("║                 Dusty frame. Nothing hidden behind it.             ║");
                System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            } else if (c == '3') {
                stay = false;
            } else {
                System.out.println();
                System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                System.out.println("║                 You hesitate, then look around again.              ║");
                System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            }
        }
    }

    public static void kitchen() {
        boolean stay = true;
        while (stay && !escaped && attemptsLeft > 0) {
            System.out.println();
            System.out.println("╔════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                               KITCHEN                              ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║ A fridge and a row of cabinets.                                    ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║ Options:                                                           ║");
            System.out.println("║  [1] Check fridge (both: outside and inside)                       ║");
            System.out.println("║  [2] Open cabinets                                                 ║");
            System.out.println("║  [3] Return to hallway                                             ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            System.out.print(" Choice: ");

            char c = sc.next().charAt(0);
            if (c == '1') {
                if (!clue2Found) {
                    System.out.println();
                    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║              A sticky note on the fridge door reads:               ║");
                    System.out.println("║                     \"Second digit is " + digit2 + "\"                            ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                    clue2Found = true;
                } else {
                    System.out.println();
                    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║                 Just leftovers inside. Nothing new.                ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                }
            } else if (c == '2') {
                System.out.println();
                System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                System.out.println("║            Plates and cups neatly stacked. Nothing useful.         ║");
                System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            } else if (c == '3') {
                stay = false;
            } else {
                System.out.println();
                System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                System.out.println("║                    You close the door and re-think.                ║");
                System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            }
        }
    }

    public static void study() {
        boolean stay = true;
        while (stay && !escaped && attemptsLeft > 0) {
            System.out.println();
            System.out.println("╔════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                STUDY                               ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║ Shelves of books. A small lockbox placed                           ║");
            System.out.println("║ on the desk.                                                       ║");
            System.out.println("║════════════════════════════════════════════════════════════════════║");
            System.out.println("║ Options:                                                           ║");
            System.out.println("║  [1] Check out the bookshelf                                       ║");
            System.out.println("║  [2] Try the lockbox (riddle)                                      ║");
            System.out.println("║  [3] Return to hallway                                             ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            System.out.print(" Choice: ");

            char c = sc.next().charAt(0);
            if (c == '1') {
                System.out.println();
                System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                System.out.println("║ You gather some hints:                                             ║");
                System.out.println("║ - A scribble on the desk: \"Think of something                      ║");
                System.out.println("║   with many keys.\"                                                 ║");
                System.out.println("║ - A book title stands out: \"Melody of Keys\".                       ║");
                System.out.println("║   These point to the same idea...                                  ║");
                System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            } else if (c == '2') {
                if (hasKey) {
                    System.out.println();
                    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║ The lockbox is already open. You have the key.                     ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                } 
                else 
                {
                    System.out.println();
                    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║                            Riddle:                                 ║");
                    System.out.println("║  \"What has many keys but can't open a single lock?\"                ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                    System.out.print(" Your answer: ");
                    sc.nextLine(); // consume leftover newline
                    String ans = sc.nextLine().trim().toLowerCase();
                    if (ans.equals("piano") || ans.equals("a piano"))
                    {
                        System.out.println();
                        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                        System.out.println("║          The lockbox clicks open. Inside is a metal key.           ║");
                        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                        hasKey = true;
                    }
                    else 
                    {
                        System.out.println();
                        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                        System.out.println("║          That doesn't seem right. The lockbox stays shut.          ║");
                        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                    }
                }
            } else if (c == '3') {
                stay = false;
            } else {
                System.out.println();
                System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                System.out.println("║                        You pause and think.                        ║");
                System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            }
        }
    }

    public static void frontDoor() {
        boolean stay = true;
        while (stay && !escaped && attemptsLeft > 0) {
            System.out.println();
            System.out.println("╔════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                            FRONT DOOR                              ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║ A door with a keypad and a keyhole.                                ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║ Attempts left: "+ attemptsLeft +"                                                   ║");
            System.out.println("╠════════════════════════════════════════════════════════════════════╣");
            System.out.println("║ Options:                                                           ║");
            System.out.println("║  [1] Enter keypad code                                             ║");
            System.out.println("║  [2] Try physical key                                              ║");
            System.out.println("║  [3] Return to hallway                                             ║");
            System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            System.out.print(" Choice: ");

            char c = sc.next().charAt(0);
            if (c == '1') 
            {
                if (attemptsLeft <= 0) 
                {
                    System.out.println();
                    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║             The keypad is locked. No attempts left.                ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                    stay = false;
                    continue;
                }
                System.out.print(" Enter the 2-digit code to unlock your door to freedom: ");
                sc.nextLine();
                String code = sc.nextLine().trim();
                if (!isTwoDigitNumber(code)) {
                    System.out.println();
                    System.out.println(" Please enter exactly two digits (e.g., 42).");
                    continue;
                }
                attemptsLeft--;
                String correctCode = digit1 + "" + digit2;
                if (code.equals(correctCode)) 
                {
                    System.out.println();
                    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║                 Code accepted. Keypad lock opened.                 ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                    if (hasKey) 
                    {
                        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                        System.out.println("║             You turn the physical key. The door unlocks.           ║");
                        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                        escaped = true;
                        return;
                    } 
                    else
                    {
                        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                        System.out.println("║                 The mechanical lock is still engaged.              ║");
                        System.out.println("║                     You need the metal key.                        ║");
                        System.out.println("╚════════════════════════════════════════════════════════════════════╝");                    
                    }
                } 
                else 
                {
                    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║                             Wrong code.                            ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                    System.out.println();
                }
            } 
            else if (c == '2') 
            {
                if (!hasKey) 
                {
                    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║               You do not have the physical key yet.                ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                    System.out.println();
                } 
                else
                {
                    System.out.println();
                    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                    System.out.println("║            You turn the key. The mechanical lock opens,            ║");
                    System.out.println("║           but the electronic keypad still needs the code.          ║");
                    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
                }
            } 
            else if (c == '3') 
            {
                stay = false;
            } 
            else 
            {
                System.out.println();
                System.out.println("╔════════════════════════════════════════════════════════════════════╗");
                System.out.println("║             You take a breath and think calmly.                    ║");
                System.out.println("╚════════════════════════════════════════════════════════════════════╝");
            }
        }
    }

    public static void showStatus() {
        System.out.println();
        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║                                STATUS                              ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
        System.out.println("╔════════════════════════════════════════════════════════════════════╗");
        System.out.println("║  Clue 1 (first digit):  " + (clue1Found ? digit1 : "?") +"                                          ║");
        System.out.println("║  Clue 2 (second digit):  " + (clue2Found ? digit2 : "?") +"                                         ║");
        System.out.println("║  Physical key:           " + (hasKey ? "Found    " : "Not found")+"                                 ║");
        System.out.println("║  Attempts left:          " + attemptsLeft+"                                         ║");
        System.out.println("╚════════════════════════════════════════════════════════════════════╝");
    }

    public static boolean isTwoDigitNumber(String s) {
        if (s.length() != 2) return false;
        char a = s.charAt(0);
        char b = s.charAt(1);
        return a >= '0' && a <= '9' && b >= '0' && b <= '9';
    }
}
