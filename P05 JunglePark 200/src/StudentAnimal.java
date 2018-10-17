public class StudentAnimal
{
	public Object object;
	public static StudentAnimal fromObject(Object p0) { return new StudentAnimal(null,p0); }
	private StudentAnimal(StudentAnimal p0, Object p1) { object = p1; } // p0 avoids collisions with existing constructors

	// pass through constructors
	public StudentAnimal(Object p0, String p1) throws GraderException { object = Student.construct("Animal", new Object[] {p0, p1}); }
	public StudentAnimal(Object p0, float p1, float p2, String p3) throws GraderException { object = Student.construct("Animal", new Object[] {p0, p1, p2, p3}); }

	// pass through methods
	public void draw() throws GraderException { Student.callMethod(object, "draw"); }
	public void mousePressed() throws GraderException { Student.callMethod(object, "mousePressed"); }
	public boolean isMouseOver() throws GraderException { return (boolean) Student.callMethod(object, "isMouseOver"); }
	public void mouseReleased() throws GraderException { Student.callMethod(object, "mouseReleased"); }
	public boolean isClose(Object p0, int p1) throws GraderException { return (boolean) Student.callMethod(object, "isClose", new Object[] {p0, p1}); }
	public boolean isDragging() throws GraderException { return (boolean) Student.callMethod(object, "isDragging"); }
	public String getLabel() throws GraderException { return (String) Student.callMethod(object, "getLabel"); }
	public void setPositionX(float p0) throws GraderException { Student.callMethod(object, "setPositionX", new Object[] {p0}); }
	public void setPositionY(float p0) throws GraderException { Student.callMethod(object, "setPositionY", new Object[] {p0}); }
	public float getPositionX() throws GraderException { return (float) Student.callMethod(object, "getPositionX"); }
	public void displayLabel() throws GraderException { Student.callMethod(object, "displayLabel"); }
	public void action() throws GraderException { Student.callMethod(object, "action"); }
	public float getPositionY() throws GraderException { return (float) Student.callMethod(object, "getPositionY"); }
	public double distance(Object p0) throws GraderException { return (double) Student.callMethod(object, "distance", new Object[] {p0}); }
	public Object getImage() throws GraderException { return (Object) Student.callMethod(object, "getImage"); }

	// field accessors and methods
	public static void _randGen(Object value) throws GraderException { Student.setField("Animal", "randGen", value); }
	public static Object _randGen() throws GraderException { return (Object) Student.getField("Animal", "randGen"); }

	public void _label(String value) throws GraderException { Student.setField(object, "label", value); }
	public String _label() throws GraderException { return (String) Student.getField(object, "label"); }

	public void _processing(Object value) throws GraderException { Student.setField(object, "processing", value); }
	public Object _processing() throws GraderException { return (Object) Student.getField(object, "processing"); }

	public void _image(Object value) throws GraderException { Student.setField(object, "image", value); }
	public Object _image() throws GraderException { return (Object) Student.getField(object, "image"); }

	public void _position(Object value) throws GraderException { Student.setField(object, "position", value); }
	public Object _position() throws GraderException { return (Object) Student.getField(object, "position"); }

	public void _isDragging(boolean value) throws GraderException { Student.setField(object, "isDragging", value); }
	public boolean _isDragging() throws GraderException { return (boolean) Student.getField(object, "isDragging"); }

}

