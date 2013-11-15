package com.chart.view;

import com.chart.renderer.RendererSet;

public class ChartFactory {

	public static Chart getDotChart(RendererSet rs){
		return new DotChart(rs);
	}
}
