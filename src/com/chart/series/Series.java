package com.chart.series;

import java.util.ArrayList;
import java.util.List;

import com.chart.util.Color;
import com.chart.util.Point;

public class Series{

	private Color color; 
	private List<Point> series = new ArrayList<Point>();
	
	public Series() {
		// TODO Auto-generated constructor stub
	}

	public void add(Point p){
		series.add(p);
	}

	
	public List<Point> getSeries() {
		return series;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	
	
}
