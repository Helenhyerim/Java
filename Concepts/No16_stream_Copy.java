package Class;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class No16_stream_Copy {

	public static void main(String[] args) {
		InputStream inputS = null;
		OutputStream outputS = null;
		
		try {
			inputS = new FileInputStream("C:\\Users\\1\\Hellojava.txt"); // 이거를
			outputS = new FileOutputStream("C:\\Users\\1\\HellojavaCopy.txt"); // 여기에 => 복사
			
			byte[] arr = new byte[3]; // 3개씩 읽어올것
			
			while(true) {
				int len = inputS.read(arr);
				if(len == -1) break; // 더이상 읽을 데이터가 없을때까지
				outputS.write(arr, 0, len); // 처음부터 3개씩 write
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(inputS != null) {
				try {
					inputS.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(outputS != null) {
				try {
					outputS.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
