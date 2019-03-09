package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/** GreetingController example. */
@RestController
public class GreetingController {

  private static final String TEMPLATE = "Hello world, %s! You are visitor number %s";
  private final AtomicLong counter = new AtomicLong();

  @RequestMapping("/")
  public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
    return String.format(TEMPLATE, name, counter.incrementAndGet());
  }

}
