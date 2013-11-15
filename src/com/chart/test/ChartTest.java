package com.chart.test;

import com.chart.renderer.Renderer;
import com.chart.renderer.RendererSet;
import com.chart.series.Series;
import com.chart.util.Point;
import com.chart.view.Chart;
import com.chart.view.ChartFactory;

public class ChartTest {

	public static void main(String[] args){
		
		
		Series series = new Series();
		Point p1 = new Point(10,40);
		Point p2 = new Point(15,30);
		Point p3 = new Point(20,10);
		Point p4 = new Point(25,20);
		Point p5 = new Point(30,25);
		
		series.add(p1);
		series.add(p2);
		series.add(p3);
		series.add(p4);
		series.add(p5);
		
		Renderer ren = new Renderer(series);

		RendererSet rs = new RendererSet();
		
		rs.add(ren);
		
		Chart chart = ChartFactory.getDotChart(rs);
		
		
		chart.draw();
		
		
		System.out.println("Hello world!");
		
	}
}
