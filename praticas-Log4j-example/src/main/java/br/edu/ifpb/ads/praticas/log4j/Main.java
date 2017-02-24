/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.ads.praticas.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
public class Main {
    
    private static Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {
        logger.info("Essa mensagem de info n vai aparecer");
        logger.error("Uma mensagem de erro");
    }
}
