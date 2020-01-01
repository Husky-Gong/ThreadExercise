package Thread_3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;

public class DownResourceTask implements Runnable{
	private String url;
	
	public DownResourceTask(String url) {
		this.url = url;
	}
	
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		
		try{
			byte[] data = fromNetWorkDownResource();
			save2Disk(data);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	
	public byte[] fromNetWorkDownResource() throws Exception{
		URL urlPath = new URL(url);
		try(InputStream in =  urlPath.openStream();
				BufferedInputStream input =  new BufferedInputStream(in);
				ByteArrayOutputStream output = new ByteArrayOutputStream();){
			byte[] buf = new byte[1024];
			int length = 0;
			while((length = input.read(buf)) != -1) {
				output.write(buf, 0, length);
			}
			output.flush();
			return output.toByteArray();
		}
	}
	
	
	public void save2Disk(byte[] data) throws FileNotFoundException, IOException {
		UUID uuid = UUID.randomUUID();
		int index  = url.lastIndexOf(".");
		
		String suffix = url.substring(index);
		
		String finalPath = uuid.toString()+suffix;
		
		try(BufferedOutputStream bufOut = new BufferedOutputStream(new FileOutputStream(finalPath));
				){
			bufOut.write(data);
			bufOut.flush();
		}
	}
}
