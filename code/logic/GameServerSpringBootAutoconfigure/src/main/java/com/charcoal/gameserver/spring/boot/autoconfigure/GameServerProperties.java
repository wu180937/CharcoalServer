package com.charcoal.gameserver.spring.boot.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Auther: wumingjie
 * @Date: 2018/11/10
 * @Description:
 */
@ConfigurationProperties(prefix = GameServerProperties.GAME_SERVER_PREFIX)
public class GameServerProperties {
    public static final String GAME_SERVER_PREFIX = "gameserver";
    private String ip;
    private String port;
    private int workPoolSize;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getWorkPoolSize() {
        return workPoolSize;
    }

    public void setWorkPoolSize(int workPoolSize) {
        this.workPoolSize = workPoolSize;
    }
}
