package com.psl.java.assignment.collections;

import java.sql.Date;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movies implements Comparable<Movies>{
	String name;
	String language;
	Date releaseDate;
	String director;
	String producer;
	Duration duration;
	public Movies(String name, String language, Date releaseDate, String director, String producer, Duration duration) {
		super();
		this.name = name;
		this.language = language;
		this.releaseDate = releaseDate;
		this.director = director;
		this.producer = producer;
		this.duration = duration;
	}
	public Movies() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public Duration getDuration() {
		return duration;
	}
	public void setDuration(Duration duration) {
		this.duration = duration;
	}
	@Override
	public int compareTo(Movies o) {
		int lang = this.language.compareTo(o.language);
		return lang==0?this.name.compareTo(o.name):lang;
	}


	@Override
	public String toString() {
		return "Movies [name=" + name + ", language=" + language + ", releaseDate=" + releaseDate + ", director="
				+ director + ", producer=" + producer + ", duration=" + duration + "]";
	}
	public static void main(String[] args) {
		Movies m = new Movies();
		ArrayList<Movies> moviesList= (ArrayList<Movies>) m.createMovieList();
		m.sortByLanguage(moviesList);


		Collections.sort(moviesList,new Comparator<Movies>() {

			@Override
			public int compare(Movies o1, Movies o2) {
				return o1.getDirector().compareTo(o2.getDirector());
			}
		});

		System.out.println("sort the movies according to the director");
		for(Movies o:moviesList) {
			System.out.println(o);
		}

		m.sortByDuration(moviesList);
		m.sortByLanguageAndReleaseDate(moviesList);
	}

	public List<Movies> createMovieList(){
		ArrayList<Movies> m = new ArrayList<>();
		Movies obj = new Movies("darbar", "tamil", Date.valueOf("2020-12-12"), "AR Murugadoss", "Allirajah Subaskaran", Duration.parse("PT2H30M"));
		m.add(obj);
		obj = new Movies("anbe sivam", "tamil", Date.valueOf("2003-1-14"), "Sundar C", "Muralitharan", Duration.parse("PT2H40M"));
		m.add(obj);
		obj = new Movies("inside out", "english", Date.valueOf("2015-6-17"), "pete doctor", "John lasitter", Duration.parse("PT1H14M"));
		m.add(obj);
		return m;
	}

	public void sortByLanguage(List<Movies> moviesList) {

		Collections.sort(moviesList);
		System.out.println("sort the movies according to their language");
		for(Movies o:moviesList) {
			System.out.println(o);
		}	
	}

	public void sortByDuration(List<Movies> movieList) {
		Collections.sort(movieList, new Comparator<Movies>() {

			@Override
			public int compare(Movies o1, Movies o2) {
				return o1.getDuration().compareTo(o2.getDuration());
			}

		});
		System.out.println("Sort By Duration");
		for(Movies o:movieList) {
			System.out.println(o);
		}	
	}
	
	public void sortByLanguageAndReleaseDate(List<Movies> movieList) {
		Collections.sort(movieList, new Comparator<Movies>() {

			@Override
			public int compare(Movies o1, Movies o2) {
				if(o1.getLanguage()!=o2.getLanguage())
					return o1.getLanguage().compareTo(o2.getLanguage());
				return o1.getReleaseDate().compareTo(o2.getReleaseDate());
			}

		});
		System.out.println("Sort By Language And ReleaseDate");
		for(Movies o:movieList) {
			System.out.println(o);
		}	
	}
}
