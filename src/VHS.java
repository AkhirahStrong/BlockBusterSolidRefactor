import java.util.ArrayList;

public class VHS implements Play{
	
	//fields
		private String title;
		private String runTime;
		private ArrayList<String> scenes;
		private int currentTime;
		
		//constructors
		public VHS() {
		}
		public VHS(String title, String runTime, ArrayList<String> scenes) {
			setTitle(title);
			setRunTime(runTime);
			setScenes(scenes);
		}
		
		//methods
		public void play(ArrayList<String> scenes) {
			if (currentTime >= scenes.size()) {
				System.out.println("The End! Rewinding now.");
				rewind();
			} else {
				System.out.println("\nScene " + currentTime + ": " + scenes.get(currentTime));
				currentTime++;
			}	
		}
		public void rewind() {
			currentTime = 0;
		}
		public void printInfo() {
			System.out.println("\nTitle: " + title);
			System.out.println("RunTime: " + runTime);
		}
		
		//getters/setters
		public void setTitle(String title) {
			this.title = title;
		}
		public String getTitle() {
			return title;
		}
		public void setRunTime(String runTime) {
			this.runTime = runTime;
		}
		public String getRunTime() {
			return runTime;
		}
		public void setScenes(ArrayList<String> scenes) {
			this.scenes = scenes;
		}
		public ArrayList<String> getScenes() {
			return scenes;
		}
		public int getCurrentTime() {
			return currentTime;
		}
		public void setCurrentTime(int currentTime) {
			this.currentTime = currentTime;
		}
	
	

}
