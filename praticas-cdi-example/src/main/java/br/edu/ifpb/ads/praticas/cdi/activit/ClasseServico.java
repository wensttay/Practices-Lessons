/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.cdi.activit;

import br.edu.ifpb.ads.praticas.cdi.anotation.BD;
import javax.inject.Inject;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class ClasseServico {

    @Inject
    private I18NResolver i18NResolver;

    @Inject
    @BD
    private Repositorio repositorio;

    public ClasseServico() {
    }

    public Repositorio getRepositorio() {
        return repositorio;
    }

    public void setRepositorio(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public I18NResolver getI18NResolver() {
        return i18NResolver;
    }

    public void setI18NResolver(I18NResolver i18NResolver) {
        this.i18NResolver = i18NResolver;
    }

    public boolean sendText(String mensage) {
        i18NResolver.setText(mensage);
        return repositorio.save(i18NResolver);
    }

}
