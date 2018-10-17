
public class StudentParkGUI
{
	public Object object;
	public static StudentParkGUI fromObject(Object p0) { return new StudentParkGUI(null,p0); }
	private StudentParkGUI(StudentParkGUI p0, Object p1) { object = p1; } // p0 avoids collisions with existing constructors

	// pass through constructors

	// pass through methods
	public void draw() throws GraderException { Student.callMethod(object, "draw"); }
	public void mousePressed() throws GraderException { Student.callMethod(object, "mousePressed"); }
	public boolean isMouseOver() throws GraderException { return (boolean) Student.callMethod(object, "isMouseOver"); }
	public void mouseReleased() throws GraderException { Student.callMethod(object, "mouseReleased"); }

	// field accessors and methods
}

