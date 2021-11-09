package soliddemo.withsolid;

class Player {
    PlayerAttackable attackType;
    void setAttackType(PlayerAttackable attackType){
        this.attackType = attackType;
    }
    void attack(){
        attackType.midRangeAttack();
        attackType.killEnemy();
    }
}
