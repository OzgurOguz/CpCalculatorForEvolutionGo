package main.java;

import main.java.MongoDbProcesses.MongoGetDatas;
import main.java.PojoClass.MongoPojo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ServletClass extends HttpServlet {

    MongoGetDatas mongoGetDatas;
    MongoPojo mongoPojo;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String pokemon_name =  request.getParameter("pokemon_name");
        request.setAttribute("pokemon_name", pokemon_name);
        mongoGetDatas.MongoGetDatas(pokemon_name);
        mongoPojo = new MongoPojo(mongoPojo.getPokemon_coefficiency_table(), mongoPojo.getPokemon_efficiency_table(), mongoPojo.getPokemon_effectiveness(),
                mongoPojo.getPokemon_image(),  mongoPojo.getPokemon_evolation());
    request.setAttribute("mongoPojoDatas", mongoPojo);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }
}
