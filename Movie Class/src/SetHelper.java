//import java.util.Set;
//import java.util.HashSet;
//
//
//public class SetHelper {
//	
//	Set<Movie> s1;
//	Set<Movie> s2;
//	
//	
//	public SetHelper() {
//		
//		
//	}
//	
//	public static Set<Movie> intersection( Set<Movie> s1, Set<Movie> s2)
//	{
//		Set<Movie> temp = new HashSet<Movie>(s1);
//		temp.retainAll(s2);
//		return temp;
//	}
//	
//	
//	public static Set<Movie> difference( Set<Movie> s1, Set<Movie> s2)
//	{
//		Set<Movie> temp = new HashSet<Movie>(s1);
//		temp.removeAll(s2);
//		return temp;
//	}
//	
//	public Set<Movie> union( Set<Movie> s1, Set<Movie> s2)
//	{
//		Set<Movie> temp = new HashSet<Movie>(s1);
//		temp.addAll(s2);
//		return temp;
//	}
//	
//	public Set<Movie> symmetricDifference( Set<Movie> s1, Set<Movie> s2)
//	{
//		Set<Movie> temp = new HashSet<Movie>(s1);
//		temp.removeAll(s2);
//		//return temp;
//		
//		Set<Movie> temp2 = new HashSet<Movie>(s2);
//		temp.removeAll(s1);
//		//return temp;
//		
//		temp2.addAll(temp);
//		return temp2;
//	}
//	
//
//}
