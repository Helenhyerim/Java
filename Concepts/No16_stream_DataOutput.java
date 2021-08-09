package Class;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class No16_stream_DataOutput {

	public static void main(String[] args) {
		String str = "Hello Java World!@";
		OutputStream outputS = null;
		DataOutputStream dataOutputS = null;
		
		try {
			outputS = new FileOutputStream("C:\\Users\\1\\HelloOutput.txt");
			dataOutputS = new DataOutputStream(outputS); // FileoutputStream을 매개변수로 활용한다
			
			dataOutputS.writeUTF(str); // 문자열이니까 UTF로 write
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputS != null) dataOutputS.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				if(outputS != null) outputS.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
