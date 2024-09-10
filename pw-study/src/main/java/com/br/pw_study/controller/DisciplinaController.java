package com.br.pw_study.controller;

import com.br.pw_study.dto.DisciplinaResponseDTO;
import com.br.pw_study.entity.Disciplina;
import com.br.pw_study.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

        @Autowired
        private DisciplinaService service;

        public List<DisciplinaResponseDTO> listar() {

            return service.listar();
        }
    }

