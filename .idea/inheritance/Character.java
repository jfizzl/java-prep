public class Character {

    public String name;
    public int health;

    public Character (String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String makeAttack(Character target) {

        target.health -= 10;
        return ("Character" + name + "attacks" + target.name);
    }

    public boolean isAlive() {
        if (this.health > 10) {
            return true;
        }
            return false;
        }


    public String heal(int amount) {
        this.health += amount;
        return ("Character" + name +"heals for" +amount +"points!");

    }

    public String toString(){
        return "Character"+name+", Health:"+health;
    }

}

