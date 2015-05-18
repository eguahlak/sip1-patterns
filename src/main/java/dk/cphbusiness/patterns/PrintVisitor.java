package dk.cphbusiness.patterns;

public class PrintVisitor implements Visitor {

  @Override
  public void visit(Department department) {
    System.out.println("Department "+department.getName()+" has a budget of "+department.getBudget());
    for (Entity entity : department.getEntities()) entity.accept(this);
    }

  @Override
  public void visit(Employee employee) {
    System.out.println("Employee "+employee.getName()+" earns "+employee.getSalary());
    }
  
  }
