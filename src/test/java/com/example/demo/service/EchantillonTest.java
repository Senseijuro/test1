package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EchantillonTest {

    @Test
    void echantillon(){
        Echantillon echantillon = new Echantillon();
        echantillon.setNombreDeVoitures(5);
        echantillon.setPrixMoyen(300);
        assertEquals(5, echantillon.getNombreDeVoitures());
        assertEquals(300, echantillon.getPrixMoyen());
    }

}