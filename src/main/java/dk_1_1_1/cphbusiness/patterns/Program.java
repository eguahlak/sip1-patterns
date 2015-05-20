package dk_1_1_1.cphbusiness.patterns;

public class Program {
  private Department company;
  private Department it;
  private Department adm;
  private Employee kurt; 
  private Employee sonja;
  private Employee viggo;
  
  public Program() {
    company = new Department("The firm", 100000);
    adm = new Department(company, "ADM", 20000);
    it = new Department(company, "IT", 30000);
    
    kurt = new Employee("Kurt", 5000, it);
    sonja = new Employee("Sonja", 5000, it);
    viggo = new Employee("Viggo", 6000, adm);
    }

  public void testPrinter() {
    Visitor printer = new PrintVisitor();
    company.accept(printer);
    System.out.println("--------");
    company.accept(new SalaryVisitor());
    company.accept(printer);
    }
  
  public static void main(String[] args) {
    Program program = new Program();
    program.testPrinter();
    }
  
}
