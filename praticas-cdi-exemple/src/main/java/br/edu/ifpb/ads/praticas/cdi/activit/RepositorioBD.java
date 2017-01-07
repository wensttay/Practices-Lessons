/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.cdi.activit;

import br.edu.ifpb.ads.praticas.cdi.anotation.BD;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
@BD
public class RepositorioBD implements Repositorio {

    List<I18NResolver> repository;

    public RepositorioBD() {
        repository = new ArrayList<I18NResolver>();
    }

    @Override
    public boolean save(I18NResolver i18NResolver) {
        return repository.add(i18NResolver);
    }

    @Override
    public List<I18NResolver> list() {
        return repository;
    }

}
