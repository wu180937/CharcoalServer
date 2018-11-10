package com.charcoal.gameserver.spring.boot.autoconfigure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import javax.annotation.PostConstruct;

/**
 * @Auther: wumingjie
 * @Date: 2018/11/10
 * @Description:
 */
@Configurable
@EnableConfigurationProperties(GameServerProperties.class)
public class GameServerAutoConfiguration {

    private static final Logger logger = LoggerFactory.getLogger(GameServerAutoConfiguration.class);

    @PostConstruct
    public void init() {
        logger.info("game server init");
    }
}
