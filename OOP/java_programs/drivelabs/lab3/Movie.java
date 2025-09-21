public class Movie{
	private String title;
	private String genre;
	private double rating;
	private boolean isSuitableForChildren;
	
	Movie(){};
	Movie(String title , String genre , double rating , boolean isSuitableForChildren)
	{
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.isSuitableForChildren = isSuitableForChildren;
	}
	public boolean checkSuitability(){
		if(rating <= 8.0) {
			return true;
		} else {
			return false;
		}
	}
	public void displayInfo(){
		String suited = isSuitableForChildren == true ? "Yes" : "No";
		System.out.println("Movie: \"" + title + "\", Genre: " + genre + ", Rating: " + rating + ", Suitable for children: " + suited);
		
	}
	public static void main(String args[]){
		Movie theGodfather = new Movie("The Godfather" , "Crime thriller" , 9.0 , false);
		Movie theWildRobot = new Movie("The Wild Robot" , "Animation" , 8.5 , true);
		theGodfather.displayInfo();
		theWildRobot.displayInfo();
	}
		
	};

