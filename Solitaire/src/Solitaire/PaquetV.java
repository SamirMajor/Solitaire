package Solitaire;

import java.util.ArrayList;

public class PaquetV {

    private static String paquetType;
    private static final ArrayList<Carte> PaquetDeCarte= new ArrayList<Carte>();

    private static int rang=1;

    public PaquetV() {

    }

    public PaquetV(Carte c){

        if(c.getRang()!=rang){
            throw new IllegalArgumentException("Pas possible");
        }

        if(c.getRang()==rang){
            paquetType=c.getType();
            PaquetDeCarte.add(c);
            rang++;
        }




    }

    public int getPaquetRang(){
        return rang;
    }

    public String getPaquetType(){
        return paquetType;
    }

    public ArrayList<Carte>getPaquetDeCarte(){
        return PaquetDeCarte;
    }

    public static void add(Carte e) {
        if (PaquetDeCarte.size()==0 && e.getRang()==1){
            PaquetDeCarte.add(e);
            rang++;
            paquetType=e.getType();
        }
        if(e.getRang()==rang && e.getType()==paquetType){
            PaquetDeCarte.add(e);
            rang++;
        }

    }
    public static void remove(Carte e){
        if(e.getRang()==rang-1 && e.getType()==paquetType){
            PaquetDeCarte.remove(e);
            rang--;

        }
    }

}