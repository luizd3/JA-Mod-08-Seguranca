package com.mentorama.Mod08Seguranca.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @RolesAllowed("oauth-test-user")
    @GetMapping
    public List<String> findAll() {
        return Arrays.asList("Book 1", "Book 2", "Book 3");
    }

}
