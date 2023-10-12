package com.wernek.model;

import java.time.LocalDateTime;

public class Clima {

    private LocalDateTime dia_hora;
    private Double temperatura;
    private Double humidade;
    private String tempo;
    private String nascerDoSol;
    private String porDoSol;
    private String velocidade;

    public Clima(LocalDateTime dia_hora, Double temperatura, Double humidade, String tempo, String nascerDoSol, String porDoSol, String velocidade) {
        this.dia_hora = dia_hora;
        this.temperatura = temperatura;
        this.humidade = humidade;
        this.tempo = tempo;
        this.nascerDoSol = nascerDoSol;
        this.porDoSol = porDoSol;
        this.velocidade = velocidade;
    }

    public String getDia() {
        String dia = "" + this.dia_hora.getDayOfMonth() + "/" + this.dia_hora.getMonthValue() + "/" + this.dia_hora.getYear();
        return dia;
    }

    public String getHora() {
        String hora = "" + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute();
        return hora;
    }

    public String getTemperatura() {
        return this.temperatura.toString() + " °C";
    }

    public String getHumidade() {
        return this.humidade.toString() + " %";
    }

    public String getTempo() {
        return this.tempo;
    }

    public String getNascerDoSol() {
        return this.nascerDoSol;
    }

    public String getPorDoSol() {
        return this.porDoSol;
    }

    public String getVelocidade() {
        return this.velocidade;
    }

}
