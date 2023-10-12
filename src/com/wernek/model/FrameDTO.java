/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wernek.model;

import javax.swing.JLabel;

/**
 *
 * @author wiris
 */
public class FrameDTO {

    public JLabel txtDia;
    public JLabel txtHora;
    public JLabel txtHumidade;
    public JLabel txtNascerDoSol;
    public JLabel txtPorDoSol;
    public JLabel txtTemperatura;
    public JLabel txtTempo;
    public JLabel txtVelocidadeDoVento;

    public FrameDTO(JLabel txtDia, JLabel txtHora, JLabel txtHumidade, JLabel txtNascerDoSol, JLabel txtPorDoSol, JLabel txtTemperatura, JLabel txtTempo, JLabel txtVelocidadeDoVento) {
        this.txtDia = txtDia;
        this.txtHora = txtHora;
        this.txtHumidade = txtHumidade;
        this.txtNascerDoSol = txtNascerDoSol;
        this.txtPorDoSol = txtPorDoSol;
        this.txtTemperatura = txtTemperatura;
        this.txtTempo = txtTempo;
        this.txtVelocidadeDoVento = txtVelocidadeDoVento;
    }

}
