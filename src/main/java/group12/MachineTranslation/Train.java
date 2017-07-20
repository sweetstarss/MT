package group12.MachineTranslation;

import java.util.Properties;

import org.python.util.PythonInterpreter; 

public class Train {

	public static void main(String[] args) {
		
		  Properties props = new Properties();
		  props.put("python.console.encoding", "UTF-8"); // Used to prevent: console: Failed to install '': java.nio.charset.UnsupportedCharsetException: cp0.
		  props.put("python.security.respectJavaAccessibility", "false"); //don't respect java accessibility, so that we can access protected members on subclasses
		  props.put("python.import.site","false");
		  Properties preprops = System.getProperties();
		  PythonInterpreter.initialize(preprops, props, new String[0]);
		  PythonInterpreter interp = new PythonInterpreter();
		  interp.exec("import tensorflow");  
		  interp.exec("sys.path.append('E:/jython2.7.0/Lib')");//jython自己的
		  interp.exec("sys.path.append('E:/jython2.7.0/Lib/site-packages')");//jython自己的
		  interp.execfile("E:/models-master/tutorials/rnn/translate/translate.py");

	}

}
