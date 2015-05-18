package dk_1.cphbusiness.patterns;

public class Employee {
  private final String name;
  private long salary;
  private Department department;
  
  public Employee(String name, long salary, Department department) {
    this.name = name;
    this.salary = salary;
    setDepartment(department);
    }

  public String getName() {
    return name;
    }

  public long getSalary() {
    return salary;
    }

  public void setSalary(long salary) {
    this.salary = salary;
    }

  public Department getDepartment() {
    return department;
    }

  public void setDepartment(Department department) {
    if (this.department != null) this.department.remove(this);
    this.department = department;
    if (this.department != null) this.department.add(this);
    }
  
  
  
}
