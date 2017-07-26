package group12.MachineTranslation;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.RandomAccessFile;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class DBtoTXT {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
        MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
        DB db = mongoClient.getDB("mydb");
        DBCollection dbColl = db.getCollection("Comment");
        DBCursor cursor = dbColl.find();        
        
        int i = 0;
        while(cursor.hasNext()){
        	if(i<40000){
    		try {
    			writeTxtFile(cursor.next().toMap().get("summary").toString()+"\r\n", new File("C:/Users/Lenovo/Desktop/s2s/data/giga-fren.release2.fixed.en"));
    			writeTxtFile(cursor.next().toMap().get("score").toString().charAt(0)+"\r\n", new File("C:/Users/Lenovo/Desktop/s2s/data/giga-fren.release2.fixed.fr"));
    			System.out.println(i);
    			i++;
    		} catch (Exception e) {
    			// TODO 自动生成的 catch 块
    			e.printStackTrace();
    		}
        	}else{
    			try {
					writeTxtFile(cursor.next().toMap().get("summary").toString()+"\r\n", new File("C:/Users/Lenovo/Desktop/s2s/data/newstest2013.en"));
					writeTxtFile(cursor.next().toMap().get("score").toString().charAt(0)+"\r\n", new File("C:/Users/Lenovo/Desktop/s2s/data/newstest2013.fr"));
					System.out.println(i+"!");
					i++;
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
    			
        	}
        }

	}
	
	 public static boolean writeTxtFile(String content,File  fileName)throws Exception{  
		  RandomAccessFile mm=null;  
		  boolean flag=false;  
		  FileOutputStream o=null;  
		  try {  
		   o = new FileOutputStream(fileName, true);  
		      o.write(content.getBytes("UTF8"));  
		      o.close();  
		//   mm=new RandomAccessFile(fileName,"rw");  
		//   mm.writeBytes(content);  
		   flag=true;  
		  } catch (Exception e) {  
		   // TODO: handle exception  
		   e.printStackTrace();  
		  }finally{  
		   if(mm!=null){  
		    mm.close();  
		   }  
		  }  
		  return flag;  
		 } 
}


