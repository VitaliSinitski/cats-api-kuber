package com.example.catsapikuber.service;

import com.example.catsapikuber.dto.CatDto;
import com.example.catsapikuber.entity.Cat;
import com.example.catsapikuber.repository.CatRepository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public Cat save (CatDto catDto) {
        Cat cat = Cat.builder()
                .name(catDto.getName())
                .birthDay(catDto.getBirthDay())
                .id(UUID.randomUUID().toString())
                .createdAt(LocalDateTime.now())
                .build();
        return catRepository.save(cat);
    }

    public List<Cat> getAll() {
        return catRepository.findAll();
    }
}
