package Class;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.omg.CORBA.portable.OutputStream;

public class No16_stream_Output {

	public static void main(String[] args) {
		/*
		//write()
		FileOutputStream outputStream = null;
		try {
			// 기존에 있으면 덮어씌우고, 없으면 새로생성함
			outputStream = new FileOutputStream("C:\\Users\\1\\Hellojava.txt"); 
			String data = "Hello java world!!";
			byte[] arr = data.getBytes(); // data에서 byte를 get해서 -> arr 배열
			
			try {
				outputStream.write(arr); // arr 배열의 byte를 output
			} catch (IOException e) {
				e.printStackTrace();
			} 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		//write(배열, 시작, 길이)
				FileOutputStream outputStream = null;
				try {
					// 기존에 있으면 덮어씌우고, 없으면 새로생성함
					outputStream = new FileOutputStream("C:\\Users\\1\\HelloWorld.txt"); 
					String data = "Hello awesome world!!";
					byte[] arr = data.getBytes(); // data에서 byte를 get해서 -> arr 배열
					
					try {
						outputStream.write(arr, 2, 10); // index2부터 10개
					} catch (IOException e) {
						e.printStackTrace();
					} 
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} finally {
					
					try {
						if(outputStream != null) outputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}

	}

}
