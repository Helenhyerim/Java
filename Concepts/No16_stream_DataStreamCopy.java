package Class;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class No16_stream_DataStreamCopy {

	public static void main(String[] args) {
		// 파일복사하기(문자단위로)
		InputStream inputS = null;
		DataInputStream dataInputS = null;
		OutputStream outputS = null;
		DataOutputStream dataOutputS = null;
		
		try {
			inputS = new FileInputStream("C:\\Users\\1\\Hellojava.txt");
			dataInputS = new DataInputStream(inputS); // byte단위보다 문자단위로 다루기 위해 업그레이드
			
			String str = dataInputS.readUTF(); // 문자단위로 읽고
			
			outputS = new FileOutputStream("C:\\Users\\1\\HellojavaCopy2.txt");
			dataOutputS = new DataOutputStream(outputS);
			
			dataOutputS.writeUTF(str); // 문자단위로 쓴다
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// EOFException 이유 : UTF로 쓰인 파일만 UTF로 읽어올 수 있기때문 -> writeUTF()로 파일 작성 먼저하고 읽으면 ok
			try {
				if(inputS != null) inputS.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(dataInputS != null) dataInputS.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(outputS != null) outputS.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(dataOutputS != null) dataOutputS.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
