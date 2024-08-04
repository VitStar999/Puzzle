import characters.weapon.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weapon;

    public abstract void figth();

    public  void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}

