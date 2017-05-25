package com.example.mango.fehteambuilder;

/**
 * Created by Mango on 3/26/2017.
 */

public class Unit {

    private String _unitName, _unitTitle;
    private int[] _baseStats;
    //private Skill[] _baseSkills;
    private String[] _baseSkills;
    private MyEnums.MoveType _moveType;
    private MyEnums.WeaponType _weaponType;
    private int _boonStat, _boonStatAmount;
    private int _baneStat, _baneStatAmount;

    private Skill[] _plannedSkills;
    private int _totalSPCost, _remainingSPCost;
    //private boolean[] _skillObtained;

    Unit(String _name, String _title, int[] _baseStats, String[] _baseSkills,
         MyEnums.MoveType _moveType, MyEnums.WeaponType _weaponType){
        this._unitName = _name;
        this._unitTitle = _title;
        this._baseStats = _baseStats;
        this._baseSkills = _baseSkills;
        this._moveType = _moveType;
        this._weaponType = _weaponType;
    }

    Unit(){
        this._unitName = "null";
        this._unitTitle = "null of nulls";
        this._baseStats = null;
        this._baseSkills = null;
        this._moveType = null;
        this._weaponType = null;
    }

    public int[] get_baseStats() {
        return _baseStats;
    }

    public void set_baseStats(int[] _baseStats) {
        this._baseStats = _baseStats;
    }

    public String[] get_baseSkills() {
        return _baseSkills;
    }

    public void set_baseSkills(String[] _baseSkills) {
        this._baseSkills = _baseSkills;
    }

    public MyEnums.MoveType get_moveType() {
        return _moveType;
    }

    public void set_moveType(MyEnums.MoveType _moveType) {
        this._moveType = _moveType;
    }

    public Skill[] get_plannedSkills() {
        return _plannedSkills;
    }

    public void set_plannedSkills(Skill[] _plannedSkills) {
        this._plannedSkills = _plannedSkills;
    }

    public int get_totalSPCost() {
        return _totalSPCost;
    }

    public void set_totalSPCost(int _totalSPCost) {
        this._totalSPCost = _totalSPCost;
    }

    public int get_remainingSPCost() {
        return _remainingSPCost;
    }

    public void set_remainingSPCost(int _remainingSPCost) {
        this._remainingSPCost = _remainingSPCost;
    }

    /*public boolean[] get_skillObtained() {
        return _skillObtained;
    }*/

    /*public void set_skillObtained(boolean[] _skillObtained) {
        this._skillObtained = _skillObtained;
    }*/

    public MyEnums.WeaponType get_weaponType() {
        return _weaponType;
    }

    public void set_weaponType(MyEnums.WeaponType _weaponType) {
        this._weaponType = _weaponType;
    }
}
