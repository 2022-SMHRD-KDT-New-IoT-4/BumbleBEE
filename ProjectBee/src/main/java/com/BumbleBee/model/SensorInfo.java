package com.BumbleBee.model;

public class SensorInfo {
    private double temperature;
    private double humidity;
    private double weight;
    
    
	public SensorInfo(double temperature, double humidity, double weight) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.weight = weight;
	}
	
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
    
}
