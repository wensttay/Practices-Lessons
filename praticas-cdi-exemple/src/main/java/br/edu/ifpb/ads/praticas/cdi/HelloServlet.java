package br.edu.ifpb.ads.praticas.cdi;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.inject.Inject;

/**
 * @version 1.0
 * @author Wensttay de Sousa Alencar <yattsnew@gmail.com>
 * @date 07/01/2017 - 12:01:31
 */
@WebServlet(value = "/hello", name = "helloServlet")
public class HelloServlet extends GenericServlet {

    @Inject
    Pessoa pessoa;

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        pessoa.sai("Olá!!!!");
    }
}
