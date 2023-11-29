package com.autoconfiguration.conditional;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(ConditionalOSCondition.class)
public @interface ConditionalOS {
    String value();
}
