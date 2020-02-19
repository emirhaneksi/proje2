/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2;

import java.util.ArrayList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;

/**
 *
 * @author libir
 */

public abstract class Player {
	
	private String Player_name;
	private int Player_Id, SKOR;
	ArrayList<Pokemon> CARD_LIST = new ArrayList<Pokemon>();
	Player(){
		
	}
	
	Player(int oyuncuID, String oyuncuAdi, int Skor){
		Player_Id = oyuncuID;
		Player_name = oyuncuAdi;
		SKOR = Skor;
	}

    public String getPlayer_name() {
        return Player_name;
    }

    public void setPlayer_name(String Player_name) {
        this.Player_name = Player_name;
    }

    public int getPlayer_Id() {
        return Player_Id;
    }

    public void setPlayer_Id(int Player_Id) {
        this.Player_Id = Player_Id;
    }

    public int getSKOR() {
        return SKOR;
    }

    public void setSKOR(int SKOR) {
        this.SKOR = SKOR;
    }
	
	
	
	public abstract Pokemon kartSec();
}
