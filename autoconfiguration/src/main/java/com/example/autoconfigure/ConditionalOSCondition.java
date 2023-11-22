package com.example.autoconfigure;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditionalOSCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String os = System.getProperty("os.name").toLowerCase();
        String targetOS = (String) metadata.getAnnotationAttributes(ConditionalOS.class.getName()).get("value");

        if (!os.contains("linux") && !os.contains("windows")) {
            throw new UnknownOperatingSystemException("Unsupported operating system: " + os);
        }

        return os.contains(targetOS.toLowerCase());
    }
}
