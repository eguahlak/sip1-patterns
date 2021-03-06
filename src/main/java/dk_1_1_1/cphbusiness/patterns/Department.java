package dk_1_1_1.cphbusiness.patterns;

import java.util.ArrayList;
import java.util.Collection;

public class Department implements Entity {
  private Department parent;
  private final String name;
  private long budget;
  private Collection<Entity> entities = new ArrayList<>();
  
  public Department(String name, long budget) {
    this.name = name;
    this.budget = budget;
    }

  public Department(Department parent, String name, long budget) {
    this(name, budget);
    setParent(parent);
    }

  void add(Entity entity) {
    entities.add(entity);
    }
  
  void remove(Entity entity) {
    entities.remove(entity);
    }
  
  public String getName() {
    return name;
    }

  public long getBudget() {
    return budget;
    }

  public void setBudget(long budget) {
    this.budget = budget;
    }

  public Collection<Employee> getEmployees() {
    Collection<Employee> employees = new ArrayList<>();
    for (Entity entity : entities)
      if (entity instanceof Employee) employees.add((Employee)entity);
    return employees;
    }

  public Department getParent() {
    return parent;
    }

  public void setParent(Department parent) {
    if (this.parent != null) this.parent.remove(this);
    this.parent = parent;
    if (this.parent != null) this.parent.add(this);
    }
  
  public Collection<Department> getChildren() {
    Collection<Department> children = new ArrayList<>();
    for (Entity entity : entities)
      if (entity instanceof Department) children.add((Department)entity);
    return children;
    }

  @Override
  public Collection<Entity> getEntities() {
    return entities;
    }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
    for (Entity entity : entities) entity.accept(visitor);
    }

  }
