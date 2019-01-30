package Nugget10;

import java.sql.Date;

public class MovieDetails {
	private String name;
	private String Language;
	private Date date;
	
	public MovieDetails(String name, String language, Date date) {
		super();
		this.name = name;
		Language = language;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
