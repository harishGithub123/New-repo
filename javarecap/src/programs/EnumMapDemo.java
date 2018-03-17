package programs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class EnumMapDemo {
	
	public enum Numbers{one,two,three,four};

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		EnumMap<Numbers, String> map=new EnumMap<>(Numbers.class);
		map.put(Numbers.one, "1");
		map.put(Numbers.two, "2");
		map.put(Numbers.three, "3");
		map.put(Numbers.four, "4");
		
		Set<Map.Entry<Numbers, String>> set = map.entrySet();
                  //Iterator it=set.iterator();
                  ////Entry e=(Entry) it.next();
             for(Entry<Numbers, String> entry:set)
             {
            	 entry.getValue();
             }
	      // print the set
	      System.out.println("Set: " + set);
	      Properties prop=new Properties();
	      prop.put("1", "Harish");
	      prop.put("2", "Kumar");
	      FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"\\"+"config.xml");
	      FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\"+"config.xml");
	      prop.storeToXML(fos, null);
	      prop.load(fis);
	      prop.list(System.out);
	      /*StringWriter sw = new StringWriter();

	      // add some properties
	      prop.setProperty("Height", "200");
	      prop.put("Width", "1500");

	      // print the list 
	      System.out.println("" + prop);
	      
	      try {
	      
	         // store the properties list in an output writer
	         prop.store(sw, "PropertiesDemo");

	         // print the writer
	         System.out.println("" + sw.toString());
	      } catch (IOException ex) {
	         ex.printStackTrace();
	      }
*/
	}

}
