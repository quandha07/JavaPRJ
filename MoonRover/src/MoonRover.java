public class MoonRover {
    private int x;
    private int y;
    private char heading;

    public MoonRover(int x, int y, char heading) {
        this.x = x;
        this.y = y;
        this.heading = heading;
    }

    public void move(String instruction){
        switch(instruction){
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
            case "M":
                forWard();
                break;
        }
    }

    private void forWard() {
        switch(heading){
            case 'N':
                y++;
                break;
            case 'W':
                x--;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
        }
    }

    private void turnRight() {
        switch(heading){
            case 'N':
                heading = 'E';
                break;
            case 'E':
                heading = 'S';
                break;
            case 'S':
                heading = 'W';
                break;
            case 'W':
                heading = 'N';
                break;
        }
    }

    private void turnLeft() {
        switch(heading){
            case 'N':
                heading = 'W';
                break;
            case 'W':
                heading = 'S';
                break;
            case 'S':
                heading = 'E';
                break;
            case 'E':
                heading = 'N';
                break;
        }
    }

    public void processInstructions(String instructions){
        for(char instruction : instructions.toCharArray()) {
            move(instructions);
        }
    }

    public String getInstructions(){
        return x + " " + y + heading;
    }
}
