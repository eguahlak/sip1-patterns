package dk.cphbusiness.patterns;

public class Program {
  
  private static void print(Entity entity, String indent) {
    System.out.println(indent+entity.getName());
    for (Entity child : entity.getEntities()) print(child, indent+"  ");
    }
  
  public static void main(String[] args) {
    Department company;
    Department it;
    Department adm;
    Employee kurt; 
    Employee sonja;
    Employee viggo;
  
    company = new Department("The firm", 90000);
    adm = new Department(company, "ADM", 20000);
    it = new Department(company, "IT", 30000);
    
    kurt = new Employee("Kurt", 5000, it);
    sonja = new Employee("Sonja", 5000, it);
    viggo = new Employee("Viggo", 6000, adm);

    print(company, "");
    
    Visitor printer = new PrintVisitor();
    Visitor raiser = new SalaryVisitor();
    company.accept(printer);
    company.accept(raiser);
    System.out.println("----");
    company.accept(printer);
    
    }
  
  
  }
