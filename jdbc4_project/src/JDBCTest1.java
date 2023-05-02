import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//java.sql ��Ű���� Ŭ�������� import

public class JDBCTest1 {
	public static void main(String args[]) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/Haksa?serverTimezone=UTC";
		//�ڽ��� ��ǻ�Ϳ� ������ Haksa �����ͺ��̽��� �����ϱ� ���� url
		
		String id="root"; //�����ͺ��̽� root id 
		String pw="rlaxornjs1!"; //�н�����
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// JDBC ����̹��� �ε���
			
			conn = DriverManager.getConnection(url,id,pw);
			// url�� id, �н������ �����ͺ��̽��� ����
			
			System.out.println("DB연결성공");
			// �������� ������ �Ǵ� ��� ���
			
		} catch(ClassNotFoundException e) {
			System.out.println("JDBC �巯�̹� �ε� ����");
			// JDBC ����̹� �ε� ����
			
		} catch(SQLException e) {
			System.out.println("DB 1");
			// DB ���� ����
		}		
	}
}
