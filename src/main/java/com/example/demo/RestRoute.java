package com.example.demo;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
public class RestRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {

        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.json);

        rest().path("students")
                .post()
                .type(Student.class)
                .outType(Map.class).to("bean:studentBean?method=helloDude(2)");

        rest().path("students1")
                .post()
                .type(Student.class)
                .outType(Map.class).to("bean:studentBean?method=helloDude(2)");

    }
}
