package cn.wyc.annotation_web11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("studentActionId")
public class StudentAction {
	@Autowired //����Ĭ������
	private StudentService ss;
	public void execute() {
		ss.addStudent();
	}

}
