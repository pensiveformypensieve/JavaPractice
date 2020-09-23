1. Merge Names

Implement the uniqueNames method. When passed two arrays of names, it will return an array containing the names that appear in either or both arrays. The returned array should have no duplicates.

For example, calling MergeNames.uniqueNames(new String[]{'Ava', 'Emma', 'Olivia'}, new String[]{'Olivia', 'Sophia', 'Emma'}) should return an array containing Ava, Emma, Olivia, and Sophia in any order.

2. Quadratic Equation

Implement the function findRoots to find the roots of the quadratic equation: ax2 + bx + c = 0. If the equation has only one solution, the function should return that solution as both elements of the Roots. The equation will always have at least one solution.

The roots of the quadratic equation can be found with the following formula: A quadratic equation.

For example, the roots of the equation 2x2 + 10x + 8 = 0 are -1 and -4.

11. Alert Service

Refactor the AlertService and MapAlertDAO classes:
Create a new package-private interface, named AlertDAO, that contains the same methods as MapAlertDAO.
MapAlertDAO should implement the AlertDAO interface.
AlertService should have a constructor that accepts AlertDAO.
The raiseAlert and getAlertTime methods should use the object passed through the constructor.

Q12:

-- Suggested testing environment:
-- http://sqlite.online/

-- Example case create statement:
CREATE TABLE employees (
  id INTEGER NOT NULL PRIMARY KEY,
  name VARCHAR(30) NOT NULL
);

CREATE TABLE sales (
  employeeId INTEGER NOT NULL REFERENCES employees(id), 
  value INTEGER NOT NULL CHECK(value > 0)
);

INSERT INTO employees(id, name) VALUES(1, 'John');
INSERT INTO employees(id, name) VALUES(2, 'Mark');
INSERT INTO employees(id, name) VALUES(3, 'Jane');

INSERT INTO sales(employeeId, value) VALUES(1, 100);
INSERT INTO sales(employeeId, value) VALUES(3, 300);

-- Expected output:
-- name
-- ----
-- Mark

-- Explanation:
-- In this example.
-- John and Jane both have sales. Only Mark has no sales.

--find the name of the employee with no sales.

Q6:

Write a method that, efficiently with respect to time used, finds the first name in an array that occurs only once in that array. If there are no unique names in the array, null should be returned.

For example, firstUniqueName(new String[]{"Abbi", "Adeline", "Abbi", "Adalia"}) should return "Adeline".

Q5:

Using JUnit Assert class, write test for the Shelf class covering the following cases:

- The put method will do nothing when passed null. It should also do nothing when passed an empty string.
- Each individual item can only be taken from the shelf once.
- Duplicate items can exist on the shelf at the same time.

Each of the test case methods should be in the ShelfTester class and have Test attributes.

Q:

Make the Utilities class unextendable and non-instantiateable(?)

Q:

Validate username to only allow first character as a letter, a single optional dash, but not at the end, min. length 6 and max. length 16

Q:

Check if a programming teacher teaches a certain language. If yes, teach the programmer student.