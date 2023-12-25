package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * RESTController-class offering the following endpoints:
 * GET seats - JSON object of a cinema room displaying all available seats with prices
 * POST purchase - receiving a seat key in the request body for which a ticket is purchased, if
 *                 seat is valid and  available -> also returns a token for possible refunding
 * POST return - receiving a token in request body and refunds the seat
 * Post stats - returns the current SalesStatistic to a password authorized requester
 */
@RestController
public class ExampleController {

    @GetMapping()
    public String hello() {
        return "Hello World!";
    }
}