package hello.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogController {

    @GetMapping("/log")
    public String log(){
        log.trace("trace log");
        log.debug("trace debug");
        log.info("trace info");
        log.warn("trace warn");
        log.error("trace error");
        return "ok";
    }
}
