package soliddemo.withsolid;

class LandAttack implements LandPlayerAttackable {
    public void shortRangeAttack(){
        System.out.println("this is a short attack");
        killEnemy();
    }
    public void midRangeAttack(){
        System.out.println("this is a mid attack");
        killEnemy();
    }


    public void killEnemy() {
        System.out.println("killed enemy");
    }
}
