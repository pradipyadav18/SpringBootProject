package in.sp.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sp.main.beans.Student;
import in.sp.main.mappers.StudentMapper;

@Repository
public class LoginDaoimpl  implements LoginDao{
	
	
	@Autowired
	JdbcTemplate jdbctemplate;

	
	
	
	@Override
	public List<Student> loginDao(String email, String password) {
		
		List<Student>student_list=null;
		try {
			
			String mysql_query="Select * from register where email=? AND password=?";

			student_list=jdbctemplate.query(mysql_query, new StudentMapper() , new Object[] {email,password});
				
			
			
				
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Exception aagaya hai bhai");
		}
		
		return student_list;
		
	
	}



	int ans=0;

	

}
