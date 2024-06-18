package com.Fifthspring.FifthTaskBean;

public class Bean {
private	int a;
private	int b;
public Bean(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}
public int getA() {
	return a;
}
public void setA(int a) {
	this.a = a;
}
public int getB() {
	return b;
}
public void setB(int b) {
	this.b = b;
}
@Override
public String toString() {
	return "Bean [a=" + a + ", b=" + b + ", getA()=" + getA() + ", getB()=" + getB() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
