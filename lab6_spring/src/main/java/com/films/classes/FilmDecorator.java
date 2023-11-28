package com.films.classes;
public abstract class FilmDecorator implements FilmsAction {
    protected FilmsAction filmsAction;

    public FilmDecorator(FilmsAction filmsAction)
    {
        this.filmsAction = filmsAction;
    }

    @Override
    public void action() {
        filmsAction.action();
    }
}
