package in.sp.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import in.sp.main.beans.Student;

@Service
public class RegisterDaoimpl implements RegisterDao {

	@Autowired
	JdbcTemplate jdbctemplate;
	
	
	
	@Override
	public boolean registerdao(Student std) {
		
		boolean status =false;

		
		try {
			
			
		String mysql="INSERT INTO register values(?,?,?,?,?)";
			
			
		int count=jdbctemplate.update(mysql , new Object[] {std.getName() , std.getEmail() , std.getPassword() , std.getGender(),std.getCity()});
			
		if(count > 0) {
			
			status=true;
		}else {
			status=false;
		}
		
		
		
		} catch (Exception e) {
			
			status=false;
			
			
		}
		
	
		return status;
		
		
		
	}

}
