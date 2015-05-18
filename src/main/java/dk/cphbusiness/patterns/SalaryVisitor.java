package dk.cphbusiness.patterns;

public class SalaryVisitor implements Visitor {

  @Override
  public void visit(Department department) {
    for (Entity entity : department.getEntities()) {
      entity.accept(this);
      }
    }

  @Override
  public void visit(Employee employee) {
    employee.setSalary(110*employee.getSalary()/100);
    }
  
}
