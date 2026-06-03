package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        Voiture voiture = new Voiture("Renault", 10000);
        assertEquals("Renault", voiture.getMarque());
        assertEquals(10000, voiture.getPrix());
    }

    @Test
    void modifierVoiture(){
        Voiture voiture = new Voiture();
        voiture.setMarque("Peugeot");
        voiture.setPrix(20000);
        voiture.setId(1);
        assertEquals("Peugeot", voiture.getMarque());
        assertEquals(20000, voiture.getPrix());
        assertEquals(1, voiture.getId());
    }

}