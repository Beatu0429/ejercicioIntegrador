package com.example.ejemploIntegrador.controllers;

import com.example.ejemploIntegrador.models.Odontologo;
import com.example.ejemploIntegrador.models.Paciente;
import com.example.ejemploIntegrador.services.OdontologoService;
import com.example.ejemploIntegrador.services.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OndontologoController {

    @Autowired
    public OdontologoService odontologoService = new OdontologoService();
    public PacienteService pacienteService = new PacienteService();

    @GetMapping("/emailO")
    public String getOdontologoById(@RequestParam(defaultValue="1") Integer id, Model model){
        Odontologo odontologo= odontologoService.getOdontologoById(id);

        if(odontologo == null) return "no se encontro odontologo con ese id";

        model.addAttribute("name", odontologo.getNombre());
        model.addAttribute("surname", odontologo.getApellido());
        model.addAttribute("matricula", odontologo.getMatricula());

        return "emailO";
    }

    @GetMapping("/email")
    public String getPacientByEmail(@RequestParam(name="name", required=false, defaultValue="mail@mail.com") String email, Model model){
        Paciente paciente= pacienteService.getPacientByEmail(email);

        if(paciente == null) return "no se encontro paciente con ese email";

        model.addAttribute("name", paciente.getNombre());
        model.addAttribute("surname", paciente.getApellido());
        model.addAttribute("matricula", paciente.getOdontologo().getMatricula());

        return "email";
    }



}
