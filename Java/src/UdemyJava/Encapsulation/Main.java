package UdemyJava.Encapsulation;

public class Main {
    public static void main(String[]args){
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remainign Health  "+ player.healthRemaining());
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remainign Health  "+ player.healthRemaining());
        EnhencedPlayer player = new EnhencedPlayer("Tim",50 ,"Sword");
        System.out.println("Initial health is "+player.getHitPoints());

    }
}
