
public class StudentDeer
{
	public Object object;
	public static StudentDeer fromObject(Object p0) { return new StudentDeer(null,p0); }
	private StudentDeer(StudentDeer p0, Object p1) { object = p1; } // p0 avoids collisions with existing constructors

	// pass through constructors
	public StudentDeer(Object p0) throws GraderException { object = Student.construct("Deer", new Object[] {p0}); }

	// pass through methods
	public void action() throws GraderException { Student.callMethod(object, "action"); }
	public boolean scanForThreat(int p0) throws GraderException { return (boolean) Student.callMethod(object, "scanForThreat", new Object[] {p0}); }

	// field accessors and methods
	public static void _SCAN_RANGE(int value) throws GraderException { Student.setField("Deer", "SCAN_RANGE", value); }
	public static int _SCAN_RANGE() throws GraderException { return (int) Student.getField("Deer", "SCAN_RANGE"); }

	public static void _IMAGE_FILE_NAME(String value) throws GraderException { Student.setField("Deer", "IMAGE_FILE_NAME", value); }
	public static String _IMAGE_FILE_NAME() throws GraderException { return (String) Student.getField("Deer", "IMAGE_FILE_NAME"); }

	public static void _nextID(int value) throws GraderException { Student.setField("Deer", "nextID", value); }
	public static int _nextID() throws GraderException { return (int) Student.getField("Deer", "nextID"); }

	public static void _TYPE(String value) throws GraderException { Student.setField("Deer", "TYPE", value); }
	public static String _TYPE() throws GraderException { return (String) Student.getField("Deer", "TYPE"); }

	public void _id(int value) throws GraderException { Student.setField(object, "id", value); }
	public int _id() throws GraderException { return (int) Student.getField(object, "id"); }

}

