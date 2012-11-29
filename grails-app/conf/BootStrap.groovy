import org.example.Employee

class BootStrap {
   def init = { servletContext ->

       // Only add data if the DB is empty
       if (!Employee.count()) {
           new Employee(
               id:    1320,
               name:  "Natasha Rathbone",
               email: "nrathbone@vandelayenterprises"
           ).save(failOnError: true)

           new Employee(
               id:    1510,
               name:  "Peter Reeve",
               email: "preeve@vandelayenterprises"
           ).save(failOnError: true)

           new Employee(
               id:    6456,
               name:  "Mike Plonka",
               email: "mplonka@vandelayenterprises"
           ).save(failOnError: true)
       }
   }

   def destroy = { }
}