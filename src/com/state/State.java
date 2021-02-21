package com.state;

public abstract class State {
    // 扣除積分 - 50
    public abstract void deductMoney();

    // 是否抽中獎品
    public abstract boolean raffle();

    // 發放獎品
    public abstract void dispensePrize();
}
