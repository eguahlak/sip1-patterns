package dk_1_1_1.cphbusiness.patterns;

public class SalaryVisitor implements Visitor {

  @Override
  public void visit(Employee employee) {
    employee.setSalary(110*employee.getSalary()/100);
    }

  @Override
  public void visit(Department department) { }
  
  }
