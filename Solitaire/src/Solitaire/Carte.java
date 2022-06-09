package Solitaire;

import com.intellij.uiDesigner.core.GridLayoutManager;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;


public class Carte{


        private final int rang;
        private String nom;
        private String color;

        private final int type;
        private String famille;

        private boolean affiche;
        private BufferedImage cardImage;

        final static int Trefle=1;
        final static int Coeur=2;
        final static int Pique=3;
        final static int Carreau=4;

        public Carte(int i, int type) {

            if (i <= 0 || i > 13) {
                throw new IllegalArgumentException("Pas possible");// les cartes vont entre 1 et 13
            }

            rang = i;
            this.nom = "" + rang; // Reprend le rang(int) entre 1 et 13 de la carte pour le donner en String (permet de gerer le cas où rang = 1 ou 11 ou 12 ou 13)


            if (i == 1) {
                this.nom = "As";
            } else if (i == 11) {
                this.nom = "Valet";
            } else if (i == 12) {
                this.nom = "Dame";
            } else if (i == 13) {
                this.nom = "Roi";
            }

            if (type < 1 || type > 4) {
                throw new IllegalArgumentException("N'existe pas !"); // il n'y a que 4 attributs static
            }

            this.type = type;

            if (this.type == Trefle) {
                famille = "Trefle";
            } else if (this.type == Coeur) {
                famille = "Coeur";
            } else if (this.type == Pique) {
                famille = "Pique";
            } else if (this.type == Carreau) {
                famille = "Carreau";
            }

            affiche = false;

        }

        public int getRang() { //Donne le rang de la Carte si necessaire
            return rang;
        }

        public String toString() { // Donne le nom de la Carte
            return this.nom;
        }

        public String getType() { // Donne le type de Carte

            return 	famille;
        }

        public String getColor(){ // Donne la couleur de la carte selon son type
            if(this.type%2==0){
                this.color="Rouge";
            }
            else{
                this.color="Noir";
            }
            return this.color;
        }

        public String getCarte() { // Donne le nom et le type de la carte

            return this +" de "+getType();
        }
        public Boolean isAffiche(){
            return affiche;
        }
        public void tourner(){
            affiche=!affiche;
        }

        public BufferedImage getCardImage(){
            return cardImage;
        }
    }



