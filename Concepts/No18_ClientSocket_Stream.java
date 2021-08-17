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
			System.out.println("���� �����");
			
			outputS = socket.getOutputStream();
			dataOutputS = new DataOutputStream(outputS);// Ȯ��
			
			inputS = socket.getInputStream();
			dataInputS = new DataInputStream(inputS); // Ȯ��
			
			sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("�޼����� �Է��ϼ���:");
				String outMsg = sc.nextLine();
				dataOutputS.writeUTF(outMsg); // outMsg�� ���������� out
				dataOutputS.flush(); // �Ϻ��ϰ� ����ֱ�
				
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
