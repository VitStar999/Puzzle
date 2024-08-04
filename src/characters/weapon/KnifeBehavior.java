package characters.weapon;

public class KnifeBehavior implements WeaponBehavior{
    WeaponBehavior  sword = new SwordBehavior();
    WeaponBehavior  bow_and_arrow = new BowAndArrowBehavior();
    WeaponBehavior  knife = new KnifeBehavior();
    WeaponBehavior  axe = new AxeBehavior();

    @Override
    public void useWeapon() {
        System.out.println("Удар ножом");
    }
}
