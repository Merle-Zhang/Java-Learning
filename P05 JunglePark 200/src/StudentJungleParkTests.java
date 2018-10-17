public class StudentJungleParkTests
{
	public Object object;
	public static StudentJungleParkTests fromObject(Object p0) { return new StudentJungleParkTests(null,p0); }
	private StudentJungleParkTests(StudentJungleParkTests p0, Object p1) { object = p1; } // p0 avoids collisions with existing constructors

	// pass through constructors
	public StudentJungleParkTests() throws GraderException { object = Student.construct("JungleParkTests"); }

	// pass through methods
	public static void main(Object p0) throws GraderException { Student.callMethod("JungleParkTests", "main", new Object[] {p0}); }
	public void setup() throws GraderException { Student.callMethod(object, "setup"); }
	public static boolean test1DeerScanForThreatMethod() throws GraderException { return (boolean) Student.callMethod("JungleParkTests", "test1DeerScanForThreatMethod"); }
	public static boolean testTigerHopMethod() throws GraderException { return (boolean) Student.callMethod("JungleParkTests", "testTigerHopMethod"); }
	public static boolean test2DeerScanForThreatMethod() throws GraderException { return (boolean) Student.callMethod("JungleParkTests", "test2DeerScanForThreatMethod"); }
	public static boolean test2isCloseMethod() throws GraderException { return (boolean) Student.callMethod("JungleParkTests", "test2isCloseMethod"); }
	public static boolean test1isCloseMethod() throws GraderException { return (boolean) Student.callMethod("JungleParkTests", "test1isCloseMethod"); }

	// field accessors and methods
	public static void _park(Object value) throws GraderException { Student.setField("JungleParkTests", "park", value); }
	public static Object _park() throws GraderException { return (Object) Student.getField("JungleParkTests", "park"); }

}

