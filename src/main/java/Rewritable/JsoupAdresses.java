package main.java.Rewritable;

import main.java.GetDataWithJsoup;
import org.springframework.beans.factory.annotation.Autowired;


public class JsoupAdresses {
    @Autowired
    private GetDataWithJsoup pokemon_website_adres;
    @Autowired
    private GetDataWithJsoup pokemon_name_html_path;
    @Autowired
    private GetDataWithJsoup pokemon_images;
    @Autowired
    private GetDataWithJsoup pokemon_efficiency;
    @Autowired
    private GetDataWithJsoup pokemon_efficiency_table;
    @Autowired
    private GetDataWithJsoup pokemon_coefficiency_table;
    @Autowired
    private GetDataWithJsoup pokemon_evoluation;


    public GetDataWithJsoup getPokemon_website_adres() {
        return pokemon_website_adres;
    }

    public void setPokemon_website_adres(GetDataWithJsoup pokemon_website_adres) {
        this.pokemon_website_adres = pokemon_website_adres;
    }

    public GetDataWithJsoup getPokemon_name_html_path() {
        return pokemon_name_html_path;
    }

    public void setPokemon_name_html_path(GetDataWithJsoup pokemon_name_html_path) {
        this.pokemon_name_html_path = pokemon_name_html_path;
    }

    public GetDataWithJsoup getPokemon_images() {
        return pokemon_images;
    }

    public void setPokemon_images(GetDataWithJsoup pokemon_images) {
        this.pokemon_images = pokemon_images;
    }

    public GetDataWithJsoup getPokemon_efficiency() {
        return pokemon_efficiency;
    }

    public void setPokemon_efficiency(GetDataWithJsoup pokemon_efficiency) {
        this.pokemon_efficiency = pokemon_efficiency;
    }

    public GetDataWithJsoup getPokemon_efficiency_table() {
        return pokemon_efficiency_table;
    }

    public void setPokemon_efficiency_table(GetDataWithJsoup pokemon_efficiency_table) {
        this.pokemon_efficiency_table = pokemon_efficiency_table;
    }

    public GetDataWithJsoup getPokemon_coefficiency_table() {
        return pokemon_coefficiency_table;
    }

    public void setPokemon_coefficiency_table(GetDataWithJsoup pokemon_coefficiency_table) {
        this.pokemon_coefficiency_table = pokemon_coefficiency_table;
    }

    public GetDataWithJsoup getPokemon_evoluation() {
        return pokemon_evoluation;
    }

    public void setPokemon_evoluation(GetDataWithJsoup pokemon_evoluation) {
        this.pokemon_evoluation = pokemon_evoluation;
    }
}
