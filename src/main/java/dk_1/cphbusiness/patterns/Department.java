package dk_1.cphbusiness.patterns;

import java.util.ArrayList;
import java.util.Collection;

public class Department {
  private final String name;
  private long budget;
  private Collection<Employee> employees = new ArrayList<>();
  
  public Department(String name, long budget) {
    this.name = name;
    this.budget = budget;
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

  }
