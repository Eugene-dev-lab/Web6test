package com.films.classes;
 class OtherDecorator extends FilmDecorator {

    public OtherDecorator(FilmsAction filmsAction) {
        super(filmsAction);
    }

    @Override
    public void action() {
        super.action();
        System.out.println("Это");
    }

}
