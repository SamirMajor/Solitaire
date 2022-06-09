package Solitaire;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class Deck {
    private final ArrayList<Carte> DeckDeCarte = new ArrayList<Carte>();
    public ArrayList<Carte> List1 = new ArrayList<Carte>();
    public ArrayList<Carte> List2 = new ArrayList<Carte>();
    public ArrayList<Carte> List3 = new ArrayList<Carte>();
    public ArrayList<Carte> List4 = new ArrayList<Carte>();
    public ArrayList<Carte> List5 = new ArrayList<Carte>();
    public ArrayList<Carte> List6 = new ArrayList<Carte>();
    public ArrayList<Carte> List7 = new ArrayList<Carte>();

    public Boolean CarteDos;

    public Deck() throws IOException {

        DeckDeCarte.add(new Carte(1,1, ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\As_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(2,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\2_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(3,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\3_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(4,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\4_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(5,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\5_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(6,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\6_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(7,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\7_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(8,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\8_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(9,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\9_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(10,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\10_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(11,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Valet_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(12,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Dame_de_trefle.PNG"))));
        DeckDeCarte.add(new Carte(13,1,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Roi_de_trefle.PNG"))));

        DeckDeCarte.add(new Carte(1,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\As_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(2,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\2_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(3,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\3_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(4,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\4_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(5,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\5_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(6,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\6_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(7,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\7_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(8,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\8_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(9,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\9_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(10,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\10_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(11,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Valet_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(12,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Dame_de_coeur.PNG"))));
        DeckDeCarte.add(new Carte(13,2,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Roi_de_coeur.PNG"))));

        DeckDeCarte.add(new Carte(1,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\As_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(2,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\2_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(3,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\3_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(4,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\4_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(5,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\5_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(6,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\6_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(7,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\7_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(8,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\8_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(9,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\9_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(10,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\10_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(11,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Valet_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(12,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Dame_de_pique.PNG"))));
        DeckDeCarte.add(new Carte(13,3,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Roi_de_pique.PNG"))));

        DeckDeCarte.add(new Carte(1,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\As_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(2,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\2_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(3,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\3_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(4,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\4_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(5,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\5_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(6,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\6_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(7,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\7_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(8,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\8_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(9,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\9_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(10,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\10_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(11,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Valet_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(12,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Dame_de_carreau.PNG"))));
        DeckDeCarte.add(new Carte(13,4,ImageIO.read(new File("C:\\Users\\Manel\\Pictures\\Camera Roll\\Roi_de_carreau.PNG"))));

       Collections.shuffle(DeckDeCarte);


    }

    public void List1(){
        DeckDeCarte.get(0);
        DeckDeCarte.get(0).tourner();
        List1.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);


    }
    public void List2(){
        DeckDeCarte.get(0);
        List2.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);


        do{
         Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List2.get(0).getColor());
        DeckDeCarte.get(0);
        DeckDeCarte.get(0).tourner();
        List2.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);


    }
    public void List3(){
        DeckDeCarte.get(0);
        List3.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List3.get(0).getColor());
        DeckDeCarte.get(0);
        List3.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List3.get(1).getColor());
        DeckDeCarte.get(0);
        DeckDeCarte.get(0).tourner();
        List3.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);


    }

    public void List4(){
        DeckDeCarte.get(0);
        List4.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);


        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List4.get(0).getColor());
        DeckDeCarte.get(0);
        List4.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);


        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List4.get(1).getColor());
        DeckDeCarte.get(0);
        List4.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);


        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List4.get(2).getColor());
        DeckDeCarte.get(0);
        DeckDeCarte.get(0).tourner();
        List4.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);


    }
    public void List5(){
        DeckDeCarte.get(0);
        List5.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List5.get(0).getColor());
        DeckDeCarte.get(0);
        List5.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List5.get(1).getColor());
        DeckDeCarte.get(0);
        List5.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List5.get(2).getColor());
        DeckDeCarte.get(0);
        List5.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List5.get(3).getColor());
        DeckDeCarte.get(0);
        DeckDeCarte.get(0).tourner();
        List5.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

    }

    public void List6(){
        DeckDeCarte.get(0);
        List6.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List6.get(0).getColor());
        DeckDeCarte.get(0);
        List6.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List6.get(1).getColor());
        DeckDeCarte.get(0);
        List6.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List6.get(2).getColor());
        DeckDeCarte.get(0);
        List6.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List6.get(3).getColor());
        DeckDeCarte.get(0);
        List6.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List6.get(4).getColor());
        DeckDeCarte.get(0);
        DeckDeCarte.get(0).tourner();
        List6.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

    }

    public void List7(){
        DeckDeCarte.get(0);
        List7.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List7.get(0).getColor());
        DeckDeCarte.get(0);
        List7.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List7.get(1).getColor());
        DeckDeCarte.get(0);
        List7.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List7.get(2).getColor());
        DeckDeCarte.get(0);
        List7.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List7.get(3).getColor());
        DeckDeCarte.get(0);
        List7.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List7.get(4).getColor());
        DeckDeCarte.get(0);
        List7.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

        do{
            Collections.shuffle(DeckDeCarte);
        } while (DeckDeCarte.get(0).getColor()==List7.get(5).getColor());
        DeckDeCarte.get(0);
        DeckDeCarte.get(0).tourner();
        List7.add(DeckDeCarte.get(0));
        this.DeckDeCarte.remove(0);

    }




    public ArrayList<Carte>getDeckDeCarte(){
        return DeckDeCarte;
    }

    public ArrayList<Carte> getList1() {
        return List1;
    }
    public ArrayList<Carte> getList2() {
        return List2;
    }
    public ArrayList<Carte> getList3() {
        return List3;
    }
    public ArrayList<Carte> getList4() {
        return List4;
    }
    public ArrayList<Carte> getList5() {
        return List5;
    }
    public ArrayList<Carte> getList6() {
        return List6;
    }
    public ArrayList<Carte> getList7() {
        return List7;
    }



}