package group12.MachineTranslation;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

import org.python.core.exceptions;

import com.csvreader.CsvWriter;

public class Csv {

	public static void main(String[] args) throws Exception {
//		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\HASEE\\Desktop\\mark.txt"));
//		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\HASEE\\Desktop\\mark1.txt"));
//		String s = null;
//		while((s = reader.readLine()) != null) {
//			System.out.println(s);
//			switch (s) {
//			case "零":
//				writer. write("0\r\n");
//				break;
//			case "一":
//				writer .write("1\r\n");
//				break;
//			case "二":
//				writer .write("2\r\n");
//				break;
//			case "三":
//				writer .write("3\r\n");
//				break;
//			case "四":
//				writer .write("4\r\n");
//				break;
//			case "五":
//				writer .write("5\r\n");
//				break;
//			}
//		}
		
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\HASEE\\Desktop\\mark.txt"));
		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\HASEE\\Desktop\\comment.txt"));
		CsvWriter writer = new CsvWriter("C:\\Users\\HASEE\\Desktop\\train.csv",',',Charset.forName("UTF8"));
		String line = null;
//		writer.write("comment,mark\r\n");
		while((line = reader1.readLine()) != null) {
			String s = reader2.readLine();
			s = s.replace("\"", "");
			s = s.replace("\'", "");
				String[] comment = {s,line};
				writer.writeRecord(comment);
		}
	}

}
