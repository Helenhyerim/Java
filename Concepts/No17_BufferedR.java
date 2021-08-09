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
			fr = new FileReader(fileName); // ���ϸ����� ���� �б�
			br = new BufferedReader(fr); // fr�� �Ű������� br �� ��Ƴ���(Ȯ��)
			
			String strLine;
			
			// ���پ� �о���� readLine()
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
