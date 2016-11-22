package main.java;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletClass extends HttpServlet {

    MongoGetDatas mongoGetDatas = null;
    MongoPojo mongoPojo = new MongoPojo();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {


        String pokemon_name =  request.getParameter("pokemon_name");
        mongoGetDatas.MongoGetDatas(pokemon_name);
        String pokemon_coefficiency_table = mongoPojo.getPokemon_coefficiency_table();
        String pokemon_efficiency_table = mongoPojo.getPokemon_efficiency_table();
        String pokemon_effectivness = mongoPojo.getPokemon_effectiveness();
        String pokemon_image = mongoPojo.getPokemon_image();
        String pokemon_evoluation = mongoPojo.getPokemon_evolation();
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
