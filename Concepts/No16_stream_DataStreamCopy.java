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
		// ���Ϻ����ϱ�(���ڴ�����)
		InputStream inputS = null;
		DataInputStream dataInputS = null;
		OutputStream outputS = null;
		DataOutputStream dataOutputS = null;
		
		try {
			inputS = new FileInputStream("C:\\Users\\1\\Hellojava.txt");
			dataInputS = new DataInputStream(inputS); // byte�������� ���ڴ����� �ٷ�� ���� ���׷��̵�
			
			String str = dataInputS.readUTF(); // ���ڴ����� �а�
			
			outputS = new FileOutputStream("C:\\Users\\1\\HellojavaCopy2.txt");
			dataOutputS = new DataOutputStream(outputS);
			
			dataOutputS.writeUTF(str); // ���ڴ����� ����
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// EOFException ���� : UTF�� ���� ���ϸ� UTF�� �о�� �� �ֱ⶧�� -> writeUTF()�� ���� �ۼ� �����ϰ� ������ ok
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
