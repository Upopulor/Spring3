package cn.wyc.annotation_web11;

import org.springframework.stereotype.Repository;

@Repository("studentDaoId")
public class StudentDaoImpl implements StudentDao {

	@Override
	public void save() {
		System.out.println("StudentDaoImpl it");
	}

}
