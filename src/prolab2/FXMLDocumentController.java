/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author libir
 */
public class FXMLDocumentController implements Initializable {
    //tanımlamalar------------------------------------------------------------------------------
    javafx.scene.image.Image pikachu_Image=new javafx.scene.image.Image("/prolab2/Icons/pikacu.jpg");
    javafx.scene.image.Image kapak_Image=new javafx.scene.image.Image("/prolab2/Icons/kapak.jpg");
    javafx.scene.image.Image balbasar_Image=new javafx.scene.image.Image("/prolab2/Icons/balbasar.jpg");
    javafx.scene.image.Image cermander_Image=new javafx.scene.image.Image("/prolab2/Icons/cermander.jpg");
    javafx.scene.image.Image jigilipaf_Image=new javafx.scene.image.Image("/prolab2/Icons/jigilipaf.jpg");
    javafx.scene.image.Image meow_Image=new javafx.scene.image.Image("/prolab2/Icons/meow.jpg");
    javafx.scene.image.Image psydak_Image=new javafx.scene.image.Image("/prolab2/Icons/psydak.jpg");
    javafx.scene.image.Image snorlax_Image=new javafx.scene.image.Image("/prolab2/Icons/snorlax.jpg");
    javafx.scene.image.Image sukortıl_Image=new javafx.scene.image.Image("/prolab2/Icons/sukortıl.jpg");
    javafx.scene.image.Image zubat_Image=new javafx.scene.image.Image("/prolab2/Icons/zubat.jpg");
    javafx.scene.image.Image batırfiri_Image=new javafx.scene.image.Image("/prolab2/Icons/batırfiri.jpg");
    Pikachu pikachu = new Pikachu("1","pikachu","Elektirik",pikachu_Image);
    Bulbasaur bulbasaur=new Bulbasaur("2","balbasar","Su",balbasar_Image);
    Butterfree butterfree=new Butterfree("3","Butterfree","Hava",batırfiri_Image);
    Charmander charmander=new Charmander("4","Charmander","Ateş",cermander_Image);
    Jigglypuff jigglypuff=new Jigglypuff("5","Jigglypuff","Ses",jigilipaf_Image);
    Psyduck psyduck=new Psyduck("6","Psyduck","Su",psydak_Image);
    Snorlax snorlax=new Snorlax("7","Snorlax","Normal",snorlax_Image);
    Squirtle squirtle= new Squirtle("8","Squirtle","Su",sukortıl_Image);
    Zubat zubat=new Zubat("9","Zubat","Hava",zubat_Image);
    Meowth meowth=new Meowth("10","Meowth","Normal",meow_Image);
    Player InsanPlayer= new Insan_oyuncu(0,"Abuzer",0);
    Player BilgsayarPlayer= new Bilgisayar_oyuncu(0,"Abuzer a1",0);
    Player BilgiPlayer2= new Bilgisayar_oyuncu(1,"Abuzer a2",0);
    public ArrayList<Pokemon> arrayList;
    public ArrayList<ImageView> ai_pokemons;
    public ArrayList<ImageView> rezerve_pokemons;
    public ArrayList<ImageView> player_pokemons;
    int player1_dmg,player2_dmg,kart_secim_count=0,move_count=0;
    boolean secildimi=false;
    boolean oyuntip;
    ImageView son_secilen_img,son_secilen_yedek_imageView;

    @FXML
    private Button btn_ai;
    @FXML
    private ImageView img1;
    @FXML
    private ImageView img2;
    @FXML
    private ImageView img3;
    @FXML
    private ImageView img4;
    @FXML
    private ImageView img5;
    @FXML
    private ImageView img6;
    @FXML
    private ImageView player2_img;
    @FXML
    private ImageView player1_img;
    
    @FXML
    private Button btn_play;
    @FXML
    private Label label_header;
    @FXML
    private Pane pane_background;
    @FXML
    private Button fight_btn;
    @FXML
    private Label winner;
    @FXML
    private ImageView yedek_1;
    @FXML
    private ImageView yedek_2;
    @FXML
    private ImageView yedek_3;
    @FXML
    private ImageView yedek_4;
    @FXML
    private Button devam_et;
    @FXML
    private Button select_card_btn;
    @FXML
    private Button ai_fight_btn;
    @FXML
    private Button ai_next_round_btn;
    @FXML
    private Button ai_take_rezerve_btn;
    @FXML
    private Label player1_label;
    @FXML
    private Label player2_label;
   
   
//--------------------------------------------------------------------------------------------------------------------------------------------
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
       
    }   
    


    @FXML
    private void play(ActionEvent event) {
        oyuntip=true;
        if(oyuntip==true){
          img1.setVisible(true);
        img2.setVisible(true);
        img3.setVisible(true);
        img4.setVisible(true);
        img5.setVisible(true);
        img6.setVisible(true);
        player1_img.setVisible(true);
        player2_img.setVisible(true);
        label_header.setVisible(false);
        btn_ai.setVisible(false);
        btn_play.setVisible(false);
        arrayList=new ArrayList<>();
        ai_pokemons=new ArrayList<>();
        rezerve_pokemons=new ArrayList<>();
        player_pokemons=new ArrayList<>();
         arrayList.add(pikachu);
         arrayList.add(bulbasaur);
         arrayList.add(zubat);
         arrayList.add(squirtle);
         arrayList.add(snorlax);
         arrayList.add(charmander);
         arrayList.add(jigglypuff);
         arrayList.add(meowth);
         arrayList.add(psyduck);
         arrayList.add(butterfree);
         Collections.shuffle(arrayList);
         img1.setImage(arrayList.get(0).getPokeImage());
         img2.setImage(arrayList.get(1).getPokeImage());
         img3.setImage(arrayList.get(2).getPokeImage());
         img4.setImage(arrayList.get(3).getPokeImage());
         img5.setImage(arrayList.get(4).getPokeImage());
         img6.setImage(arrayList.get(5).getPokeImage());
         yedek_1.setImage(arrayList.get(6).getPokeImage());
         yedek_2.setImage(arrayList.get(7).getPokeImage());
         yedek_3.setImage(arrayList.get(8).getPokeImage());
         yedek_4.setImage(arrayList.get(9).getPokeImage());
         fight_btn.setVisible(true);
         ai_pokemons.add(img4);
         ai_pokemons.add(img5);
         ai_pokemons.add(img6);
         for(int i=0;i<ai_pokemons.size();i++){
             for(int j=0;j<arrayList.size();j++){
                 if(ai_pokemons.get(i).getImage()==arrayList.get(j).getPokeImage()){
                     BilgsayarPlayer.CARD_LIST.add(arrayList.get(j));
                 }
                 
                 
             }
             
         }
         rezerve_pokemons.add(yedek_1);
         rezerve_pokemons.add(yedek_2);
         rezerve_pokemons.add(yedek_3);
         rezerve_pokemons.add(yedek_4);
         player_pokemons.add(img1);
         player_pokemons.add(img2);
         player_pokemons.add(img3);
         for(int i =0;i<player_pokemons.size();i++){
             for(int j =0;j<arrayList.size();j++){
                 if (player_pokemons.get(i).getImage()==arrayList.get(j).getPokeImage()) {
                     InsanPlayer.CARD_LIST.add(arrayList.get(j));
                     BilgiPlayer2.CARD_LIST.add(arrayList.get(j));
                     
                 }
                 
             }
             
         }
         yedek_1.setDisable(true);
        yedek_2.setDisable(true);
        yedek_3.setDisable(true);
        yedek_4.setDisable(true);
    }  

    }

    @FXML
    private void play_ai(ActionEvent event) {
        oyuntip=false;
        if(oyuntip==false){
       img1.setVisible(true);
        img2.setVisible(true);
        img3.setVisible(true);
        img4.setVisible(true);
        img5.setVisible(true);
        img6.setVisible(true);
        player1_img.setVisible(true);
        player2_img.setVisible(true);
        label_header.setVisible(false);
        btn_ai.setVisible(false);
        btn_play.setVisible(false);
        arrayList=new ArrayList<>();
        ai_pokemons=new ArrayList<>();
        rezerve_pokemons=new ArrayList<>();
        player_pokemons=new ArrayList<>();
         arrayList.add(pikachu);
         arrayList.add(bulbasaur);
         arrayList.add(zubat);
         arrayList.add(squirtle);
         arrayList.add(snorlax);
         arrayList.add(charmander);
         arrayList.add(jigglypuff);
         arrayList.add(meowth);
         arrayList.add(psyduck);
         arrayList.add(butterfree);
         Collections.shuffle(arrayList);
        img1.setImage(arrayList.get(0).getPokeImage());
         img2.setImage(arrayList.get(1).getPokeImage());
         img3.setImage(arrayList.get(2).getPokeImage());
         img4.setImage(arrayList.get(3).getPokeImage());
         img5.setImage(arrayList.get(4).getPokeImage());
         img6.setImage(arrayList.get(5).getPokeImage());
         yedek_1.setImage(arrayList.get(6).getPokeImage());
         yedek_2.setImage(arrayList.get(7).getPokeImage());
         yedek_3.setImage(arrayList.get(8).getPokeImage());
         yedek_4.setImage(arrayList.get(9).getPokeImage());
         ai_fight_btn.setVisible(true);
         ai_pokemons.add(img4);
         ai_pokemons.add(img5);
         ai_pokemons.add(img6);
         for(int i=0;i<ai_pokemons.size();i++){
             for(int j=0;j<arrayList.size();j++){
                 if(ai_pokemons.get(i).getImage()==arrayList.get(j).getPokeImage()){
                     BilgsayarPlayer.CARD_LIST.add(arrayList.get(j));
                 }
                 
                 
             }
             
         }
         rezerve_pokemons.add(yedek_1);
         rezerve_pokemons.add(yedek_2);
         rezerve_pokemons.add(yedek_3);
         rezerve_pokemons.add(yedek_4);
         player_pokemons.add(img1);
         player_pokemons.add(img2);
         player_pokemons.add(img3);
         for(int i =0;i<player_pokemons.size();i++){
             for(int j =0;j<arrayList.size();j++){
                 if (player_pokemons.get(i).getImage()==arrayList.get(j).getPokeImage()) {
                    
                     BilgiPlayer2.CARD_LIST.add(arrayList.get(j));
                     
                 }
                 
             }
             
         }
        }
    }



    @FXML
    private void move(MouseEvent event) {
        if(oyuntip==true){
        fight_btn.setDisable(false);
        ImageView imageView =(ImageView) event.getSource();
        son_secilen_img=(ImageView)event.getSource();
        javafx.scene.image.Image image = imageView.getImage();
        System.out.println("source :"+event.getSource());
        System.out.println("Image :"+imageView.getImage());
        // kartı ortaya at
   
        if(move_count==0){
            imageView.setImage(null);
            imageView.setDisable(true);
           move_count++;
        }else{
            for(int i = 0;i<player_pokemons.size();i++){
                if(player_pokemons.get(i).getImage()==null){
                    player_pokemons.get(i).setImage(player1_img.getImage());
                    player_pokemons.get(i).setDisable(false);
                    imageView.setImage(null);
                    imageView.setDisable(true);
                }
            }}
            player1_img.setImage(image);
            
        
                
        
        
        //kartın dmg değerini al
      
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i).PokeImage==image){
                player1_dmg=arrayList.get(i).Showdamage();
                
            }
        }
       
        
    }  
    }
    @FXML
    private void fight(ActionEvent event) {
        if(oyuntip==true){
        if(kart_secim_count!=2){
        fight_btn.setVisible(false);
        
        img1.setDisable(true);
        img2.setDisable(true);
        img3.setDisable(true);
        }
        devam_et.setVisible(true);
        fight_btn.setDisable(true);
       Image image=BilgsayarPlayer.kartSec().getPokeImage();
            player2_img.setImage(image);
            for(int i=0;i<arrayList.size();i++){
                if(arrayList.get(i).PokeImage==image){
                    player2_dmg=arrayList.get(i).Showdamage();
                }
            }
            for(int i=0;i<ai_pokemons.size();i++){
                if(ai_pokemons.get(i).getImage()==image){
                    ai_pokemons.get(i).setImage(null);
                }
            }
            
       
        
        if (player1_dmg>player2_dmg) {
            winner.setText("1. oyuncu kazandı");
            InsanPlayer.setSKOR(InsanPlayer.getSKOR()+5);
            
        }else if(player2_dmg>player1_dmg){
            
            winner.setText("2.oyuncu kazandı");
            BilgsayarPlayer.setSKOR(BilgsayarPlayer.getSKOR()+5);
            
        }else{
            winner.setText("Berabere");
        }
        if(img1.getImage()==null){
            if(img2.getImage()==null){
                if(img3.getImage()==null){
                    img1.setVisible(false);
                    img2.setVisible(false);
                    img3.setVisible(false);
                    img4.setVisible(false);
                    img5.setVisible(false);
                    img6.setVisible(false);
                    player1_img.setVisible(false);
                    player2_img.setVisible(false);
                    fight_btn.setVisible(false);
                    winner.setVisible(false);
                    devam_et.setVisible(false);
                    
                    Alert msg_box = new Alert(AlertType.INFORMATION);
msg_box.setTitle("SKOR");

                    if(InsanPlayer.getSKOR()>BilgsayarPlayer.getSKOR()){
                                     msg_box.setHeaderText("1. OYUNCU KAZANDI");         
msg_box.setContentText("Oyuncu:"+InsanPlayer.getPlayer_name()+" Skoru:"+InsanPlayer.getSKOR());
msg_box.showAndWait().ifPresent(rs -> {
    if (rs == ButtonType.OK) {
        System.out.println("tamama tıkladın.");
    }
});
                    }else{
                        msg_box.setHeaderText("2.OYUNCU KAZANDI");
                        msg_box.setContentText("Oyuncu:"+BilgsayarPlayer.getPlayer_name()+" Skoru:"+BilgsayarPlayer.getSKOR());
msg_box.showAndWait().ifPresent(rs -> {
    if (rs == ButtonType.OK) {
        System.out.println("tamama tıkladın.");
    }
});
                        
                        
                        
                        
                        
                    }
                    Stage stage = (Stage) fight_btn.getScene().getWindow();
    
                     stage.close();
  
                }
            }
        }
      player1_label.setText("1. Oyuncu Skor: "+InsanPlayer.getSKOR());
      player2_label.setText("2.Oyuncu Skor: "+BilgsayarPlayer.getSKOR());
    }
    }



    @FXML
    private void take_reserve(MouseEvent event) {
        if(oyuntip==true){
        select_card_btn.setDisable(false);
        kart_secim_count++;
        secildimi=true;
        ImageView imageView =(ImageView) event.getSource();
        son_secilen_yedek_imageView=(ImageView)event.getSource();
        javafx.scene.image.Image image = imageView.getImage();
        son_secilen_img.setImage(image);
         for(int i=0;i<rezerve_pokemons.size();i++){
            if(rezerve_pokemons.get(i).getImage()==image){
                rezerve_pokemons.remove(i);
            }
        }
        imageView.setImage(null);
        yedek_1.setDisable(true);
        yedek_2.setDisable(true);
        yedek_3.setDisable(true);
        yedek_4.setDisable(true);
    }   
}

    @FXML
    private void next_step(ActionEvent event) {
        if(oyuntip==true){
        move_count=0;
        if(kart_secim_count!=2){
        select_card_btn.setVisible(true);    
        select_card_btn.setDisable(true);
        }
        devam_et.setVisible(false);
        player1_img.setImage(kapak_Image);
        player2_img.setImage(kapak_Image);
        yedek_1.setDisable(false);
        yedek_2.setDisable(false);
        yedek_3.setDisable(false);
        yedek_4.setDisable(false);
        }
    }

    @FXML
    private void select_card(ActionEvent event) {
        if(oyuntip==true){
             Random random = new Random();
             //randım sayı üret rezerve kart sayısı kadar 
            int random_a=random.nextInt(rezerve_pokemons.size());
            
       System.out.println("rezerve pokemons:"+rezerve_pokemons.size());
        System.out.println("random:"+random_a);
        //boş olan kart yuvasıını tespit et
        for(int i=0;i<ai_pokemons.size();i++){
            if(ai_pokemons.get(i).getImage()==null){
                //eğer rezerve pokemon kartları boş değil se bilgisayarın card listesiene atama yap
                if (rezerve_pokemons.get(random_a)!=null) {
                    for(int k=0;k<arrayList.size();k++){
                        if(arrayList.get(k).getPokeImage()==rezerve_pokemons.get(random_a).getImage()){
                 BilgsayarPlayer.CARD_LIST.add(arrayList.get(k));           
                        }
                    }
                 // bilgisayarın görünen kart destesine ekle 
                ai_pokemons.get(i).setImage(rezerve_pokemons.get(random_a).getImage());
                
              //rezerve pokemonlarda alınan kartı sil
                rezerve_pokemons.get(random_a).setImage(null);
                rezerve_pokemons.remove(random_a);    
                }
                
            }
        }
        fight_btn.setVisible(true);
        select_card_btn.setVisible(false);
        img1.setDisable(false);
        img2.setDisable(false);
        img3.setDisable(false);
        yedek_1.setDisable(true);
        yedek_2.setDisable(true);
        yedek_3.setDisable(true);
        yedek_4.setDisable(true);
        }
    }

    @FXML
    private void ai_fight(ActionEvent event) throws InterruptedException {
        ai_fight_btn.setVisible(false);
        ai_fight_btn.setDisable(true);
        ai_next_round_btn.setVisible(true);
        Image image=BilgsayarPlayer.kartSec().getPokeImage();
            player2_img.setImage(image);
            for(int i=0;i<arrayList.size();i++){
                if(arrayList.get(i).PokeImage==image){
                    player2_dmg=arrayList.get(i).Showdamage();
                }
            }
            for(int i=0;i<ai_pokemons.size();i++){
                if(ai_pokemons.get(i).getImage()==image){
                    ai_pokemons.get(i).setImage(null);
                }
            }
            Image image2=BilgiPlayer2.kartSec().getPokeImage();
            player1_img.setImage(image2);
            for(int i=0;i<arrayList.size();i++){
                if(arrayList.get(i).PokeImage==image2){
                    player1_dmg=arrayList.get(i).Showdamage();
                }
            }
            for(int i=0;i<ai_pokemons.size();i++){
                if(player_pokemons.get(i).getImage()==image2){
                    player_pokemons.get(i).setImage(null);
                }
            }
            if (player1_dmg>player2_dmg) {
            winner.setText("1. oyuncu kazandı");
            BilgiPlayer2.setSKOR(BilgiPlayer2.getSKOR()+5);
            
        }else if(player2_dmg>player1_dmg){
            
            winner.setText("2.oyuncu kazandı");
            BilgsayarPlayer.setSKOR(BilgsayarPlayer.getSKOR()+5);
            
        }else{
            winner.setText("Berabere");
        }
            if(img1.getImage()==null){
            if(img2.getImage()==null){
                if(img3.getImage()==null){
                    img1.setVisible(false);
                    img2.setVisible(false);
                    img3.setVisible(false);
                    img4.setVisible(false);
                    img5.setVisible(false);
                    img6.setVisible(false);
                    player1_img.setVisible(false);
                    player2_img.setVisible(false);
                    fight_btn.setVisible(false);
                    winner.setVisible(false);
                    devam_et.setVisible(false);
                    ai_fight_btn.setVisible(false);
                    ai_next_round_btn.setVisible(false);
                    ai_take_rezerve_btn.setVisible(false);
                    
                    Alert msg_box = new Alert(AlertType.INFORMATION);
msg_box.setTitle("SKOR");

                    if(BilgiPlayer2.getSKOR()>BilgsayarPlayer.getSKOR()){
                                     msg_box.setHeaderText("1. OYUNCU KAZANDI");         
msg_box.setContentText("Oyuncu:"+BilgiPlayer2.getPlayer_name()+" Skoru:"+BilgiPlayer2.getSKOR());
msg_box.showAndWait().ifPresent(rs -> {
    if (rs == ButtonType.OK) {
        System.out.println("tamama tıkladın.");
    }
});
                    }else{
                        msg_box.setHeaderText("2.OYUNCU KAZANDI");
                        msg_box.setContentText("Oyuncu:"+BilgsayarPlayer.getPlayer_name()+" Skoru:"+BilgsayarPlayer.getSKOR());
msg_box.showAndWait().ifPresent(rs -> {
    if (rs == ButtonType.OK) {
        System.out.println("tamama tıkladın.");
    }
});
                        
                        
                        
                        
                        
                    }
                    Stage stage = (Stage) ai_fight_btn.getScene().getWindow();
    
                     stage.close();
  
                }
            }
        }
       
        player1_label.setText("1. Oyuncu Skor: "+BilgiPlayer2.getSKOR());
      player2_label.setText("2.Oyuncu Skor: "+BilgsayarPlayer.getSKOR());
        
        
        
    }

    @FXML
    private void ai_next_round(ActionEvent event) {
        if(kart_secim_count!=2){
        ai_take_rezerve_btn.setVisible(true);
        kart_secim_count++;
        }else{
            ai_fight_btn.setVisible(true);
            ai_fight_btn.setDisable(false);
        }
        ai_next_round_btn.setVisible(false);
        player1_img.setImage(kapak_Image);
        player2_img.setImage(kapak_Image);
    }

    @FXML
    private void ai_take_rezerve(ActionEvent event) {
        Random random = new Random();
             //randım sayı üret rezerve kart sayısı kadar 
            int random_a=random.nextInt(rezerve_pokemons.size());
            
       System.out.println("rezerve pokemons:"+rezerve_pokemons.size());
        System.out.println("random:"+random_a);
        //boş olan kart yuvasıını tespit et
        for(int i=0;i<ai_pokemons.size();i++){
            if(ai_pokemons.get(i).getImage()==null){
                //eğer rezerve pokemon kartları boş değil se bilgisayarın card listesiene atama yap
                if (rezerve_pokemons.get(random_a)!=null) {
                    for(int k=0;k<arrayList.size();k++){
                        if(arrayList.get(k).getPokeImage()==rezerve_pokemons.get(random_a).getImage()){
                 BilgsayarPlayer.CARD_LIST.add(arrayList.get(k));           
                        }
                    }
                 // bilgisayarın görünen kart destesine ekle 
                ai_pokemons.get(i).setImage(rezerve_pokemons.get(random_a).getImage());
                
              //rezerve pokemonlarda alınan kartı sil
                rezerve_pokemons.get(random_a).setImage(null);
                rezerve_pokemons.remove(random_a);    
                }
                
            }
        }
        int b_random=random.nextInt(rezerve_pokemons.size());
        for(int i=0;i<ai_pokemons.size();i++){
            if(player_pokemons.get(i).getImage()==null){
                //eğer rezerve pokemon kartları boş değil se bilgisayarın card listesiene atama yap
                if (rezerve_pokemons.get(b_random)!=null) {
                    for(int k=0;k<arrayList.size();k++){
                        if(arrayList.get(k).getPokeImage()==rezerve_pokemons.get(b_random).getImage()){
                 BilgiPlayer2.CARD_LIST.add(arrayList.get(k));           
                        }
                    }
                 // bilgisayarın görünen kart destesine ekle 
                player_pokemons.get(i).setImage(rezerve_pokemons.get(b_random).getImage());
                
              //rezerve pokemonlarda alınan kartı sil
                rezerve_pokemons.get(b_random).setImage(null);
                rezerve_pokemons.remove(b_random);    
                }
                
            }
        }
       ai_fight_btn.setVisible(true);
       ai_fight_btn.setDisable(false);
        ai_take_rezerve_btn.setVisible(false);
        
    }
}
