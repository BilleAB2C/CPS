/*
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import components.Environment;
import components.Player;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import services.Cell;
import services.Content;
import services.Coordinate;
import services.Dir;

/**
 *
 * @author Bilal
 */
public class CPS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        Random r = new Random();
        Cell [] cell = Cell.values();
        
         Map<Coordinate, Cell> cellnature = new HashMap<Coordinate, Cell>();
         Map<Coordinate, Content> cellcontent = new HashMap<Coordinate, Content>();
        for (int i=0; i<25;i++)
            for (int j=0; j<35;j++){
                cellnature.put(new Coordinate(i, j),cell[r.nextInt(cell.length)]);
               // cellContent.put(new Coordinate(i, j),Content[r.nextInt(cell.length)]);

            }
        Environment env =new Environment(25, 35, cellnature, cellcontent);
        Player p = new Player();
        p.init(env, 0, 0, Dir.N);
        
         Partie partie = new Partie();
         partie.setPlayer(p);
         partie.setEnv(env);
        partie.setVueCourante(p.vueCourante());
        partie.setVisible(true);
     
        /*****************************************************************************/
      
//       int x=0, y=0;
//       int dir =8;
//       
//        String [][] grille = new String [15][20];
//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 20; j++) {
//                grille [i][j]=i+"-"+j;
//                
//            }
//           
//        }
//        
//        
//        String [][] vue = new String [3][5];
//        for (int i = 0; i < 15; i++) {
//            for (int j = 0; j < 20; j++) {
//                grille [i][j]=i+"-"+j;
//                
//            }
//           
//        }
//        
//       
//
//        
    }
    
}
