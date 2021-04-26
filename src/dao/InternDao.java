package dao;

import java.util.List;

public interface InternDao {
	public List<Intern> getAllIntern();
	public Intern getIntern(String id);
	public void addIntern(Intern intern);
	public void deleteIntern(String id);
	public void updateIntern(Intern intern);
}
