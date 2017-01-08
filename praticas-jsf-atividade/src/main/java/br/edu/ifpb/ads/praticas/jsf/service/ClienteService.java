/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.jsf.service;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import br.edu.ifpb.ads.praticas.jsf.Cliente;

/**
 *
 * @author Victor Hugo <victor.hugo.origins@gmail.com>
 */
@Stateless
public class ClienteService {
    
    @PersistenceContext(unitName = "soladinhobrPU")
    private  EntityManager em;
    
    public void persist(Cliente cliente){
        
        em.persist(cliente);
    }
    
    public void merge(Cliente cliente){
        
        em.merge(cliente);
    }
    
    public void refresh(Cliente cliente){
        
        em.refresh(cliente);
    }
    
    public void remove(Cliente cliente){
        
        System.out.println("removendo..."+cliente);
        em.remove(em.merge(cliente));
        em.flush();
    }
    
    public Cliente find(int id){
        
       return em.find(Cliente.class, id);
    }
    
    public List<Cliente> executNativeQuery(String sql){
        
        List<Cliente> result;
        
        Query query = em.createNativeQuery(sql, Cliente.class);
        
        result = query.getResultList();
        
        return result;
    }
    
    public List<Cliente> listAll(){
        
        String sqlQuery = "SELECT * FROM Cliente";
        
        return executNativeQuery(sqlQuery);
        
    }

}
