# ADP372S-Mini-Assignment-1

SOLID Principles Applied

Single Responsibility Principle (SRP)
Each class in the system has one clear responsibility. Student defines common student properties and behaviors. Subclasses handle their own tuition logic and student-specific data. Builder classes are responsible only for object construction

Open/Closed Principle (OCP) The system is open to extension but closed to modification. A new type of student (Part-Time Student) can be introduced by inheriting from the Student class. There is no need to modify existing classes to support new types of students
