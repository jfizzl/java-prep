public class Warrior extends Character {

    private int strength;


    public Warrior (String name, int health, int strength){
        super(name, health);
        this.strength = strength;
    }

    public String makeAttack(Character target) {
        super.makeAttack(target);
        return ("Warrior" +name+"strikes"+target.
                name+"with strength"+strength);

    }

    public String boostStrength(int amount){
        this.strength +=amount;
        return ("Warrior"+name+"boosts"+strength+"by amount");
    }
}
