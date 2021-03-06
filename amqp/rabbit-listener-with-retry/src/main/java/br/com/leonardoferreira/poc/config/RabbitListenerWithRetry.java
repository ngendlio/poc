package br.com.leonardoferreira.poc.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RabbitListenerWithRetry {

    String event();

    int maxAttempts() default 1;

    int ttlRetry() default 5000;

    Class<? extends Exception>[] discardWhen() default {};

    Class<? extends Exception>[] dlqWhen() default {};

}
