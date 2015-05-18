package dk_1.cphbusiness.patterns;

import java.util.ArrayList;
import java.util.Collection;

public class Program {
  
  public static void main(String[] args) {
    Collection<Department> departments = new ArrayList<>();
    Department adm = new Department("ADM", 20000);
    Department it = new Department("IT", 30000);
    departments.add(adm);
    departments.add(it);
    
    Employee kurt = new Employee("Kurt", 5000, it);
    Employee sonja = new Employee("Sonja", 5000, it);
    Employee viggo = new Employee("Viggo", 6000, adm);
    
    System.out.println("Kurt's department: "+kurt.getDepartment().getName());
    for (Department department : departments) {
      System.out.println(department.getName());
      for (Employee employee : department.getEmployees()) {
        System.out.println("  "+employee.getName());
        }
      }
    
    }
  
  
  }
