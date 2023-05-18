package basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Film {

	private String filmName;
	private int releaseDate;
	private String hero;

	public Film(String filmName, int releaseDate, String hero) {
		super();
		this.filmName = filmName;
		this.releaseDate = releaseDate;
		this.hero = hero;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public int getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public static void main(String[] args) {

		List<Film> filmLists = new ArrayList<>();

		filmLists.add(new Film("Jhon wick", 2022, "tom cruise"));
		filmLists.add(new Film("Hulk", 2010, "Ellie goudling"));
		filmLists.add(new Film("SpiderMan", 2018, "vin Diesel"));
		filmLists.add(new Film("Escape plan", 2015, "Arnold swaschnigger"));
		filmLists.add(new Film("anabelle", 2016, "annie james"));
		filmLists.add(new Film("tenent", 2002, "bhabruvahana"));

		filmLists.stream().sorted((o1, o2) -> o1.getReleaseDate() - o2.getReleaseDate())
				.forEach((x) -> System.out.println(x.getReleaseDate()));
		
		List<Film> ff=filmLists.stream().sorted(Comparator.comparing(Film::getHero))
		.collect(Collectors.toList());
		ff.forEach(x->System.out.println(x.getHero()));
		
		
		

	}

}
