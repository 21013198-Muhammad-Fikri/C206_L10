
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
<<<<<<< HEAD
=======
		String output = super.toString();
>>>>>>> branch 'master' of https://github.com/21013198-Muhammad-Fikri/C206_L10.git
		// Write your codes here
<<<<<<< HEAD
		String output = super.toString();
		output = String.format("%-63s %-20d", output, opticalZoom);
=======
		output = String.format("%-63s %-20d", output, opticalZoom);
		
>>>>>>> branch 'master' of https://github.com/21013198-Muhammad-Fikri/C206_L10.git
		return output;
	}
	
}

