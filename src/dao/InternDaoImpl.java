package dao;

import java.util.ArrayList;
import java.util.List;

public class InternDaoImpl implements InternDao{
	List<Intern> list;
	
	public InternDaoImpl(List<Intern> l) {
		this.list = l;
	}
	
	@Override
	public List<Intern> getAllIntern() {
		return list;
	}
	
	@Override
	public Intern getIntern(String id) {
		for (Intern intern : list) {
			if (intern.getId().equals(id)) {
				return intern;
			}
		}
		return null;
	}
	
	@Override
	public void addIntern(Intern intern) {
		list.add(intern);
	}
	
	@Override
	public void deleteIntern(String id) {
		list.removeIf(i -> i.getId().equals(id));
	}
	
	@Override
	public void updateIntern(Intern intern) {
		for (Intern inte : list) {
			if (inte.getId().equals(intern.getId())) {
				list.remove(inte);
			}
		}
		list.add(intern);
	}
}
