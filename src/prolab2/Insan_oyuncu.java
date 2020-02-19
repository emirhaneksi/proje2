/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2;

import java.util.Random;
import javafx.scene.image.Image;

/**
 *
 * @author libir
 */
public class Insan_oyuncu extends Player{

    @Override
    public Pokemon kartSec() {
        Random random= new Random();
        int a = random.nextInt(CARD_LIST.size());
       Pokemon pok= CARD_LIST.get(a);
            CARD_LIST.remove(a);
        return null;
    }

    public Insan_oyuncu() {
    }

    public Insan_oyuncu(int oyuncuID, String oyuncuAdi, int Skor) {
        super(oyuncuID, oyuncuAdi, Skor);
    }

 

    
    
    
}
