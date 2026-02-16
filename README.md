# ADP372S-Mini-Assignment-1

SOLID Principles Applied

Single Responsibility Principle (SRP)
Each class in the system has one clear responsibility
Student defines common student properties and behaviors
Subclasses handle their own tuition logic and student-specific data
Builder classes are responsible only for object construction

Open/Closed Principle (OCP)
The system is open for extension but closed for modification
New student types (e.g. Part-Time Student) can be added by extending the Student class
Existing classes do not need to be modified to support new student types
