package org.example

class Employee {
   Integer id
   String name
   String email

   static constraints = {
       id(blank: false)  
   }
}