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
			dataOutputS = new DataOutputStream(outputS); // FileoutputStream�� �Ű������� Ȱ���Ѵ�
			
			dataOutputS.writeUTF(str); // ���ڿ��̴ϱ� UTF�� write
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
