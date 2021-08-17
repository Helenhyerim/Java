package Class;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class No18_ClientSocket_Stream {

	public static void main(String[] args) {
		Socket socket = null;
		
		OutputStream outputS = null;
		DataOutputStream dataOutputS = null;
		InputStream inputS = null;
		DataInputStream dataInputS = null;
		
		Scanner sc = null;
		
		try {
			socket = new Socket("localhost", 9001);
			System.out.println("서버 연결됨");
			
			outputS = socket.getOutputStream();
			dataOutputS = new DataOutputStream(outputS);// 확장
			
			inputS = socket.getInputStream();
			dataInputS = new DataInputStream(inputS); // 확장
			
			sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("메세지를 입력하세요:");
				String outMsg = sc.nextLine();
				dataOutputS.writeUTF(outMsg); // outMsg를 서버쪽으로 out
				dataOutputS.flush(); // 완벽하게 비워주기
				
				String inMsg = dataInputS.readUTF();
				System.out.println("inMsg : " + inMsg);
				
				if(outMsg.equals("STOP")) break;
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataOutputS != null) dataOutputS.close();
				if(outputS != null) outputS.close();
				if(dataInputS != null) dataInputS.close();
				if(inputS != null) inputS.close();
				
				if(socket != null) socket.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
