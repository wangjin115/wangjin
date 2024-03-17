package com.wj.tankgame3;

/**
 * @author wj
 * @version 1.0
 */
public class EnemyTank extends Tank {

    private int direct=2;
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public int getDirect() {
        return direct;
    }

    @Override
    public void setDirect(int direct) {
        this.direct = direct;
    }

}
