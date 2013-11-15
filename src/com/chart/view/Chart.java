package com.chart.view;

import com.chart.renderer.Renderer;
import com.chart.renderer.RendererSet;
import com.chart.series.Series;
import com.chart.util.Rect;

public abstract class Chart {

	private RendererSet rendererSet; 
	
	private Rect boundaryRect;   
	private Rect seriesRect;
	
	public Chart(RendererSet rs){
		seriesRect = new Rect();
		boundaryRect = new Rect();
		setRendererSet(rs);
	}

	public void setBoundary(Rect rect){
		boundaryRect = rect;	
	}
	
	public void setRendererSet(RendererSet rs){
		rendererSet = rs;
	}
	
	private void process(){
		
		System.out.println("--process()");
	} 
	
	public void draw(){
	
		System.out.println("-draw()");
		process();
	
		drawLegend();
		
		for(Renderer rs : rendererSet.getSet()){
			drawRenderer(rs,seriesRect);
		}
		
		drawAxis();
	}
	
	public abstract void drawRenderer(Renderer ren,Rect rect);
	
	public void drawLegend(){
		System.out.println("--drawLegend()");
	}	
	
	public void drawAxis(){
		System.out.println("--drawAxis()");
	}
	
}

