package ioc7;

import java.util.List;
import java.util.Set;

public class RoleAssembly {
	private Long id;
	private List<Role> list;
	private Set<Role> set;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Role> getList() {
		return list;
	}

	public void setList(List<Role> list) {
		this.list = list;
	}



	public Set<Role> getSet() {
		return set;
	}

	public void setSet(Set<Role> set) {
		this.set = set;
	}
}
