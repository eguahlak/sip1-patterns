package dk.cphbusiness.patterns;

public interface Visitor {
  void visit(Department department);
  void visit(Employee employee);
  }
