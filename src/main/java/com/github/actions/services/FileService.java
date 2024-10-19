package com.github.actions.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FileService {

    @Value("${input.file.path}")
    private String path;

    public String greeting() {
        log.info("File Path: '{}'", path);
        return "Hello World";
    }

}
