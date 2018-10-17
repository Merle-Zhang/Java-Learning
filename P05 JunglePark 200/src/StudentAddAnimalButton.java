
public class StudentAddAnimalButton
{
	public Object object;
	public static StudentAddAnimalButton fromObject(Object p0) { return new StudentAddAnimalButton(null,p0); }
	private StudentAddAnimalButton(StudentAddAnimalButton p0, Object p1) { object = p1; } // p0 avoids collisions with existing constructors

	// pass through constructors
	public StudentAddAnimalButton(String p0, float p1, float p2, Object p3) throws GraderException { object = Student.construct("AddAnimalButton", new Object[] {p0, p1, p2, p3}); }

	// pass through methods
	public void mousePressed() throws GraderException { Student.callMethod(object, "mousePressed"); }

	// field accessors and methods
	public void _type(String value) throws GraderException { Student.setField(object, "type", value); }
	public String _type() throws GraderException { return (String) Student.getField(object, "type"); }

}

