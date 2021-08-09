package Class;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class No17_BufferedW {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\1\\Hellojava_bf.txt";
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			String str = "Hello java world!!@\n";
			str += "Hello C world too##\n";
			str += "Hello Python world hehe\n";
			
			fw = new FileWriter(fileName); // fileName으로 FileWriter 생성
			bw = new BufferedWriter(fw); // fw 로 FileWriter 확장 -> BufferedWriter
			bw.write(str);
			
			System.out.println("확인차 end");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// bw, fw 순서바뀌면 IOException
				if(bw != null) bw.close();
				if(fw != null) fw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
