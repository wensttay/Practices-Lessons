/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.cdi.activit;

import br.edu.ifpb.ads.praticas.cdi.anotation.BD;
import javax.enterprise.inject.Produces;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class ProdutorI18NResolver {

    @Produces
    @BD
    public I18NResolver createI18NResolver() {
        return new I18NResolver();
    }

}
