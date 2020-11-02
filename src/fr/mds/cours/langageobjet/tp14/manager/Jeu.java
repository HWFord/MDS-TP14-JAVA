package fr.mds.cours.langageobjet.tp14.manager;

public class Jeu {

		private int MAP_X;
		private int MAP_Y;
		private int JOUEURS;
		  
		public Jeu(int JOUEURS, int MAP_X, int MAP_Y) {
			this.JOUEURS = JOUEURS;
			this.MAP_X = MAP_X;
			this.MAP_Y = MAP_Y;
		}

		public int getMAP_X() {
			return MAP_X;
		}

		public void setMAP_X(int map_x) {
			MAP_X = map_x;
		}

		public int getMAP_Y() {
			return MAP_Y;
		}

		public void setMAP_Y(int map_y) {
			MAP_Y = map_y;
		}

		public int getJOUEURS() {
			return JOUEURS;
		}

		public void setJOUEURS(int jOUEURS) {
			JOUEURS = jOUEURS;
		}
		  
		
		  
		  
	
}
