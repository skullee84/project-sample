package com.appskimo.app;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@Slf4j
class JavaTests {

    private static final String TEMP = """
        {"key":"key","value":"value"}
        """;

    @Test
    void contextLoads() {
        log.debug("{}", TEMP);
        Assertions.assertEquals("{\"key\":\"key\",\"value\":\"value\"}\n", TEMP);
    }

}
