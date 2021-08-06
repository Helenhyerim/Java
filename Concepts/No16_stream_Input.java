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
					data = inputStream.read(); // 1byte단위로 읽어들어오기, 읽을게 없으면 -1이 담긴다
				} catch (IOException e) {
					e.printStackTrace();
				}
				if(data == -1) break; // -1이 담기면 빠져나오기
				System.out.println("data: "+ data); // 아스키코드로 출력됨
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
		
		// read(byte[]) 정한 바이트배열의 크기만큼 묶어서 불러오기때문에 속도 빠름
		// 마지막에 바이트배열의 크기보다 부족한 데이터가있으면 data 는 남은 데이터 수, 부족한 데이터는 이전의 데이터를 그대로 가져옴
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("C:\\Users\\1\\HelloWorld.txt");
			int data =0;
			byte[] bytearr = new byte[3]; // 바이트배열 생성
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
