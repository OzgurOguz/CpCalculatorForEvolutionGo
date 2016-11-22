package main.java;

import main.java.PojoClass.JsoupPojo;
import main.java.Rewritable.JsoupAdresses;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;
import java.util.List;


public class GetDataWithJsoup{

    JsoupPojo jsoupPojo = new JsoupPojo();

    ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
    JsoupAdresses jsoupAdresses = (JsoupAdresses) context.getBean("jsoupAdresses");

    public String Pokemon_name(int i) throws IOException {
        Document doc = Jsoup.connect(jsoupAdresses.getPokemon_website_adres().toString() + i).get();
        jsoupPojo.setPokemon_name(doc.select(jsoupAdresses.getPokemon_name_html_path().toString()).text());
        return jsoupPojo.getPokemon_name();
    }

    public String Pokemon_images(int i) throws IOException {
        Document doc = Jsoup.connect(jsoupAdresses.getPokemon_website_adres().toString() + i).get();
        jsoupPojo.setPokemon_images(doc.select(jsoupAdresses.getPokemon_images().toString()).attr("src"));
        return jsoupPojo.getPokemon_images();
    }

    public List Pokemon_efficiency(int i) throws IOException {
        List pokemon_efficiency = jsoupPojo.getPokemon_efficiency();
        pokemon_efficiency.clear();
        Document doc = Jsoup.connect(jsoupAdresses.getPokemon_website_adres().toString() + i).get();
        pokemon_efficiency.add(doc.select(jsoupAdresses.getPokemon_efficiency().toString()).text());
        jsoupPojo.setPokemon_efficiency(pokemon_efficiency);
        return jsoupPojo.getPokemon_efficiency();
    }

    public List Pokemon_efficiency_table(int i) throws IOException {
        List pokemon_efficiency_table = jsoupPojo.getPokemon_efficiency_table();
        pokemon_efficiency_table.clear();
        Document doc = Jsoup.connect(jsoupAdresses.getPokemon_website_adres().toString() + i).get();
        pokemon_efficiency_table.add(doc.select(jsoupAdresses.getPokemon_efficiency_table().toString()).text());
        jsoupPojo.setPokemon_efficiency_table(pokemon_efficiency_table);
        return jsoupPojo.getPokemon_efficiency_table();
    }

    public List Pokemon_coefficiency_table(int i) throws IOException {
        List pokemon_coefficiency_table = jsoupPojo.getPokemon_coefficiency_table();
        pokemon_coefficiency_table.clear();
        Document doc = Jsoup.connect(jsoupAdresses.getPokemon_website_adres().toString() + i).get();
        pokemon_coefficiency_table.add(doc.select(jsoupAdresses.getPokemon_coefficiency_table().toString()).text());
        jsoupPojo.setPokemon_coefficiency_table(pokemon_coefficiency_table) ;
        return jsoupPojo.getPokemon_coefficiency_table();
    }

    public String Pokemon_evolation(int i) throws IOException {
        Document doc = Jsoup.connect(jsoupAdresses.getPokemon_website_adres().toString() + i).get();
        jsoupPojo.setPokemon_evolation(doc.select(jsoupAdresses.getPokemon_evoluation().toString()).text());
        return jsoupPojo.getPokemon_evolation();
    }
}
