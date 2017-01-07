/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.cdi;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class Pessoa implements Serializable {

    private String texto;

    public void sai(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void sai() {
        JOptionPane.showMessageDialog(null, texto);
    }

    public Pessoa(String texto) {
        this.texto = texto;
    }

    public Pessoa() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
