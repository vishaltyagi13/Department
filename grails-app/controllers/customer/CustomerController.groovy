package customer

import organisation.Department
import organisation.Employee

class CustomerController {


    CustomerService customerService

    def abc() {
        customerService.createProjectRecord()
        render "ok"
    }

    def createOrganisationRecord() {
        Employee employee = new Employee(name: "akash", address: "delhi")


        employee.save()

        Department department = new Department(departmentName: "IT", location: "noida")


        department.save()
        render "ok"
    }
}
