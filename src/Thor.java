/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public class Thor {
    
    public int x;
    public int y;
    public Landscape landscape;
    
    public Thor(int x, int y, Landscape landscape){
        this.x = x;
        this.y = y;
        this.landscape = landscape;
    }
    
    public void updatePossition(String direction){
        if(direction.contains("N")){
            this.y--;
        }if(direction.contains("S")){
            this.y++;
        }if(direction.contains("W")){
            this.x++;
        }if(direction.contains("E")){
            this.x--;
        }
    }
    
    public String directionOfCase(Case possition){
        StringBuffer result = null;
        if(isNorth(possition)){
            result = new StringBuffer("N");
            if(isEast(possition)){
                result.append("E");
            }else if(isWest(possition)){
                result.append("W");
            }
            return result.toString();
        }else if(isSouth(possition)){
            result = new StringBuffer("S");
            if(isEast(possition)){
                result.append("E");
            }else if(isWest(possition)){
                result.append("W");
            }
            return result.toString();
        }else if(isWest(possition)){
            return "W";
        }else if(isEast(possition)){
            return "E";
        }else{
            return null;
        }

     }
    
    public boolean isNorth(Case possition){
        return possition.y > this.y;
    }

    public boolean isSouth(Case possition){
        return possition.y < this.y;    
    }
    
    public boolean isWest(Case possition){
        return possition.x > this.x;    
    }
    
    public boolean isEast(Case possition){
        return possition.x < this.x;
    }
}
