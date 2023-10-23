package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> figury = new ArrayList<>();

    public List<Shape> getFigury() {
        return figury;
    }

    public void addFigure (Shape shape){ //dodaj figurę do listy figury
figury.add(shape);
    }
    public void removeFigure(Shape shape){ //usun figurę z listy figury
 figury.remove(shape);
    }
    public Shape getFigure(int n){ //pobierz figure z listy na podstawie int n
return figury.get(n);
    }
    public void showFigures(){
        figury.add(new Square(3.0));
        figury.add(new Circle(5.0));
        figury.add(new Triangle(5,6));
        for(Shape listaFigur : figury){
        System.out.println(listaFigur);
        } // wyswietl liste figur w postaci string





}}
