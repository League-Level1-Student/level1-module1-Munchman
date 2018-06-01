
public class Person {
private String name = "";
private String power="";


public void setName(String name) {
	this.name= name;
	
}


public String getName() {
	return name;
}
public void setPower(String power) {
	this.power= power;
	
}


public String getPower() {
	return power;
}

public String toString(){
	return name + power;
}
}
