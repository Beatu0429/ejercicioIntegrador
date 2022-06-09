package com.example.ejemploIntegrador.services;

import com.example.ejemploIntegrador.models.Odontologo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OdontologoService {

    private List<Odontologo> odontologos = new ArrayList<>();

    public OdontologoService(){
        odontologos.add(new Odontologo(1,"juan", "Perez","112"));

    }

    public List<Odontologo> getAll(){
        return odontologos;
    }

    public Odontologo getOdontologoById(Integer id) {
        return odontologos.stream().filter(x -> x.getId() == (id)).findFirst().orElse(null);
    }

}
