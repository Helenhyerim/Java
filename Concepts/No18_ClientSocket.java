package Class;

import java.io.IOException;
import java.net.Socket;

public class No18_ClientSocket {

	public static void main(String[] args) {
		// 소켓 만들기
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 9000); // 127.0.0.1
			System.out.println("서버 연결됨");
			System.out.println("socket: "+socket);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
