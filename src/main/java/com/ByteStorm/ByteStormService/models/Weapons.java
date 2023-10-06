package com.ByteStorm.ByteStormService.models;

import java.util.Map;

public class Weapons {
    private Map<String, WeaponPart> weapon;

    public Weapons(Map<String, WeaponPart> weapon) {
        this.weapon = weapon;
    }

    public Map<String, WeaponPart> getWeapon() {
        return weapon;
    }

    public void setWeapon(Map<String, WeaponPart> weapon) {
        this.weapon = weapon;
    }
}
