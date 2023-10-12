package com.wernek.threads;

import com.wernek.model.Clima;
import com.wernek.service.ClimaService;
import java.util.List;
import javax.swing.JLabel;

public class DadosFakeThread extends Thread {

    private List<Clima> listClima;
    private ClimaService service = new ClimaService();
    private JLabel txtDia;
    private JLabel txtHora;
    private JLabel txtHumidade;
    private JLabel txtNascerDoSol;
    private JLabel txtPorDoSol;
    private JLabel txtTemperatura;
    private JLabel txtTempo;
    private JLabel txtVelocidadeDoVento;

    public void preencherDados(Clima clima) {
        this.txtDia.setText(clima.getDia().toString());
        this.txtHora.setText(clima.getHora());
        this.txtHumidade.setText(clima.getHumidade());
        this.txtNascerDoSol.setText(clima.getNascerDoSol());
        this.txtPorDoSol.setText(clima.getPorDoSol());
        this.txtTemperatura.setText(clima.getTemperatura());
        this.txtTempo.setText(clima.getTempo());
        this.txtVelocidadeDoVento.setText(clima.getVelocidade());

    }

    @Override
    public void run() {
        System.out.println("Thread Iniciou!!");
        try {
            for (Clima clima : this.listClima) {
                preencherDados(clima);
                sleep(10000);
            }
        } catch (InterruptedException ex) {
            System.out.println("");
        }
        System.out.println("Thread Finalizou!!");
    }

    public void init(JLabel txtDia, JLabel txtHora, JLabel txtHumidade, JLabel txtNascerDoSol, JLabel txtPorDoSol, JLabel txtTemperatura, JLabel txtTempo, JLabel txtVelocidadeDoVento) {
        this.listClima = service.getClimaFake();

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
