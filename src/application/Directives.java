package application;

import java.util.ArrayList;

@SuppressWarnings("unused")
public enum Directives {
	Combat(0,1,0,0,1,2,2,2,4,1,10,3,4,25,3,4,15,2,3,2,20),
	Data(3,0,2,1,1,1,0,0,4,3,5,2,4,5,2,4,15,4,1,0,20),
	Reconaissance(1,1,1,0,2,3,0,0,4,2,10,2,4,50,2,4,50,4,2,2,20),
	Repair(2,1,2,1,0,0,1,1,4,3,5,2,4,10,5,1,5,2,4,1,20),
	Support(3,0,2,2,1,0,0,0,3,3,5,3,3,25,3,3,15,3,3,2,20);
	
	Directives(
			int c, int o, int r, int e, 
			int m, int a, int s, int st, 
			int cs, int cr, int crs,
			int os, int or, int ors,
			int as, int ar, int ars,
			int ts, int tr, int trs,
			/*ArrayList<String> skills,*/
			int buildPoints
			){};
	
}
