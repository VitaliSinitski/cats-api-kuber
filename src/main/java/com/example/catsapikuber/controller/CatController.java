package com.example.catsapikuber.controller;

import com.example.catsapikuber.dto.CatDto;
import com.example.catsapikuber.entity.Cat;
import com.example.catsapikuber.service.CatService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8080/swagger-ui/index.html
@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {
    private final CatService catService;

    @PostMapping
    public Cat save(@RequestBody CatDto cat) {
        return catService.save(cat);
    }

    @GetMapping
    public List<Cat> getAll() {
        return catService.getAll();
    }
}
