package javakt;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class classStudent {
	
	private Connection conn = null;
	
	public classStudent(Connection conn) {
		this.conn = conn;
	}
	
	public void insert(int classId, int studentId) {
		try {
			Statement statement = conn.createStatement();
			
			String sql = "INSERT INTO ClassStudent (class_id, student_id) VALUES(" + classId + ", " + studentId + ")";
			
			int rs = statement.executeUpdate(sql);
			
			System.out.println(rs);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
