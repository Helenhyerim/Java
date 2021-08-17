package Class;

import java.net.ServerSocket;
import java.net.Socket;
// 서버 소켓 만든 후 브라우저로 접속
public class No18_Socket {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket(9000);// 포트번호
			System.out.println("클라이언트 맞이할 준비됨");
			
			socket = serverSocket.accept();// 서버소켓을 accpet메소드를 통해 클라이언트소켓 반환
			System.out.println("클라이언트 연결됨");
			System.out.println("socket : "+ socket);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket != null) socket.close();
				if(serverSocket != null) serverSocket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
