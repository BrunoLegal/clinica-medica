package br.edu.imepac.entidades.interfaces;

import java.util.ArrayList;


public interface InterfaceDAO<E> {
    public Integer save(E objeto);
    public ArrayList<E> readAll();
    public E read(Long id);
    public Integer update(E objeto);
    public Integer delete(Long id);
}
