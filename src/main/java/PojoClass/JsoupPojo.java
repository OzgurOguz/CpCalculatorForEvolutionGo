package main.java.PojoClass;


import java.util.ArrayList;
import java.util.List;

public class JsoupPojo {
    private List<String> pokemon_efficiency = null;
    private List efficiency_table = new ArrayList();
    private List<String> pokemon_efficiency_table = new ArrayList<String>();
    private List<String> pokemon_efficiency_explain_table = new ArrayList<String>();
    private List efficiency_explain_table = new ArrayList();
    private List<String> pokemon_coefficiency_table = new ArrayList<String>();
    private List coefficiency_table = new ArrayList();
    private String pokemon_images;
    private String pokemon_name;
    private String pokemon_evolation;


    public List<String> getPokemon_efficiency() {
        return pokemon_efficiency;
    }

    public void setPokemon_efficiency(List<String> pokemon_efficiency) {
        this.pokemon_efficiency = pokemon_efficiency;
    }

    public List getEfficiency_table() {
        return efficiency_table;
    }

    public void setEfficiency_table(List efficiency_table) {
        this.efficiency_table = efficiency_table;
    }

    public List<String> getPokemon_efficiency_table() {
        return pokemon_efficiency_table;
    }

    public void setPokemon_efficiency_table(List<String> pokemon_efficiency_table) {
        this.pokemon_efficiency_table = pokemon_efficiency_table;
    }

    public List<String> getPokemon_efficiency_explain_table() {
        return pokemon_efficiency_explain_table;
    }

    public void setPokemon_efficiency_explain_table(List<String> pokemon_efficiency_explain_table) {
        this.pokemon_efficiency_explain_table = pokemon_efficiency_explain_table;
    }

    public List getEfficiency_explain_table() {
        return efficiency_explain_table;
    }

    public void setEfficiency_explain_table(List efficiency_explain_table) {
        this.efficiency_explain_table = efficiency_explain_table;
    }

    public List<String> getPokemon_coefficiency_table() {
        return pokemon_coefficiency_table;
    }

    public void setPokemon_coefficiency_table(List<String> pokemon_coefficiency_table) {
        this.pokemon_coefficiency_table = pokemon_coefficiency_table;
    }

    public List getCoefficiency_table() {
        return coefficiency_table;
    }

    public void setCoefficiency_table(List coefficiency_table) {
        this.coefficiency_table = coefficiency_table;
    }

    public String getPokemon_images() {
        return pokemon_images;
    }

    public void setPokemon_images(String pokemon_images) {
        this.pokemon_images = pokemon_images;
    }

    public String getPokemon_name() {
        return pokemon_name;
    }

    public void setPokemon_name(String pokemon_name) {
        this.pokemon_name = pokemon_name;
    }

    public String getPokemon_evolation() {
        return pokemon_evolation;
    }

    public void setPokemon_evolation(String pokemon_evolation) {
        this.pokemon_evolation = pokemon_evolation;
    }
}
