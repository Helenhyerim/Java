package Class;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class No18_ServerSocket_Stream {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		InputStream inputS = null;
		DataInputStream dataInputS = null;
		OutputStream outputS = null;
		DataOutputStream dataOutputS = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			System.out.println("클라이언트 맞이할 준비됨");
			
			socket = serverSocket.accept();
			System.out.println("클라이언트 연결");
			System.out.println("socket : "+socket);
			
			inputS = socket.getInputStream();
			dataInputS = new DataInputStream(inputS);
			
			outputS = socket.getOutputStream();
			dataOutputS = new DataOutputStream(outputS);
			
			while(true) {
				String clientMsg = dataInputS.readUTF();
				System.out.println("clientMsg : "+ clientMsg);
				
				dataOutputS.writeUTF("메세지 전송 완료"); // 클라이언트쪽으로 out
				dataOutputS.flush();
				
				if(clientMsg.equals("STOP")) break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(dataInputS != null) dataInputS.close();
				if(inputS != null) inputS.close();
				if(dataOutputS != null) dataOutputS.close();
				if(outputS != null) outputS.close();
				
				if(socket != null) socket.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
