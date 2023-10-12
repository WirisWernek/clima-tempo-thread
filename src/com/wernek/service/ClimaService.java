package com.wernek.service;

import com.wernek.model.Clima;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ClimaService {

    List<Clima> listClima = new ArrayList<>();

    public List<Clima> getClimaFake() {

        Clima variavel;

        // Primeiro valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Nublado", "6:00", "17:00", "6 km/s");
        listClima.add(variavel);

        // Segundo valor
        variavel = new Clima(LocalDateTime.now(), 26.3, 50.4, "Parcialmente Nublado", "6:00", "17:00", "5 km/s");
        listClima.add(variavel);

        // Terceiro valor
        variavel = new Clima(LocalDateTime.now(), 27.3, 50.4, "Parcialmente Ensolarado", "6:00", "17:00", "4.8 km/s");
        listClima.add(variavel);

        // Quarto valor
        variavel = new Clima(LocalDateTime.now(), 28.3, 60.0, "Ensolarado", "6:00", "17:00", "4.2 km/s");
        listClima.add(variavel);

        // Quinto valor
        variavel = new Clima(LocalDateTime.now(), 29.3, 60.4, "Parcialmente Nublado", "6:00", "17:00", "3.5 km/s");
        listClima.add(variavel);

        // Sexto valor
        variavel = new Clima(LocalDateTime.now(), 29.7, 62.8, "Nublado", "6:00", "17:00", "4 km/s");
        listClima.add(variavel);

        // Sétimo valor
        variavel = new Clima(LocalDateTime.now(), 30.0, 50.4, "Chuvoso", "6:00", "17:00", "6.7 km/s");
        listClima.add(variavel);

        // Nono valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Tempestuoso", "6:00", "17:00", "9.4 km/s");
        listClima.add(variavel);

        // Décimo valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Chuvoso", "6:00", "17:00", "8.1 km/s");
        listClima.add(variavel);

        // Décimo primeiro valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Nublado", "6:00", "17:00", "6.3 km/s");
        listClima.add(variavel);

        // Décimo segundo valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Parcialmente Nublado", "6:00", "17:00", "6 km/s");
        listClima.add(variavel);

        // Décimo terceiro valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Ensolarado", "6:00", "17:00", "5.4 km/s");
        listClima.add(variavel);

        // Décimo quarto valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Parcialmente Ensolarado", "6:00", "17:00", "5 km/s");
        listClima.add(variavel);

        // Décimo quinto valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Nublado", "6:00", "17:00", "6 km/s");
        listClima.add(variavel);

        // Décimo sexto valor
        variavel = new Clima(LocalDateTime.now(), 26.3, 50.4, "Parcialmente Nublado", "6:00", "17:00", "5 km/s");
        listClima.add(variavel);

        // Décimo sétimo valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Nublado", "6:00", "17:00", "6 km/s");
        listClima.add(variavel);

        // Décimo oitavo valor
        variavel = new Clima(LocalDateTime.now(), 26.3, 50.4, "Parcialmente Nublado", "6:00", "17:00", "5 km/s");
        listClima.add(variavel);

        // Décimo nono valor
        variavel = new Clima(LocalDateTime.now(), 27.3, 50.4, "Parcialmente Ensolarado", "6:00", "17:00", "4.8 km/s");
        listClima.add(variavel);

        // Vigésimo valor
        variavel = new Clima(LocalDateTime.now(), 28.3, 60.0, "Ensolarado", "6:00", "17:00", "4.2 km/s");
        listClima.add(variavel);

        // Vigésimo primeiro valor
        variavel = new Clima(LocalDateTime.now(), 29.3, 60.4, "Parcialmente Nublado", "6:00", "17:00", "3.5 km/s");
        listClima.add(variavel);

        // Vigésimo segundo valor
        variavel = new Clima(LocalDateTime.now(), 29.7, 62.8, "Nublado", "6:00", "17:00", "4 km/s");
        listClima.add(variavel);

        // Vigésimo terceiro valor
        variavel = new Clima(LocalDateTime.now(), 30.0, 50.4, "Chuvoso", "6:00", "17:00", "6.7 km/s");
        listClima.add(variavel);

        // Vigésimo quarto valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Tempestuoso", "6:00", "17:00", "9.4 km/s");
        listClima.add(variavel);

        // Vigésimo quinto valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Chuvoso", "6:00", "17:00", "8.1 km/s");
        listClima.add(variavel);

        // Vigésimo sexto valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Nublado", "6:00", "17:00", "6.3 km/s");
        listClima.add(variavel);

        // Vigésimo sétimo valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Parcialmente Nublado", "6:00", "17:00", "6 km/s");
        listClima.add(variavel);

        // Vigésimo oitavo valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Ensolarado", "6:00", "17:00", "5.4 km/s");
        listClima.add(variavel);

        // Vigésimo nono valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Parcialmente Ensolarado", "6:00", "17:00", "5 km/s");
        listClima.add(variavel);

        // Trigésimo valor
        variavel = new Clima(LocalDateTime.now(), 25.3, 50.4, "Nublado", "6:00", "17:00", "6 km/s");
        listClima.add(variavel);

        return listClima;
    }

}
