package com.example.ejemploIntegrador.controllers;

import com.example.ejemploIntegrador.models.Paciente;
import com.example.ejemploIntegrador.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Controller
public class PacienteController {

    @Autowired
    public PacienteService pacienteService = new PacienteService();

    @GetMapping("/todos")
    public List<Paciente> getAll(){
        return pacienteService.getAll();
    }

}

