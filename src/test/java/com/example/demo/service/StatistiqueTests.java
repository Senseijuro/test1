package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@SpringBootTest
public class StatistiqueTests {

    @Test
    void prixMoyen(){
        Voiture voiture1 = mock(Voiture.class);
        Voiture voiture2 = mock(Voiture.class);
        when(voiture1.getPrix()).thenReturn(100);
        when(voiture2.getPrix()).thenReturn(200);

        StatistiqueImpl statistiqueImpl = new StatistiqueImpl();
        statistiqueImpl.ajouter(voiture1);
        statistiqueImpl.ajouter(voiture2);

        Echantillon echantillon = statistiqueImpl.prixMoyen();
        assertEquals(2, echantillon.getNombreDeVoitures());
        assertEquals(150, echantillon.getPrixMoyen());
    }

    @Test
    void aucuneVoiture(){
        StatistiqueImpl statistiqueImpl = new StatistiqueImpl();
        assertThrows(ArithmeticException.class, () -> statistiqueImpl.prixMoyen());
    }

}