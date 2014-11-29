package interface_learn;

import java.util.*;

interface FigureInterface {
	double calcAreaFigure (); 
}

class Square implements FigureInterface {
	private double a;
	private double b;
	Square(double a, double b) {
		this.a = a;
		this.b = b;
	}
	public double calcAreaFigure (){
		return a*b;
		
	}
}

class Triagle implements FigureInterface {
	private double a;
	private double b;
	private double c;
	Triagle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double calcAreaFigure (){
		return a*b;
		
	}
}



public class Figure {
	public static void main(String[] args){
		Square figure1 = new Square(3.0,2.0); 
		System.out.println(figure1.calcAreaFigure());
	}
}