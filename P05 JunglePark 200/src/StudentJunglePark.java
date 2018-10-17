
public class StudentJunglePark
{
	public Object object;
	public static StudentJunglePark fromObject(Object p0) { return new StudentJunglePark(null,p0); }
	private StudentJunglePark(StudentJunglePark p0, Object p1) { object = p1; } // p0 avoids collisions with existing constructors

	// pass through constructors
	public StudentJunglePark() throws GraderException { object = Student.construct("JunglePark"); }

	// pass through methods
	public static void main(Object p0) throws GraderException { Student.callMethod("JunglePark", "main", new Object[] {p0}); }
	public void clear() throws GraderException { Student.callMethod(object, "clear"); }
	public void setup() throws GraderException { Student.callMethod(object, "setup"); }
	public void draw() throws GraderException { Student.callMethod(object, "draw"); }
	public void keyPressed() throws GraderException { Student.callMethod(object, "keyPressed"); }
	public void settings() throws GraderException { Student.callMethod(object, "settings"); }
	public void mousePressed() throws GraderException { Student.callMethod(object, "mousePressed"); }
	public void mouseReleased() throws GraderException { Student.callMethod(object, "mouseReleased"); }

	// field accessors and methods
	public void _backgroundImage(Object value) throws GraderException { Student.setField(object, "backgroundImage", value); }
	public Object _backgroundImage() throws GraderException { return (Object) Student.getField(object, "backgroundImage"); }

	public void _listGUI(Object value) throws GraderException { Student.setField(object, "listGUI", value); }
	public Object _listGUI() throws GraderException { return (Object) Student.getField(object, "listGUI"); }

}

