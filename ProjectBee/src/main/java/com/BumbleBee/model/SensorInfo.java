package com.BumbleBee.model;

public class SensorInfo {
    private double temperature;
    private double humidity;
    private double weight;
    private int water;
    
	public SensorInfo(double temperature, double humidity, double weight, int water) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.weight = weight;
		this.water = water;
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
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public double getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
    
}
