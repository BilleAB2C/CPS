package main;

import java.util.HashMap;
import java.util.Map;

import services.Cell;
import services.Content;
import services.Coordinate;
import services.Dir;
import services.EngineService;
import services.EntityService;
import services.EnvironmentService;
import services.MapService;
import services.PlayerService;
import components.Engine;
import components.Entity;
import components.Environment;
import components.MapImplem;
import components.Player;
import contracts.EngineContract;
import contracts.EntityContract;
import contracts.EnvironmentContract;
import contracts.MapContract;
import contracts.PlayerContract;

public class Main1 {

	public static void main(String[] args) throws Exception, Error {
		// TODO Auto-generated method stub
		HashMap m = new HashMap();
		m.put(new Coordinate(0,0), Cell.DNC);
		MapService map = new MapContract(new MapImplem(5,6,m));
		map.OpenDoor(0, 0);
		System.out.println(map.getCellNature(0, 0));
		
//		EngineService engine = new EngineContract(new Engine());
//
//		Map<Coordinate,Content> cmap= new HashMap<>();
//		cmap.put(new Coordinate(3,4),Content.So );
//		EnvironmentService env = new EnvironmentContract(new Environment(100, 100, new HashMap<>(),cmap ));
//		engine.init(env);
//		PlayerService e1 = new PlayerContract(new Player());
//		e1.init(env, 3, 4, Dir.N,5);
//		engine.addEntity(e1);
		//engine.Step();
		
	}

}
