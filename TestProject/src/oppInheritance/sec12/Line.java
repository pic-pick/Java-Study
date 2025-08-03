package oppInheritance.sec12;

public class Line extends Drawingobject {
	penColor = "red";
}

@Override
public void draw() {
	System.out.println(penColor + "색상 선 추가")
}