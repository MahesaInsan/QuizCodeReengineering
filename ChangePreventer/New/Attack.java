package ChangePreventer.New;

public class Attack {
    static int baseDamage;

    public static int normalAttack(){
        return baseDamage;
    }

    public static int heavyAttack(){
        return baseDamage*3;
    }

    public static int buffedAttack(){
        return baseDamage*2;
    }

    public static int normalAttackBuffed(){
        return buffedAttack();
    }

    public static int heavyAttackBuffed(){
        return buffedAttack()*3;
    }
}
