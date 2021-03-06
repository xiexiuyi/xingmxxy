package com.xxy.springbootstarterbwiemqtt.annotayion;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MqttListener {
    String[] topics() default {};
}
