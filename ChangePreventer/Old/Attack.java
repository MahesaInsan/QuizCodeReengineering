package ChangePreventer.Old;

public class Attack{
    static int baseDamage;

    public static int normalAttack(){
        return baseDamage;
    }

    public static int heavyAttack(){
        return baseDamage*3;
    }

    public static int normalAttackBuffed(){
        return baseDamage*2;
    }

    public static int heavyAttackBuffed(){
        return baseDamage*2*3;
    }
}