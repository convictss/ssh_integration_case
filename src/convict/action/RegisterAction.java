package convict.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import convict.execption.AgeException;
import convict.po.User;
import convict.service.UserService;

@Controller()
@Scope("prototype")
public class RegisterAction {
	
	@Autowired
	private UserService userService;
	
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String execute() {
		if (user.getAge()>100) {
			throw new AgeException("年龄不符合要求");
		}
		userService.addUser(user);
		return "success";
	}
}
