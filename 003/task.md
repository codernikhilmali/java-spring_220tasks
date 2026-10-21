Task 003 — Employee Management Refactoring
Objective: Design a maintainable employee management application by separating responsibilities into different classes.

What we implemented:
- Employee — stores employee ID, name, and base salary.
- SalaryCalculator — calculates annual salary using monthly salary × 12.
- EmployeeRepository — simulates saving employee information.
- EmployeeReport — displays employee details and annual salary.
- Main — coordinates all operations and passes the required data between objects.
  Concepts involved:
  Concept	How we used it
  Single Responsibility Principle (SRP)	Each class handles a distinct responsibility, such as storing data, calculating salary, saving, or reporting.
  Encapsulation	Employee fields are private and accessed through getters.
  Separation of concerns	Business logic is separated from reporting and persistence.
  Loose coupling	EmployeeReport receives the calculated annual salary instead of depending directly on SalaryCalculator.
  Object collaboration	Different objects work together through constructors and method parameters.
  Constructor injection	Dependencies, such as Employee in SalaryCalculator, are supplied through constructors.
  Return values	SalaryCalculator returns the calculated annual salary to the caller.
  Key takeaway: A class should have one primary responsibility. Separating responsibilities makes code easier to maintain, test, and extend.