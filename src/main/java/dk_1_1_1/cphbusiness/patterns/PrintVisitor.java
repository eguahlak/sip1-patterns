package dk_1_1_1.cphbusiness.patterns;

public class PrintVisitor implements Visitor {

  @Override
  public void visit(Employee employee) {
    System.out.println("This is the employee called "+employee.getName()+" who earns "+employee.getSalary());
    }

  @Override
  public void visit(Department department) {
    System.out.println("The department "+department.getName()+" has a budget of "+department.getBudget());
    }
  
  }
