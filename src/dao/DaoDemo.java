package dao;

import java.util.ArrayList;
import java.util.List;

public class DaoDemo {
	
	public static void show(List<Intern> list) {
		for (Intern intern : list) {
			System.out.println(intern.getName());
		}
	}

	public static void main(String[] args) {
		
		List<Intern> list;
		
		list = new ArrayList<Intern>();
		list.add(new Intern("0093", "Tuan", 22, "Male"));
		list.add(new Intern("0094", "Tan", 22, "Male"));
		list.add(new Intern("0095", "Hop", 21, "Female"));
		list.add(new Intern("0096", "Thu", 21, "Female"));
	
		InternDao internDao = new InternDaoImpl(list);
			
		DaoDemo.show(internDao.getAllIntern());
		
		internDao.addIntern(new Intern("0099","NewBie",21,"Male"));
		
		DaoDemo.show(internDao.getAllIntern());
		
		internDao.deleteIntern("0099");
		
		DaoDemo.show(internDao.getAllIntern());
		
		internDao.updateIntern(new Intern("0095", "Hop", 22, "Male"));
		
		System.out.println(internDao.getIntern("0095").getGender());
	}

}
