package com.chart.util;

import java.io.Serializable;
import com.chart.renderer.*;

public class Point/*<T extends Number>*/ implements Serializable{
	private int x;
	private int y;
	
	private Point(){
	}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
		
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}	

	
	@Override
	public String toString() {
		return "(" + Integer.toString(x) + "," + Integer.toString(y) + ")";
	}
	
}
