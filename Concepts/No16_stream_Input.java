package Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class No16_stream_Input {

	public static void main(String[] args) {
		// read()
		/*
		InputStream inputStream = null;
		
		try {
			inputStream = new FileInputStream("C:\\Users\\1\\HelloWorld.txt");
			int data = 0;
			
			while(true) {
				try {
					data = inputStream.read(); // 1byte������ �о������, ������ ������ -1�� ����
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break; // -1�� ���� ����������
				System.out.println("data: "+ data); // �ƽ�Ű�ڵ�� ��µ�
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		// read(byte[]) ���� ����Ʈ�迭�� ũ�⸸ŭ ��� �ҷ����⶧���� �ӵ� ����
		// �������� ����Ʈ�迭�� ũ�⺸�� ������ �����Ͱ������� data �� ���� ������ ��, ������ �����ʹ� ������ �����͸� �״�� ������
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("C:\\Users\\1\\HelloWorld.txt");
			int data =0;
			byte[] bytearr = new byte[3]; // ����Ʈ�迭 ����
			while(true) {
				try {
					data = inputStream.read(bytearr);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break;
				System.out.println("data: "+ data);
				for(int i=0; i<bytearr.length; i++) {
					System.out.println("bytearr["+i+"] : "+bytearr[i]);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(inputStream != null) inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
