package com.br.pw_study.service;

import com.br.pw_study.dto.DisciplinaResponseDTO;
import com.br.pw_study.entity.Disciplina;
import com.br.pw_study.repository.DisciplinaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DisciplinaService {
    @Autowired
    private DisciplinaRepository repository;

    private ModelMapper modelMapper = new ModelMapper();
    public List<DisciplinaResponseDTO> listar(){
        var disciplina =  repository.findAll();
        var resultado = disciplina.stream().map(
                e-> modelMapper.map(e,DisciplinaResponseDTO.class)).collect(Collectors.toList());
        return resultado;
    }
}
