package dojo;

import cucumber.api.java.bs.A;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String message;
    private String target;
    private String owner;
    private List<String> cocktails_ordered;

    public Order(){
        this.owner = "";
        this.target="";
        this.cocktails_ordered = new ArrayList<>();
        this.message="";
    }

    public void declareOwner(String romeo) {
        this.owner = romeo;
    }

    public void declareTarget(String juliette) {
        this.target = juliette;
    }

    public List<String> getCocktails() {
        return this.cocktails_ordered;
    }

    public void addCocktail(int nbCocktails) {
        for(int i = 0; i < nbCocktails; i++) {
            this.cocktails_ordered.add("cocktail");
        }
    }
    public String getOwner() {
        return owner;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String createTicket(){
        return "From "+this.owner+" To "+this.target+": "+this.message;
    }
}
