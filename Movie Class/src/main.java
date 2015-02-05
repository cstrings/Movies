import java.util.*;


public class main {
	
	

	public static void main(String[] args) {
		
		int n;
		// TODO Auto-generated method stub
		
		Movie m1 = new Movie("Frozen", 2014);
		Movie m2 = new Movie("The Hunger Games", 2014);
		Movie m3 = new Movie("The Hunger Games" , 2012);
		Movie m4 = new Movie("Gone with the Wind", 1939);
		Movie m5 = new Movie("Alien", 1980);
		Movie m6 = new Movie("Gravity", 2013);
		
		Set<Movie> library = new HashSet<Movie>();
		Set <Movie> favorites = new HashSet <Movie>();
		Set<Movie> watched = new HashSet<Movie>();
		Set<Movie> recentlyWatched = new HashSet<Movie>();
		Set<Movie> comedies = new HashSet<Movie>();
		Set<Movie> dramas = new HashSet<Movie>();
		
		
		library.add(m1);
		library.add(m2);
		library.add(m3);
		library.add(m5);
		library.add(m4);
		library.add(m6);
		
		System.out.println("What is in my library?");
		
		System.out.println(library);
		
		favorites.add(m1);
		favorites.add(m2);
		favorites.add(m3);
		
		comedies.add(m1);
		
		watched.add(m1);
		watched.add(m2);
		watched.add(m3);
		watched.add(m5);
		watched.add(m6);
		
		//System.out.print(m2.equals(m3));
		
		System.out.println("What movies have I not seen?");
		
		System.out.println(difference(library, watched));
		
		System.out.println("What of my favorite movies are comedies?");
		
		System.out.println(intersection(comedies, favorites));
		
		Map<Movie, Integer> viewcount = new HashMap<Movie,Integer>();
		
		viewcount.put(m1, 3);
		viewcount.put(m2, 5);
		
		System.out.println("What movies have a I seen? How many times have I seen them?");
		System.out.println(viewcount);
		
		Queue<Movie> playList = new LinkedList<Movie>();
		playList.add(m3);
		playList.add(m2);
		playList.add(m1);
		playList.add(m4);
		
		
		
		System.out.println("Here's the queue of movies I want to see next.");
		System.out.println(playList);
		System.out.println("The next movie I will see:");
		System.out.println(playList.peek());
		playList.remove();
		playList.remove();
		System.out.println("After removing two movies, here is the queue:");
		System.out.println(playList);
		
		

	}
	
	
	public static Set<Movie> intersection( Set<Movie> s1, Set<Movie> s2)
	{
		Set<Movie> temp = new HashSet<Movie>(s1);
		temp.retainAll(s2);
		return temp;
	}
	
	
	public static Set<Movie> difference( Set<Movie> s1, Set<Movie> s2)
	{
		Set<Movie> temp = new HashSet<Movie>(s1);
		temp.removeAll(s2);
		return temp;
	}
	
	public Set<Movie> union( Set<Movie> s1, Set<Movie> s2)
	{
		Set<Movie> temp = new HashSet<Movie>(s1);
		temp.addAll(s2);
		return temp;
	}
	
	public Set<Movie> symmetricDifference( Set<Movie> s1, Set<Movie> s2)
	{
		Set<Movie> temp = new HashSet<Movie>(s1);
		temp.removeAll(s2);
		//return temp;
		
		Set<Movie> temp2 = new HashSet<Movie>(s2);
		temp.removeAll(s1);
		//return temp;
		
		temp2.addAll(temp);
		return temp2;
	}

}
