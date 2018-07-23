package com.ing.mercatus.tixstub.composer;

import com.google.common.collect.Lists;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/composer/programs/")
class ComposerController {


    @GetMapping
    List<ProgramDTO> getPrograms() {
        return Lists.newArrayList(new ProgramDTO(1, "program name"), new ProgramDTO(2 , "other name"));

    }

    @GetMapping(value = "/{id}")
    ProgramDTO getProgram(@PathVariable("id") long id) {
        return new ProgramDTO(1, "program name" +
                "");

    }
}
