package worlds;
import worlds.locationsapi.LocationsApi;


public class Main
{
	  public static void main(String args[ ])
        { 
             LocationsApi locs = new LocationsApi();
			 System.out.println("Most Populated cities ");
			 locs.mostPopulatedCitiesCountries();
			 System.out.println("=====================================");
			 System.out.println("Most Populated cities in contient ");
			 locs.mostPopulatedCitiesContinent();
			 System.out.println("=====================================");
			 System.out.println("Most Populated Capitals ");
			 locs.mostPopulatedCapital();
             

         }
}