package com.mentorama.Mod08Seguranca.controllers;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

//    @RolesAllowed("user")
    @PreAuthorize("hasRole('user')")
    @GetMapping
    public List<String> findAll() {
        return Arrays.asList("Book 1", "Book 2", "Book 3");
    }

}
