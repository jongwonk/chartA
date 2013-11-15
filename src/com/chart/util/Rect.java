package com.chart.util;

public class Rect {
	private int x;
	private int y;
	private int w;
	private int h;
	
	public Rect(){
		this.x = 0;
		this.y = 0;
		this.w = 0;
		this.h = 0;
	}
	
	public Rect(int x, int y, int w , int h){
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public int getX(){
		return x;
	} 
	
	public int getY(){
		return y;
	} 
	
	public int getW(){
		return w;
	} 
	
	public int getH(){
		return h;
	} 
	
}

