
public class Movie {
	
	
	private String name;
	private int year;
	
	public Movie( String name, int year)
	{
		this.name = name;
		this.year = year;
		
		
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public int getYear()
	{
		return year;
	}
	
	public String toString()
	{
		return name + " (" + year +")";
	}

	public boolean equals( Movie otherMovie)
	{
		if(this.toString().equals(otherMovie.toString()))
			return true;
		else
			return false;
	}
	
	
	
}
