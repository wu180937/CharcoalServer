package com.charcoal.gameserver.annotation;

import java.lang.annotation.*;

/**
 * @Auther: wumingjie
 * @Date: 2018/11/19
 * @Description:
 */
@Target( { ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Cmd {
    int value();
}
