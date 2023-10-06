package com.ByteStorm.ByteStormService.models;

import java.util.Map;

public class WeaponPart {
    private Map<String, String> part;

    public WeaponPart(Map<String, String> part) {
        this.part = part;
    }

    public Map<String, String> getPart() {
        return part;
    }

    public void setPart(Map<String, String> part) {
        this.part = part;
    }
}
