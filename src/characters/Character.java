package characters;

import characters.weapon.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior weapon) {
        weapon.useWeapon();
    }

    protected abstract void fight();

    public abstract void display();


}
