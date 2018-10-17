
public class StudentButton
{
	public Object object;
	public static StudentButton fromObject(Object p0) { return new StudentButton(null,p0); }
	private StudentButton(StudentButton p0, Object p1) { object = p1; } // p0 avoids collisions with existing constructors

	// pass through constructors
	public StudentButton(float p0, float p1, Object p2) throws GraderException { object = Student.construct("Button", new Object[] {p0, p1, p2}); }

	// pass through methods
	public void draw() throws GraderException { Student.callMethod(object, "draw"); }
	public void mousePressed() throws GraderException { Student.callMethod(object, "mousePressed"); }
	public boolean isMouseOver() throws GraderException { return (boolean) Student.callMethod(object, "isMouseOver"); }
	public void mouseReleased() throws GraderException { Student.callMethod(object, "mouseReleased"); }

	// field accessors and methods
	public static void _WIDTH(int value) throws GraderException { Student.setField("Button", "WIDTH", value); }
	public static int _WIDTH() throws GraderException { return (int) Student.getField("Button", "WIDTH"); }

	public static void _HEIGHT(int value) throws GraderException { Student.setField("Button", "HEIGHT", value); }
	public static int _HEIGHT() throws GraderException { return (int) Student.getField("Button", "HEIGHT"); }

	public void _processing(Object value) throws GraderException { Student.setField(object, "processing", value); }
	public Object _processing() throws GraderException { return (Object) Student.getField(object, "processing"); }

	public void _position(Object value) throws GraderException { Student.setField(object, "position", value); }
	public Object _position() throws GraderException { return (Object) Student.getField(object, "position"); }

	public void _label(String value) throws GraderException { Student.setField(object, "label", value); }
	public String _label() throws GraderException { return (String) Student.getField(object, "label"); }

}

