package com.chart.renderer;

import com.chart.util.Color;

public class Axis {

	private boolean show;
	
	private Color lineColor;
	
	private int lineWidth;
	private boolean showTickMark;

	private String label;
	private int labelSize;
	private Color labelColor;
	
	
	public boolean isShowTickMark() {
		return showTickMark;
	}
	public void setShowTickMark(boolean showTickMark) {
		this.showTickMark = showTickMark;
	}
	public boolean isShow() {
		return show;
	}
	public void setShow(boolean show) {
		this.show = show;
	}
	public Color getLineColor() {
		return lineColor;
	}
	public void setLineColor(Color lineColor) {
		this.lineColor = lineColor;
	}
	public int getLineWidth() {
		return lineWidth;
	}
	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getLabelSize() {
		return labelSize;
	}
	public void setLabelSize(int labelSize) {
		this.labelSize = labelSize;
	}
	public Color getLabelColor() {
		return labelColor;
	}
	public void setLabelColor(Color labelColor) {
		this.labelColor = labelColor;
	}
	
	
}
