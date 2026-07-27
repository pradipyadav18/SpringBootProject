package in.sp.main.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.main.beans.Student;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//		
//		String name1=rs.getString("name");
//		String email1=rs.getString("email");
//		String password1=rs.getString("password");
//		String gender=rs.getString("gender");
//		String city=rs.getString("city");
		
		
		Student st=new Student();
		st.setName(rs.getString("name"));
		st.setEmail(rs.getString("email"));
		st.setPassword(rs.getString("password"));
		st.setGender(rs.getString("gender"));
		st.setCity(rs.getString("city"));

		return st;
	}

	

}
