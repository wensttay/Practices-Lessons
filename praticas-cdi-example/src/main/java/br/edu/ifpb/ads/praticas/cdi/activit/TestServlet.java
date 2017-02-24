package br.edu.ifpb.ads.praticas.cdi.activit;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
@WebServlet(value = "/test", name = "test")
public class TestServlet extends GenericServlet {

    @Inject
    ClasseServico servico;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        servico.sendText("Olá !!");
        List<I18NResolver> list = servico.getRepositorio().list();
        for (I18NResolver i18NResolver : list) {
            System.out.println(i18NResolver.toString());
        }
    }
}
