/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.jsf.controllers;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;
import br.edu.ifpb.ads.praticas.jsf.Cliente;
import br.edu.ifpb.ads.praticas.jsf.service.ClienteService;

/**
 *
 * @author vmvini
 */
@Named
@RequestScoped
public class ClientesMB implements Serializable{
    
    private Cliente selecionado;
    
    @EJB
    private ClienteService clienteService;
    
    public void remove(){
        if(selecionado != null){
            System.out.println("irei remover");
            clienteService.remove(selecionado);
            selecionado = null;
        }else{
            System.out.println("nao deu");
        }
    }
    
    public String info(){
        return "info.xhtml?clienteId="+selecionado.getId();
    }
    
    public String edit(){
        return "edit.xhtml?clienteId="+selecionado.getId();
    }
    
    public String adicionar(){
        return "cadastrar.xhtml";
    }

    public Cliente getSelecionado() {
        return selecionado;
    }

    public void setSelecionado(Cliente selecionado) {
        this.selecionado = selecionado;
    }

    public void selecionar(SelectEvent event) {
        
        try{
        this.selecionado = (Cliente) event.getObject();
        }catch(Exception ex){}
        
        System.out.println("selecionado");
    }

    public Collection<Cliente> getClientes() {
        
        List<Cliente> result = clienteService.listAll();
        
        return result;
    }

}
