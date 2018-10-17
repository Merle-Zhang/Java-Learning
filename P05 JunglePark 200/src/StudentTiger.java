
public class StudentTiger
{
	public Object object;
	public static StudentTiger fromObject(Object p0) { return new StudentTiger(null,p0); }
	private StudentTiger(StudentTiger p0, Object p1) { object = p1; } // p0 avoids collisions with existing constructors

	// pass through constructors
	public StudentTiger(Object p0) throws GraderException { object = Student.construct("Tiger", new Object[] {p0}); }

	// pass through methods
	public void scanForFood(int p0) throws GraderException { Student.callMethod(object, "scanForFood", new Object[] {p0}); }
	public int getDeerEatenCount() throws GraderException { return (int) Student.callMethod(object, "getDeerEatenCount"); }
	public void displayDeerEatenCount() throws GraderException { Student.callMethod(object, "displayDeerEatenCount"); }
	public void hop(Object p0) throws GraderException { Student.callMethod(object, "hop", new Object[] {p0}); }
	public void action() throws GraderException { Student.callMethod(object, "action"); }

	// field accessors and methods
	public static void _SCAN_RANGE(int value) throws GraderException { Student.setField("Tiger", "SCAN_RANGE", value); }
	public static int _SCAN_RANGE() throws GraderException { return (int) Student.getField("Tiger", "SCAN_RANGE"); }

	public static void _IMAGE_FILE_NAME(String value) throws GraderException { Student.setField("Tiger", "IMAGE_FILE_NAME", value); }
	public static String _IMAGE_FILE_NAME() throws GraderException { return (String) Student.getField("Tiger", "IMAGE_FILE_NAME"); }

	public static void _nextID(int value) throws GraderException { Student.setField("Tiger", "nextID", value); }
	public static int _nextID() throws GraderException { return (int) Student.getField("Tiger", "nextID"); }

	public static void _TYPE(String value) throws GraderException { Student.setField("Tiger", "TYPE", value); }
	public static String _TYPE() throws GraderException { return (String) Student.getField("Tiger", "TYPE"); }

	public void _id(int value) throws GraderException { Student.setField(object, "id", value); }
	public int _id() throws GraderException { return (int) Student.getField(object, "id"); }

	public void _deerEatenCount(int value) throws GraderException { Student.setField(object, "deerEatenCount", value); }
	public int _deerEatenCount() throws GraderException { return (int) Student.getField(object, "deerEatenCount"); }

}

