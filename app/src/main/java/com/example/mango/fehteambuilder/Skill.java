package com.example.mango.fehteambuilder;

/**
 * Created by Mango on 3/26/2017.
 */

public class Skill {

    private int _skillSlot;
    private boolean _isUnique, _isRestricted, _restrictionType;
    private MyEnums.WeaponType _restrictedWeapon;
    private MyEnums.MoveType _restrictedMove;

    private String _skillText, _skillName;

    private int _weaponMight, _weaponRange, _skillCooldown;
}
