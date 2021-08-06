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
			inputS = new FileInputStream("C:\\Users\\1\\Hellojava.txt"); // �̰Ÿ�
			outputS = new FileOutputStream("C:\\Users\\1\\HellojavaCopy.txt"); // ���⿡ => ����
			
			byte[] arr = new byte[3]; // 3���� �о�ð�
			
			while(true) {
				int len = inputS.read(arr);
				if(len == -1) break; // ���̻� ���� �����Ͱ� ����������
				outputS.write(arr, 0, len); // ó������ 3���� write
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
