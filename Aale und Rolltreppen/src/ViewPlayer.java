public class ViewPlayer  {
    private Player player;
    private int count;
    public ViewPlayer() {
        player = new Player();
        count = 0;
    }
    public void playAutomatic() throws InterruptedException{
        while (!player.getIsOnField100()){
            player.move();
            Thread.sleep(80);
            count++;
        }
        System.out.println("Der Computer hat " + count + " Versuche gebraucht");
        // Best Try: 1,6,6,1,5,6,3; 7 Tries
        getTryRating(count);
    }
    public void getTryRating(int count){
        double ranking;
        ranking = 100 - (double)(count) / 7 + 1;
        System.out.println("Ranking: " + ranking);
    }
}
