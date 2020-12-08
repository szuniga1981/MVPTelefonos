package cl.sebastian.mvptelefonos.presenter;

import cl.sebastian.mvptelefonos.model.Repositorio;

public class Presenter {
    PresenterView view;
    Repositorio repositorio;
    //generar Constructor
    //crear metodos de repositorio y Presenter view para que se conecten al presentador


    public Presenter(PresenterView view, Repositorio repositorio) {
        this.view = view;
        this.repositorio = repositorio;
    }
}
