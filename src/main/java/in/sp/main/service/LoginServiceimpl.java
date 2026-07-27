package in.sp.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.beans.Student;
import in.sp.main.dao.LoginDao;
import in.sp.main.dao.LoginDaoimpl;

@Service
public class LoginServiceimpl implements LoginService {
	
	@Autowired
	LoginDao loginDao;
	
	
	

	@Override
	public List<Student> loginService(String email, String password) {
		
//		LoginDaoimpl loginDaoImpl=new LoginDaoimpl();
//		List<Student>student_list=loginDaoImpl.loginDao(email, password);
//		return student_list;
		
//		LoginDao logindao=new LoginDaoimpl();
//		List<Student>student_list=logindao.loginDao(email, password);
//		return student_list;
		
		
		List<Student>student_list=loginDao.loginDao(email, password);

		return student_list;
	}





	
	
	
	
	
	
	

}
