class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int targetNum = (int) (Math.random() * 10);
        System.out.println("Number to guess is " + targetNum);

        while (true) {
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player 1 guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player 2 guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player 3 guessed " + guessp3);

            if (guessp1 == targetNum) {
                p1IsRight = true;

            }
            if (guessp2 == targetNum) {
                p2IsRight = true;

            }
            if (guessp3 == targetNum) {
                p3IsRight = true;

            }
            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("We have a winner");
                System.out.println("Is Player 1 correct: " + p1IsRight);
                System.out.println("Is Player 2 correct: " + p2IsRight);
                System.out.println("Is Player 3 correct: " + p3IsRight);
                System.out.println("GAME OVER");
                break;
            } else {
                System.out.println("We have to play again");
            }
        }
    }
}

class Player {
    int number = 0;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("My guess is " + number);
    }
}

public class GuessLauncher {
    public static void main(String[] args) {
        GuessGame newGame = new GuessGame();
        newGame.startGame();
    }
}
