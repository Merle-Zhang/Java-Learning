/**
 * This custom Exception class primarily provides a way for us to differentiate
 * between exceptions thrown by students' code and our own test code.
 * 
 * The locationInStudentCode() method is helpful in identifying the part of the
 * students' code that triggered throwing any Throwable object.
 * 
 * @author dahl
 *
 */
public class GraderException extends RuntimeException {
	private static final long serialVersionUID = 4653325761352502950L;
	public GraderException(String msg) { super(msg); } 
	
	public final static String[] studentFiles = { "Main.java" };
	
	public static String locationInStudentCode(Throwable t)
	{
		try { 
			for(StackTraceElement e : t.getStackTrace())
				if( containsStudentFile(e.getFileName()) ) //new File(e.getFileName()).exists() ) 
					return "\n" + t.toString() + " in " + e.getFileName() + " on line " + e.getLineNumber() + ".";
			// else, search through stack trace of cause when one exists
			if(t.getCause() != null) return locationInStudentCode(t.getCause());
		} catch(Throwable e) { }		
		return ""; // omit this part of message when no location within student code is found
	}	
	
	public static boolean containsStudentFile(String filename) {
	    if(filename != null)
            for(String s : studentFiles)
                if(filename.equals(s)) return true;
	    return false;
	}
}
