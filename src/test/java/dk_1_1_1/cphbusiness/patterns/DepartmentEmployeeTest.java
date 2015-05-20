package dk_1_1_1.cphbusiness.patterns;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class DepartmentEmployeeTest {
  private Department company;
  private Department it;
  private Department adm;
  private Employee kurt; 
  private Employee sonja;
  private Employee viggo;
  
  @Before
  public void setup() {
    company = new Department("The firm", 100000);
    adm = new Department(company, "ADM", 20000);
    it = new Department(company, "IT", 30000);
    
    kurt = new Employee("Kurt", 5000, it);
    sonja = new Employee("Sonja", 5000, it);
    viggo = new Employee("Viggo", 6000, adm);
    }

  @Test
  public void testDepartmentEmployees() throws Exception {
    assertThat(it.getEmployees().size(), is(2));
    assertThat(adm.getEmployees().size(), is(1));
    }
  
  @Test
  public void testEmployeesCanChangeDepartment() throws Exception {
    kurt.setDepartment(adm);
    assertThat(it.getEmployees().size(), is(1));
    assertThat(adm.getEmployees().size(), is(2));
    }
  
  @Test
  public void testDepartmentChildren() throws Exception {
    assertThat(company.getChildren().size(), is(2));
    }
  
  @Test
  public void testDepartmentCanChangeParent() throws Exception {
    it.setParent(adm);
    assertThat(company.getChildren().size(), is(1));
    assertThat(adm.getChildren().size(), is(1));
    }
  
  }
