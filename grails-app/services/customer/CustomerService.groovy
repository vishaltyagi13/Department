package customer

import employee.Project
import employee.Task
import organisation.Department
import organisation.Employee

//import grails.transaction.Transactional

//@Transactional
class CustomerService {

    def createCustomerRecord() {
        Customer customer = new Customer("vishal", "gzb", "7017838744")
        CustomerDetail customerDetail = new CustomerDetail("IT", "noida")
        customer.customerDetail = customerDetail
        customer.save()
        customerDetail.save()
        customer.errors.each {
            println "===>  " + it
        }
    }


    def createProjectRecord() {
        Project project = new Project("libraryManagmentSystem")
        project.save(flush: true)
        Task task = new Task("vishal", "ayush")
        task.project = project
        println ""
        println ""
        println ""
        println ""
        println ""
        println ""
        project.errors.each {
            println "" + it
        }

        Task task2 = new Task("vishal123", "hytrr")
        task2.project = project

        Task task3 = new Task("vishal4566", "2312fdfd")
        task3.project = project
//       project.tasks=task
//        project.save()
        task.save(failOnError: true)
        task2.save(failOnError: true)
        task3.save(failOnError: true)

    }


    def heelo() {
        List<Project> projects = Project.findAllByName("libraryManagmentSystem")
        projects.each {
//            it.delete(flush: true)
        }
    }

    def createOrganisationRecord() {
        Employee employee = new Employee(name: "akash", address: "delhi")
        Department department = new Department(departmentName: "IT", location: "noida")

        Employee employeeAyush = new Employee(name: "ayush", address: "mumbai")

        employee.addToDepartments(department)
        employeeAyush.addToDepartments(department)

        employee.save(flush : true)
        employeeAyush.save(flush : true)

//        department.addToEmployees(employee)
        department.save(flush : true)
    }


}

