import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties implements FileIO {

	Properties p = new Properties();
	
	@Override
	public void readFromFile(String filename) throws IOException {
		
		FileInputStream iStream = new FileInputStream(filename);
		p.load(iStream);
		
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		
		String header = "written by FileProperties"; 
		FileOutputStream oStream = new FileOutputStream(filename);
		p.store(oStream, header);
		
	}

	@Override
	public void setValue(String key, String value) {
		
		p.setProperty(key, value);

	}

	@Override
	public String getValue(String key) {
		
		return p.getProperty(key);
		
	}

	
}
