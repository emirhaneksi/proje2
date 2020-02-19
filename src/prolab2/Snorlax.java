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
public class Snorlax extends Pokemon {
    private int damage = 30;
    private boolean kullanim = false;
    
    
    public Snorlax(){
        
    }

    public Snorlax(String pokemonID, String pokemonAdi, String pokemonTip, Image PImage) {
        super(pokemonID, pokemonAdi, pokemonTip, PImage);
    }
    
  

    @Override
    public int Showdamage() {
        return damage;
    }

    @Override
    public boolean kullanıldımı() {
        return super.kullanıldımı(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void kullan() {
        super.kullan(); //To change body of generated methods, choose Tools | Templates.
    }

    
   
    
    
}