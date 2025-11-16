
import java.util.*;


public class simple_guessing_game {
    int random_number = 0;

    public void random() {
        Random num_randomizer = new Random();
        random_number = num_randomizer.nextInt(10);
    }

    public void main(String[] args) {
        random();
        boolean game_over = false;
        Scanner scan_num = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 10");

       while (game_over == false) {
        int user_number = scan_num.nextInt();
       

        if (random_number == user_number) {
            System.out.println("You got it!");
            random();
            
            System.out.println("Play again? (y/n)");
            scan_num.nextLine(); 
            String yn = scan_num.nextLine();
        
            if (yn.equalsIgnoreCase("n")) {
                game_over = true;
                break;
            }
            System.out.println("Guess a number between 0 and 10");
        }
        else if (random_number > user_number) {
            System.out.println("Higher!");
         }
        else {
            System.out.println("Lower!");
            }
        }
        
    }

}


