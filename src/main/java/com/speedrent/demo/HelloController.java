package com.speedrent.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(
            value = "/hello",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public String index() {
        return "{\n" +
                "  \"cars\": {\n" +
                "    \"manufacturer\": \"Proton\",\n" +
                "    \"name\": \"Saga\"\n" +
                "  }\n" +
                "}";
    }
}
