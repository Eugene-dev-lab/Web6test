package com.films.classes;
public class Films implements FilmsAction {
    private String name;
    private String title;
    private String director;
    private String year;
    private String descr;

    public Films() {
    }

    public Films(String name, String title, String director, String year, String descr) {
        this.name = name;
        this.title = title;
        this.director = director;
        this.year = year;
        this.descr = descr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }




    @Override
    public void action() {
        System.out.println(
                "title = " + title + "\n" +
                "director = " + director + "\n" +
                "year = " + year + "\n" +
                "descr = " + descr + "\n");
    }
}
