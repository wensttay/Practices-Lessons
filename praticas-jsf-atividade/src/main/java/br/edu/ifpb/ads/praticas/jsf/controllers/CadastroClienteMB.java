/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.jsf.controllers;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import br.edu.ifpb.ads.praticas.jsf.Cliente;
import br.edu.ifpb.ads.praticas.jsf.service.ClienteService;

/**
 *
 * @author vmvini
 */
@Named
@RequestScoped
public class CadastroClienteMB {
    
    private Cliente cliente;
    
    @EJB
    private ClienteService clienteService;
    
    public void cadastrar(){
        System.out.println("salvando...");
        clienteService.persist(cliente);
        cliente = new Cliente();
        System.out.println("salvei e limpei");
        System.out.println("listando...");
        System.out.println(clienteService.listAll());
    }
    
    @PostConstruct
    public void init(){
        //isso é para formulario de alterar dados do cliente
       //pegando id passado por parametro de requisição get
       String value = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("clienteId");
       
       if(value != null && value.trim().isEmpty()){
           putClienteById(Integer.parseInt(value));
       }
       
       cliente = new Cliente();
       
    }
    
    private void putClienteById(int id){
        cliente = clienteService.find(id);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
