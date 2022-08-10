
import  java.util.Scanner;

public class Fan {
        int speed;
        String direction;
        public Fan() {
            speed = 0;
            direction = "clockwise";
        }
        public void speedUp() {
            if (speed != 3) {
                speed++;
            } else {
                speed = 0;
            }
        }
        public void changeDirection(){
            if (direction.equals("clockwise")) {
                direction = "counter clockwise";
            } else {
                direction = "clockwise";
            }
        }
        public String toString(){
            String speedString = "";
            switch (speed) {
                case 0:
                    speedString = "off";
                    break;
                case 1:
                    speedString = "spinning slowly";
                    break;
                case 2:
                    speedString = "spinning";
                    break;
                case 3:
                    speedString = "spinning quickly";
            }
            if (speed == 0) {
                // if fan is off do not include direction
                return "The fan is " + speedString;
            } else {
                return "The fan is " + speedString + " " + direction;
            }

        }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (!answer.equals("quit")){
            System.out.println(fan1);
            System.out.println("type: 'pull left cord' to speed up the fan");
            System.out.println("type: 'pull right cord' to change the fan's direction");
            System.out.println("type: 'quit' to exit program");
            System.out.print("Enter here: ");
            answer = scanner.nextLine();
            switch (answer) {
                case "pull left cord":
                    fan1.speedUp();
                    break;
                case "pull right cord":
                    fan1.changeDirection();
                    break;
                case "quit":
                    // do nothing to Fan
                    break;
                default:
                    // print error
                    System.out.println("error command could not be found");
            }
            System.out.println();
        }
    }
}
