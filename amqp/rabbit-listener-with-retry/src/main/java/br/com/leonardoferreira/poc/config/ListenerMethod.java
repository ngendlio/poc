package br.com.leonardoferreira.poc.config;

import java.lang.reflect.Method;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class ListenerMethod {

    private final Method method;

    private final RabbitListenerWithRetry annotation;

}
