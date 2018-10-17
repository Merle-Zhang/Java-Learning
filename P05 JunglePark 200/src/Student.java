
import java.io.*;
import java.lang.reflect.*;
import java.nio.charset.StandardCharsets;
import java.lang.Class;
/**
 * This class provides access to students' classes, methods, and fields through 
 * reflection after hot loading Students' class files with StudentClassLoader.
 * 
 * @author dahl
 * @date 2017.06
 */
public class Student
{
    public static String runProgram(String mainClassName, String input)
                    throws GraderException
                  {
        InputStream in = System.in;
        PrintStream out = System.out;
        
                      String output = "";
                      ByteArrayOutputStream outStream = null;
                      try {
                          // redirect input to String input parameter
                          //RunAllTests.is.direct(Thread.currentThread(),new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
                          System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
                          // and redirect output to be captured and returned
                          outStream = new ByteArrayOutputStream();
                          //RunAllTests.os.direct(Thread.currentThread(),new PrintStream(outStream));
                          System.setOut( new PrintStream(outStream));
                          
                          // run student's code
                          Student.callMethodNoCatch(mainClassName,"main",new Object[]{ new String[0] });
                      } catch(Throwable t) {  
                          // now appending this exception message to the end of the students' 
                          // code so that they can still get some credit for elements that 
                          // were correctly printed out before it.
                          System.out.println( GraderException.locationInStudentCode(t) );
                      } finally {
                          // capture output from outStream, then redirect back to silence
                          if(outStream != null)
                          {
                              output = outStream.toString();
                              output = output.replaceAll("[\\r\\f]", ""); // strip any CR or FF
                              
                              System.setIn(in);
                              System.setOut(out);
                          }
                      }       
                      return output;
                  }

	// call to create an instance of any object in the student's code
	public static Object construct(String className, Object[] args) throws GraderException
	{
		try {
			Class<?> studentClass = ClassLoader.getSystemClassLoader().loadClass(className); //StudentClassLoader.getClass(className);
			Class<?>[] argTypes = getArgClasses(args);
			Constructor<?> studentConstructor = null;
			// manual search for constructor instead of using .getConstructor(Class<?>...)
			// because that method doesn't match Wrapper classes with primitive parameter types
			//Constructor<?> studentConstructor = studentClass.getConstructor(argTypes);
			for(Constructor<?> c : studentClass.getDeclaredConstructors())
			{
				Class<?>[] paramTypes = c.getParameterTypes();
				if(argTypes.length != paramTypes.length) continue;				
				boolean parametersMatch = true;
				for(int i=0; i<argTypes.length && parametersMatch; i++)
					parametersMatch = compatibleTypes(paramTypes[i],argTypes[i]);
				if(parametersMatch) { studentConstructor = c; break; }
			}
			studentConstructor.setAccessible(true);
			return studentConstructor.newInstance(args);
		//} catch(GraderException e) { throw e; // pass on internally generated exceptions
		} catch(Throwable e) {
			// prepare feedback external exceptions and errors
			String msg = "Failed to construct new "+className+"(";
			if(args != null && args.length > 0) 
			{
				for(Object arg : args)
				{
					String paramName = arg.getClass().toString();
					if(paramName.contains("."))
						paramName = paramName.substring(paramName.lastIndexOf('.')+1);
					msg += paramName + ", ";
				}
				if(msg.contains(",")) msg = msg.substring(0,msg.lastIndexOf(","));
			}
			msg += "). " + GraderException.locationInStudentCode(e);
			throw new GraderException(msg);			
		}
	}
	public static Object construct(String className) throws GraderException
	{ return construct(className,null); } // default parameter helper

	public static Object callMethod(Object object, String methodName, Object[] args) throws GraderException
	{
		try {
			Class<?> studentClass = object.getClass();
			Class<?>[] argTypes = getArgClasses(args);

			// manual search for method instead of using .getDeclaredMethod(name,argTypes)
			// because that method doesn't match Wrapper classes with primitive parameter types
			//Method studentMethod =  studentClass.getDeclaredMethod(methodName, argTypes);
			Method studentMethod = null;
			for(Method m : studentClass.getDeclaredMethods())
			{
				if(!m.getName().equals(methodName)) continue;
				Class<?>[] paramTypes = m.getParameterTypes();				
				if(argTypes.length != paramTypes.length) continue;				
				boolean parametersMatch = true;
				for(int i=0; i<argTypes.length && parametersMatch; i++)
					parametersMatch = compatibleTypes(paramTypes[i],argTypes[i]);
				if(parametersMatch) { studentMethod = m; break; }
			}
			studentMethod.setAccessible(true);
			return studentMethod.invoke(object,args);
		} catch(Throwable e) {
			String className = object.getClass().getName();
			if(className.contains("."))
				className = className.substring(className.lastIndexOf('.')+1);
			// prepare feedback external exceptions and errors
			String msg = "Problem calling method "+className+"."+methodName+"(";
			if(args != null && args.length > 0) 
			{
				for(Object arg : args)
				{
					String paramName = arg.getClass().toString();
					if(paramName.contains("."))
						paramName = paramName.substring(paramName.lastIndexOf('.')+1);
					msg += paramName + ", ";
				}
				if(msg.contains(",")) msg = msg.substring(0,msg.lastIndexOf(","));
			}
			msg += "). " + GraderException.locationInStudentCode(e);			
			throw new GraderException(msg);			
		}
	}
	public static Object callMethod(Object object, String methodName) throws GraderException
	{ return callMethod(object,methodName,null); } // default parameter helper

	public static Object callMethod(String className, String methodName, Object[] args) throws GraderException
	{
		try {
			Class<?> studentClass = ClassLoader.getSystemClassLoader().loadClass(className); //StudentClassLoader.getClass(className);
			Class<?>[] argTypes = getArgClasses(args);

			// manual search for method instead of using .getDeclaredMethod(name,argTypes)
			// because that method doesn't match Wrapper classes with primitive parameter types
			//Method studentMethod =  studentClass.getDeclaredMethod(methodName, argTypes);
			Method studentMethod = null;
			for(Method m : studentClass.getDeclaredMethods())
			{
				if(!m.getName().equals(methodName)) continue;
				Class<?>[] paramTypes = m.getParameterTypes();				
				if(argTypes.length != paramTypes.length) continue;				
				boolean parametersMatch = true;
				for(int i=0; i<argTypes.length && parametersMatch; i++)
					parametersMatch = compatibleTypes(paramTypes[i],argTypes[i]);
				if(parametersMatch) { studentMethod = m; break; }
			}
			studentMethod.setAccessible(true);
			return studentMethod.invoke(null,args);
		//} catch(GraderException e) { throw e; // pass on internally generated exceptions
		} catch(Throwable e) {
			if(className.contains("."))
				className = className.substring(className.lastIndexOf('.')+1);
			// prepare feedback external exceptions and errors
			String msg = "Failed to call method "+className+"."+methodName+"(";
			if(args != null && args.length > 0) 
			{
				for(Object arg : args)
					if(arg != null)
					{
						String paramName = arg.getClass().toString();
						if(paramName.contains("."))
							paramName = paramName.substring(paramName.lastIndexOf('.')+1);
						msg += paramName + ", ";
					}
				if(msg.contains(",")) msg = msg.substring(0,msg.lastIndexOf(","));
			}
			msg += "). " + GraderException.locationInStudentCode(e);
			throw new GraderException(msg);			
		}
	}
	public static Object callMethod(String className, String methodName) throws GraderException
	{ return callMethod(className,methodName,null); } // default parameter helper

	public static void setField(Object object, String fieldName, Object value) throws GraderException
	{
		try {
			Class<?> studentClass = object.getClass();
			Field field = studentClass.getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(object, value);			
		} catch(Throwable e) {
			String className = object.getClass().getName();
			if(className.contains("."))
				className = className.substring(className.lastIndexOf('.')+1);
			// prepare feedback external exceptions and errors
			String msg = "Failed to assign a new value to "+className+"."+fieldName+". " + GraderException.locationInStudentCode(e);
			throw new GraderException(msg);			
		}		
	}

	public static void setField(String className, String fieldName, Object value) throws GraderException
	{
		try {
			Class<?> studentClass = ClassLoader.getSystemClassLoader().loadClass(className); //StudentClassLoader.getClass(className);
			Field field = studentClass.getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(null, value);
		//} catch(GraderException e) { throw e; // pass on internally generated exceptions
		} catch(Throwable e) {
			if(className.contains("."))
				className = className.substring(className.lastIndexOf('.')+1);
			// prepare feedback external exceptions and errors
			String msg = "Failed to assign a new value to "+className+"."+fieldName+". "+GraderException.locationInStudentCode(e);
			throw new GraderException(msg);			
		}
	}

	public static Object getField(Object object, String fieldName) throws GraderException
	{
		try {
			Class<?> studentClass = object.getClass();
			Field field = studentClass.getDeclaredField(fieldName);
			field.setAccessible(true);
			return field.get(object);
		} catch(Throwable e) {
			String className = object.getClass().getName();
			if(className.contains("."))
				className = className.substring(className.lastIndexOf('.')+1);
			// prepare feedback external exceptions and errors
			String msg = "Failed to retrieve the value of "+className+"."+fieldName+". "+GraderException.locationInStudentCode(e);
			throw new GraderException(msg);			
		}		
	}

	public static Object getField(String className, String fieldName) throws GraderException
	{
		try {
			Class<?> studentClass = ClassLoader.getSystemClassLoader().loadClass(className); //StudentClassLoader.getClass(className);
			Field field = studentClass.getDeclaredField(fieldName);
			field.setAccessible(true);
			return field.get(null);
		} catch(Throwable e) {
			if(className.contains("."))
				className = className.substring(className.lastIndexOf('.')+1);
			// prepare feedback external exceptions and errors
			String msg = "Failed to retrieve the value of "+className+"."+fieldName+". "+GraderException.locationInStudentCode(e);
			throw new GraderException(msg);			
		}
	}
	
	// run method as usual, but throw exceptions from student's code so they can be appended to output
	public static Object callMethodNoCatch(String className, String methodName, Object[] args) throws Throwable
	{
		try {
			Class<?> studentClass = ClassLoader.getSystemClassLoader().loadClass(className); //StudentClassLoader.getClass(className);
			Class<?>[] argTypes = getArgClasses(args);

			// manual search for method instead of using .getDeclaredMethod(name,argTypes)
			// because that method doesn't match Wrapper classes with primitive parameter types
			//Method studentMethod =  studentClass.getDeclaredMethod(methodName, argTypes);
			Method studentMethod = null;
			for(Method m : studentClass.getDeclaredMethods())
			{
				if(!m.getName().equals(methodName)) continue;
				Class<?>[] paramTypes = m.getParameterTypes();				
				if(argTypes.length != paramTypes.length) continue;		
				boolean parametersMatch = true;
				for(int i=0; i<argTypes.length && parametersMatch; i++)
					parametersMatch = compatibleTypes(paramTypes[i],argTypes[i]);
				if(parametersMatch) { studentMethod = m; break; }
			}
			studentMethod.setAccessible(true);
			return studentMethod.invoke(null,args);
		} catch(RuntimeException e) { throw e; 
		} catch(InvocationTargetException e) { throw e.getTargetException();
		} catch(IllegalAccessException e) {
			if(className.contains("."))
				className = className.substring(className.lastIndexOf('.')+1);
			// prepare feedback external exceptions and errors
			String msg = "Failed to call method "+className+"."+methodName+"(";
			if(args != null && args.length > 0) 
			{
				for(Object arg : args)
					if(arg != null)
					{
						String paramName = arg.getClass().toString();
						if(paramName.contains("."))
							paramName = paramName.substring(paramName.lastIndexOf('.')+1);
						msg += paramName + ", ";
					}
				if(msg.contains(",")) msg = msg.substring(0,msg.lastIndexOf(","));
			}
			msg += "). " + GraderException.locationInStudentCode(e);
			throw new GraderException(msg);			
		}
	}


	// helper method to convert array of arguments into an array of argument types
	protected static Class<?>[] getArgClasses(Object[] args)
	{
		if(args == null || args.length == 0) return new Class[0];		
		Class<?>[] classes = new Class[args.length];
		for(int i=0; i<classes.length; i++)
			classes[i] = args[i].getClass();
		return classes;
	}
	
	// helper method to equate primitive and wrapper types in parameter lists
	protected static boolean compatibleTypes(Class<?> paramType, Class<?> argType)
	{
		 // argType is never primitive, so attempt to match when primitive is
		if(paramType.isPrimitive())
		{
			if(argType == Boolean.class)		argType = boolean.class;
			else if(argType == Byte.class)		argType = byte.class;
			else if(argType == Character.class)	argType = char.class;
			else if(argType == Short.class)		argType = short.class;
			else if(argType == Integer.class)	argType = int.class;
			else if(argType == Long.class)		argType = long.class;
			else if(argType == Float.class)		argType = float.class;
			else if(argType == Double.class)	argType = double.class;
		}
		return paramType.isAssignableFrom(argType);
	}

}
