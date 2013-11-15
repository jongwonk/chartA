package com.chart.renderer;

import java.util.ArrayList;
import java.util.List;

import com.chart.util.Color;

public class RendererSet {

	private Axis xAxis;
	private Axis yAxis;
	
	private Legend legend;
	
	private Title title;
	private Color background;
	
	private List<Renderer>renderers = new ArrayList<Renderer>();
	
	public void add(Renderer ren){
		renderers.add(ren);
	}
	
	public List<Renderer> getSet(){
		return renderers;
	}

	public Axis getxAxis() {
		return xAxis;
	}

	public void setxAxis(Axis xAxis) {
		this.xAxis = xAxis;
	}

	public Axis getyAxis() {
		return yAxis;
	}

	public void setyAxis(Axis yAxis) {
		this.yAxis = yAxis;
	}

	public Legend getLegend() {
		return legend;
	}

	public void setLegend(Legend legend) {
		this.legend = legend;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Color getBackground() {
		return background;
	}

	public void setBackground(Color background) {
		this.background = background;
	}
	
	
}
