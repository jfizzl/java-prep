//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Warrior aragorn = new Warrior("Aragorn",
                100,20);
        Archer legolas = new Archer ("legolas",
                80,10);

        System.out.println(aragorn);
        System.out.println(legolas);

        aragorn.makeAttack(legolas);
        System.out.println(legolas);

        legolas.makeAttack(aragorn);
        System.out.println(aragorn);

        legolas.doReload(5);
        legolas.makeAttack(aragorn);
        System.out.println(aragorn);


        }
    }
