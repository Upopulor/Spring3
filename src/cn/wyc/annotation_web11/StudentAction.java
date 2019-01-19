package cn.wyc.annotation_web11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentActionId")
public class StudentAction {
	@Autowired //按照默认类型
	private StudentService ss;
	public void execute() {
		ss.addStudent();
	}

}
