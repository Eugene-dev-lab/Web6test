package com.films.classes;
public class SerialDecorator extends FilmDecorator {
    public SerialDecorator(FilmsAction filmsAction) {
        super(filmsAction);
    }

    @Override
    public void action() {
        super.action();
        System.out.println("Это");
    }
}
