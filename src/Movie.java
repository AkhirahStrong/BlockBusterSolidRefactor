import java.util.ArrayList;

public class Movie {

	//fields
		Play play;
		
		//constructor
		public Movie(Play play) {
			this.play = play;
		}
		
		//methods
		public void play(ArrayList<String> scenes) {
			play.play(scenes);
		}


	
	

}
