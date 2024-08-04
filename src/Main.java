import characters.King;
import characters.Knight;
import characters.Queen;
import characters.Troll;
import characters.weapon.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        King king = new King();
        Knight knight = new Knight();
        Queen queen = new Queen();
        Troll troll = new Troll();

        WeaponBehavior  sword = new SwordBehavior();
        WeaponBehavior  bow_and_arrow = new BowAndArrowBehavior();
        WeaponBehavior  knife = new KnifeBehavior();
        WeaponBehavior  axe = new AxeBehavior();

        king.display();
        king.setWeapon(sword);
        king.fight();

        knight.display();
        knight.setWeapon(bow_and_arrow);
        knight.fight();

        queen.display();
        queen.setWeapon(knife);
        queen.fight();

        queen.display();
        troll.setWeapon(axe);
        troll.fight();

    }
}