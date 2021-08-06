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
			// ������ ������ ������, ������ ���λ�����
			outputStream = new FileOutputStream("C:\\Users\\1\\Hellojava.txt"); 
			String data = "Hello java world!!";
			byte[] arr = data.getBytes(); // data���� byte�� get�ؼ� -> arr �迭
			
			try {
				outputStream.write(arr); // arr �迭�� byte�� output
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
		
		//write(�迭, ����, ����)
				FileOutputStream outputStream = null;
				try {
					// ������ ������ ������, ������ ���λ�����
					outputStream = new FileOutputStream("C:\\Users\\1\\HelloWorld.txt"); 
					String data = "Hello awesome world!!";
					byte[] arr = data.getBytes(); // data���� byte�� get�ؼ� -> arr �迭
					
					try {
						outputStream.write(arr, 2, 10); // index2���� 10��
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
