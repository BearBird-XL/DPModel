package com.company.proxy.section2;

/**
 * @author cbf4Life cbf4life@126.com
 * I'm glad to share my knowledge with you all.
 * 代练者
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    /**
     * 通过构造函数传递要对谁进行代练
     *
     * @param gamePlayer 需要代练的玩家
     */
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    /**
     * 代练杀怪
     */
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    /**
     * 代练登录
     *
     * @param user     用户名
     * @param password 密码
     */
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);

    }

    /**
     * 代练升级
     */
    public void upgrade() {
        this.gamePlayer.upgrade();

    }

}
