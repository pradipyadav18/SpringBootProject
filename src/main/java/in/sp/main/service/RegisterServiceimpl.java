package in.sp.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sp.main.beans.Student;
import in.sp.main.dao.RegisterDao;

@Service
public class RegisterServiceimpl implements RegisterService{

	
	@Autowired
	RegisterDao register;
	
	
	
	@Override
	public boolean registerService(Student std) {
		
		boolean result=register.registerdao(std);
		
		
		return result;
	}

}
