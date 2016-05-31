/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Landscape {
    public Case[][] plateau;
    
    public Landscape(Case[][] plateau){
        this.plateau = plateau;
    }
    
    public Case possitionofLightning(){
        Case possition = null;
        parse :for(int x = 0; x < plateau.length; x++){
            for(int y = 0; y < plateau[x].length; y++){
                if(plateau[x][y].containLightning){
                    possition = plateau[x][y];
                    break parse;
                }
            }
        }
        return possition;
    }
}
