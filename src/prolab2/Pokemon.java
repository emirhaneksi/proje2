/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2;

import javafx.scene.image.Image;

/**
 *
 * @author libir
 */
public class Pokemon {
   
    public  String pokemonID;
    public String pokemonAdi;
    public  String pokemonTip;
    public  Boolean kullanım=false;
    Image PokeImage;

    public Image getPokeImage() {
        return PokeImage;
    }

    public void setPokeImage(Image PokeImage) {
        this.PokeImage = PokeImage;
    }
    
    public int damage;
    
    public Pokemon(){
    
    }
    public Pokemon(String pokemonID,String pokemonAdi,String pokemonTip,Image PImage)
    {
        this.pokemonAdi = pokemonAdi;
        this.pokemonID = pokemonID;
        this.pokemonTip = pokemonTip;
        this.PokeImage=PImage;
        
    }
    public int Showdamage(){
        return this.damage;
    }
    public void kullan(){
        
        kullanım=true;
    }
    public boolean kullanıldımı(){
        
        return kullanım;
    }

    public String getPokemonID() {
        return pokemonID;
    }

    public String getPokemonAdi() {
        return pokemonAdi;
    }

    public String getPokemonTip() {
        return pokemonTip;
    }
    public void setPokemonID(String pokemonID) {
        this.pokemonID = pokemonID;
    }

    public void setPokemonAdi(String pokemonAdi) {
        this.pokemonAdi = pokemonAdi;
    }

    public void setPokemonTip(String pokemonTip) {
        this.pokemonTip = pokemonTip;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
 
    
}