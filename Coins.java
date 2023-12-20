public class Coins {
    public static void main(String[] args) {
        
        int coins = Integer.parseInt(args[0]);
        int quarters = coins / 25;
        int cents = coins % 25;
        System.out.println("Use " + quarters + " quarters and " + cents + " cents");
    }
}