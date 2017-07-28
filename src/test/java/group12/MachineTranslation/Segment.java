package group12.MachineTranslation;


    import javax.script.*;  
      
    import org.python.core.PyFunction;  
    import org.python.core.PyInteger;  
    import org.python.core.PyObject;  
    import org.python.util.PythonInterpreter;  
      
    import java.io.*;
import java.util.Properties;

import static java.lang.System.*;

public class Segment {

	  public static void main(String[] args) throws Exception {
		  Properties props = new Properties();
		  props.put("python.console.encoding", "UTF-8"); // Used to prevent: console: Failed to install '': java.nio.charset.UnsupportedCharsetException: cp0.
		  props.put("python.security.respectJavaAccessibility", "false"); //don't respect java accessibility, so that we can access protected members on subclasses
		  props.put("python.import.site","false");
		  Properties preprops = System.getProperties();
		  PythonInterpreter.initialize(preprops, props, new String[0]);
		  PythonInterpreter interp = new PythonInterpreter();
		  interp.exec("import tensorflow");  
		  interp.exec("sys.path.append('E:/jython2.7.0/Lib')");//jython�Լ���
		  interp.exec("sys.path.append('E:/jython2.7.0/Lib/site-packages')");//jython�Լ���
		  interp.execfile("C://Users/HASEE/Documents/MT/Test.py");
	  }

}
