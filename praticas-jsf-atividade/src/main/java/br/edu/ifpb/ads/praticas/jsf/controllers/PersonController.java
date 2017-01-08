/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.jsf.controllers;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import br.edu.ifpb.ads.praticas.jsf.Cliente;
import br.edu.ifpb.ads.praticas.jsf.service.ClienteService;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
@Named
@RequestScoped
public class PersonController {

    @EJB
    private ClienteService clienteService;

    private Cliente cliente;

    @PostConstruct
    private void init() {

        cliente = new Cliente("victor", "email@email", "123", "arebaba", "123", "123");
    }

    public void persist() {

        clienteService.persist(cliente);
    }

    public void print() {

        System.out.println("printando ");

        List<Cliente> result = clienteService.listAll();
        
        System.out.println("total: "+result.size());
        
        System.out.println(result);
    }

}
