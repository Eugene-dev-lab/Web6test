package com.films.classes;
public class AnimeDecorator {
    private static AnimeDecorator instance;
    private String name;
    private String title;
    private String director;
    private String year;
    private String descr;

    // Приватный конструктор, чтобы предотвратить создание экземпляров класса извне
    private AnimeDecorator() {
    }

    // Метод getInstance(), который возвращает единственный экземпляр класса
    public static AnimeDecorator getInstance() {
        if (instance == null) {
            // Если экземпляр еще не создан, создаем новый экземпляр
            instance = new AnimeDecorator();
        }
        return instance;
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

    // Другие методы класса
    public void getinfo() {
        System.out.println("-----------------------------------------");
        System.out.println("Это единственный объект класса Singleton");
        System.out.println("- - - - - - - - - - - - - - - - - - - - -");
        System.out.println("name = " + this.name);
        System.out.println("title = " + this.title);
        System.out.println("director = " + this.director);
        System.out.println("year = " + this.year);
        System.out.println("descr = " + this.descr);
        System.out.println("-----------------------------------------");
    }
}
