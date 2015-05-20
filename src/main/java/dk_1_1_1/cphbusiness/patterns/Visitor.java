package dk_1_1_1.cphbusiness.patterns;

public interface Visitor {
  void visit(Employee employee);
  void visit(Department department);
  }
