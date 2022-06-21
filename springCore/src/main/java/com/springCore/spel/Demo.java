package com.springCore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{5+5+5}")
	private int x;
	
	@Value("#{10+10+10}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(16) }")
	private double z;
	
	@Value("#{ T(java.lang.Math).E }")
	private double e;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double pI;
	
	@Value("#{ new java.lang.String('Indrajit Samanta') }")
	private String name;
	
	@Value("#{ 5>4 }")
	private boolean isActive;
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getpI() {
		return pI;
	}
	public void setpI(double pI) {
		this.pI = pI;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pI=" + pI + ", name=" + name + ", isActive="
				+ isActive + "]";
	}
	
}
