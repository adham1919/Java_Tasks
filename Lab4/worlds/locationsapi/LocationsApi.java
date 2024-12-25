package worlds.locationsapi;
import worlds.locations.City;
import worlds.locations.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Optional;
import java.util.stream.Collectors;

public class LocationsApi
{
	   	InMemoryWorldDao worldDao;
		Set<String> allContinents;
		Map<String, Country> allCountries;
		Map<Integer, City> allCities;
	   public LocationsApi()
	   {
		 worldDao =	InMemoryWorldDao.getInstance();
		 allContinents=worldDao.getContinents();
		 allCountries=worldDao.getCountries();
		 allCities=worldDao.getCities();
	   }
	  public void mostPopulatedCitiesCountries()
        { 
		List<Country> countryList= allCountries.entrySet().stream().map(m -> m.getValue()).collect(Collectors.toList());
		List<City> countryMaxCity = countryList.stream().map(country -> country.getCities().stream()
		.reduce( new City(0,"","", 0), (x,y) -> x.getPopulation()>y.getPopulation()?x:y)
		).collect(Collectors.toList());	
		for(City c : countryMaxCity)
		System.out.println("City : "+c.getName()+" Population :  "+c.getPopulation() );
         }
		 
		 public void mostPopulatedCitiesContinent()
        { 
		        List<Country> countryList= allCountries.entrySet().stream().map(m -> m.getValue()).collect(Collectors.toList());
          		 List<City> countryMaxCont = allContinents.stream()
                .map(continent -> countryList.stream()
                .filter(country -> continent.equals(country.getContinent()))
                .flatMap(country -> country.getCities().stream())
                .reduce((city1, city2) -> city1.getPopulation() > city2.getPopulation() ? city1 : city2)
                .orElse(null) // Handle case where there are no cities
            )
            .collect(Collectors.toList());
	
	for(City c : countryMaxCont)
	{
		if(c!=null)
		System.out.println("City : "+c.getName()+" Population :  "+c.getPopulation() );
	}
   
         }
		 
		 
		 
		   public void mostPopulatedCapital()
        { 
         List<Country> countryList= allCountries.entrySet().stream().map(m -> m.getValue()).collect(Collectors.toList());
		List<City> countryMaxCity = countryList.stream().map(country -> country.getCities().stream()
		.reduce( new City(0,"","", 0), (x,y) -> x.getPopulation()>y.getPopulation()?x:y)
		).collect(Collectors.toList());	
		for(City c : countryMaxCity)
		System.out.println("City : "+c.getName()+" Population :  "+c.getPopulation() );

         }
}




/*

	public Map<String, Country> getCountries() {
		return countries;
	}
	public Map<Integer, City> getCities() {
		return cities;
	}

*/