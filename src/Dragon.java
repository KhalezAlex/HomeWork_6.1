public class Dragon {

    private static int spAtt(int allHpSP, int spHp, int spAtt,int drHp) {
        if (allHpSP % spHp == 0) {
            drHp -= spAtt * allHpSP / spHp;
        } else {
            drHp -= spAtt * (1 + allHpSP / spHp);
        }
        return drHp;
    }

    private static int fight(int allHpSP, int spHp, int spAtt, int drHp, int drAtt) {
        while (allHpSP > 0) {
            drHp = spAtt(allHpSP, spHp, spAtt, drHp);
            if (drHp <= 0) {
                return drHp;
            } else {
                allHpSP -= drAtt;
            }
        }
        return drHp;
    }

    public static int spAmount(int spHp, int spAtt, int drAtt, int spAmount, int hpDrTMP) {
        while (true) {
            int allHpSP = spAmount * spHp;
            int drHp = hpDrTMP;

            drHp = fight(allHpSP, spHp, spAtt, drHp, drAtt);
            if (drHp <= 0) {
                return spAmount;
            } else {
                spAmount++;
            }
        }
    }
}