public class Archer extends Character {

    private int arrows;

    public Archer(String name, int health, int arrows) {
        super(name, health);
        this.arrows = arrows;
    }

    public String makeAttack(Character target){
        if (this.arrows>0) {
            super.makeAttack(target);
            target.health -= 15;
            this.arrows -=1;
            return("Archer"+name+"shoots" +
                    "an arrow at"+target.name+
                    " dealing 15 damage!" + arrows+
                    "arrows left");

        } else {
            return("Archer"+name+
                    "has no arrows left!");
        }
    }

    public String doReload(int amount){
        this.arrows += amount;
        return ("Archer" +name+
                "reloads"+amount+
                "arrows. Total Arrows:"+arrows);
    }



}
