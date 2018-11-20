package com.charcoal.gameserver.spring.boot.autoconfigure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.io.Resource;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

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
    private final GameServerProperties properties;

    public GameServerAutoConfiguration(GameServerProperties properties) {
        this.properties = properties;
    }

    @PostConstruct
    public void init() {
        logger.info("GameServerAutoConfiguration init.");
    }

}
