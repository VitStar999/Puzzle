package characters.weapon;

public class KnifeBehavior implements WeaponBehavior{


    @Override
    public void useWeapon() {
        System.out.println("Удар ножом");
    }
}
