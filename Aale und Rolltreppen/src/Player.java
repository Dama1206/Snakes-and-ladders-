import java.util.Random;

public class Player {
    private int pos;
    private boolean isOnField100;
    public Player(){isOnField100 = false;}
    public int dice(){
        Random rnd = new Random();
        return rnd.nextInt(1,7);
    }
    public boolean getIsOnField100() {return isOnField100;}
    private void confirmPos(){
        switch(pos){
            case 1:
                pos = 38;
                break;
            case 4:
                pos = 14;
                break;
            case 9:
                pos = 31;
                break;
            case 17:
                pos = 7;
                break;
            case 21:
                pos = 42;
                break;
            case 28:
                pos = 84;
                break;
            case 51:
                pos = 67;
                break;
            case 54:
                pos = 34;
                break;
            case 62:
            case 63:
                pos = 19;
                break;
            case 65:
                pos = 60;
                break;
            case 72:
                pos = 91;
                break;
            case 80:
                pos = 99;
            case 87:
                pos = 36;
                break;
            case 92:
            case 93:
                pos = 73;
                break;
            case 95:
                pos = 75;
                break;
            case 98:
                pos = 79;
                break;
            default:
                break;
        }
    }
    public void move(){
        boolean isTooBig;
        int oldPos = pos;
        int diced = dice();
        if (pos + diced <= 100){
            pos += diced;
            isTooBig = false;
        }
        else if(pos + diced > 100){
            isTooBig = true;
        }
        else{ isTooBig = false; }
        if(isTooBig) System.out.println("Du befindest dich auf Feld " + oldPos + ", du bleibst auf Feld " + pos + ", da du eine " + diced + " gewürfelt hast.");
        else         System.out.println("Du befindest dich auf Feld " + oldPos + ", du bewegst dich auf Feld " + pos + ", du hast gewürfelt: " + diced);

        confirmPos();
        System.out.println("Neues Feld: " + pos);
        if(pos == 100) {
            System.out.println("Gewonnen!");
            isOnField100 = true;
        }
    }
}
