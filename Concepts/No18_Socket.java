package Class;

import java.net.ServerSocket;
import java.net.Socket;
// ���� ���� ���� �� �������� ����
public class No18_Socket {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			
			serverSocket = new ServerSocket(9000);// ��Ʈ��ȣ
			System.out.println("Ŭ���̾�Ʈ ������ �غ��");
			
			socket = serverSocket.accept();// ���������� accpet�޼ҵ带 ���� Ŭ���̾�Ʈ���� ��ȯ
			System.out.println("Ŭ���̾�Ʈ �����");
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
