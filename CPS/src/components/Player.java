package components;

import services.Cell;
import services.Command;
import services.Content;
import services.Dir;
import services.EnvironmentService;
import services.MobService;
import services.PlayerService;

public class Player extends Entity implements PlayerService	 {

	Command lastCommand;
	
	
	
	@Override
	public void init(EnvironmentService e, int x, int y, Dir d, int h) {
		// TODO Auto-generated method stub
		super.init(e, x, y, d, h);
	}

	@Override
	public Command getLastCommand() {
		// TODO Auto-generated method stub
		return lastCommand;
	}
        
       

	@Override
	public Content getContent(int x, int y) throws Exception {
		if (getFace() == Dir.N){
			if (getCol()+x<getEnv().getWidth()&&getRow()+y<getEnv().getHeight() )
				return getEnv().getContent(getCol()+x, getRow()+y);
			
			
		}
		if (getFace() == Dir.S){
			if (getCol()-x>=0&&getRow()-y>=0 )
				return getEnv().getContent(getCol()-x, getRow()-y);
			
		}
		if (getFace() == Dir.E){
			if (getCol()+y<getEnv().getWidth()&&0<=getRow()-x&&getRow()-x<getEnv().getHeight() )
				return getEnv().getContent(getCol()+y, getRow()-x);
			
		}
		if (getFace() == Dir.W){
			if (getCol()-y<=0&&0<=getRow()+x&&getRow()+x<getEnv().getHeight() )
				return getEnv().getContent(getCol()-y, getRow()+x);
			
			
		}
		return null;
	}

	@Override
	public Cell getNature(int x, int y) throws Exception {
		if (getFace() == Dir.N){
			if (getCol()+x<getEnv().getWidth()&&getRow()+y<getEnv().getHeight() )
				return getEnv().getCellNature(getCol()+x, getRow()+y);
			
			
		}
		if (getFace() == Dir.S){
			if (getCol()-x>=0&&getRow()-y>=0 )
				return getEnv().getCellNature(getCol()-x, getRow()-y);
			
		}
		if (getFace() == Dir.E){
			if (getCol()+y<getEnv().getWidth()&&0<=getRow()-x&&getRow()-x<getEnv().getHeight() )
				return getEnv().getCellNature(getCol()+y, getRow()-x);
			
		}
		if (getFace() == Dir.W){
			if (getCol()-y<=0&&0<=getRow()+x&&getRow()+x<getEnv().getHeight() )
				return getEnv().getCellNature(getCol()-y, getRow()+x);
			
			
		}
		return Cell.WLL;
	}

	@Override
	public Boolean viewable(int x, int y) throws Exception {
            return true;
//		if ((x<-1)||(x>1)||(y<-1)||(y>3)) return false;
//                if (((x>=-1)||(x<=1))&&((y>-1)||(y<=1))) return true;
//               
//                if (x==0)
//                    for (int j=1;j<y;j++)
//                        if (getNature(x, j)==Cell.WLL||getNature(x, j)==Cell.DWC) return false;
//                
//                return true;
//                
////		if (x<9)	
////			for (int i=0; i<x;i++){
//				if (getNature(i, y)==Cell.WLL || getNature(i, y)==Cell.DWC || getNature(i, y)==Cell.DWC)
//					return false;
//			}
//		
//	return true;
	}

        public String [][] vueCourante ()throws Exception{
            String [][] matrice = new String [3][5];
            for (int i=0;i<3; i++)
                for (int j=0;j<5 ;j++)
                    if (!viewable(i-1, j-1)) matrice [i][j]= "not viewable";
                         else matrice [i][j] = getNature(i-1, j-1)+"";
  
            matrice[1][1]= "player";
            return matrice;
        }
        
        
        
        
	/*TODO 2 more*/
  
}
