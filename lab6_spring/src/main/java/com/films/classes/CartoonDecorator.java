package com.films.classes;
public class CartoonDecorator extends FilmDecorator {

    public CartoonDecorator(FilmsAction filmsAction) {
        super(filmsAction);
    }

    @Override
    public void action() {
        super.action();
        System.out.println("Это\n");
    }
}
