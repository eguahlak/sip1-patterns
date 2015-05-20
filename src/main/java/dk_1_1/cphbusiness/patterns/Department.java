package dk_1_1.cphbusiness.patterns;

import java.util.ArrayList;
import java.util.Collection;

public class Department {
  private Department parent;
  private final String name;
  private long budget;
  private Collection<Employee> employees = new ArrayList<>();
  private Collection<Department> children = new ArrayList<>();
  
  public Department(String name, long budget) {
    this.name = name;
    this.budget = budget;
    }

  public Department(Department parent, String name, long budget) {
    this(name, budget);
    setParent(parent);
    }

  void add(Employee employee) {
    employees.add(employee);
    }
  
  void remove(Employee employee) {
    employees.remove(employee);
    }
  
  public String getName() {
    return name;
    }

  public long getBudget() {
    return budget;
    }

  public void setBudget(long budget) {
    this.budget = budget;
    }

  public Collection<Employee> getEmployees() {
    return employees;
    }

  public Department getParent() {
    return parent;
    }

  public void setParent(Department parent) {
    if (this.parent != null) this.parent.children.remove(this);
    this.parent = parent;
    if (this.parent != null) this.parent.children.add(this);
    }
  
  public Collection<Department> getChildren() {
    return children;
    }

  }
