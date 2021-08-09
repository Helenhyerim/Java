package Class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class No17_BufferedR {

	public static void main(String[] args) {
		
		String fileName = "C:\\Users\\1\\Hellojava.txt";
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(fileName); // 파일리더로 파일 읽기
			br = new BufferedReader(fr); // fr을 매개변수로 br 에 담아놓기(확장)
			
			String strLine;
			
			// 한줄씩 읽어오는 readLine()
			while((strLine = br.readLine()) != null) System.out.println(strLine);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!= null) br.close();
				if(fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
