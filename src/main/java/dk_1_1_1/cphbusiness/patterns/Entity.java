package dk_1_1_1.cphbusiness.patterns;

import java.util.Collection;

public interface Entity {
  Collection<Entity> getEntities();
  String getName();
  void accept(Visitor visitor);
  }
