package br.com.leonardoferreira.poc.feign.client;

import br.com.leonardoferreira.poc.feign.client.config.ClientConfiguration;
import br.com.leonardoferreira.poc.feign.domain.Todo;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@FeignClient(name = "todo-service", url = "https://jsonplaceholder.typicode.com")
public interface TodoClient {

    @GetMapping("/todos")
    Flux<List<Todo>> findAll();

    @GetMapping("/todos/{id}")
    Mono<Todo> findById(@PathVariable("id") Long id);

}
