import customer.CustomerService

class BootStrap {

    CustomerService customerService

    def init = { servletContext ->
       // customerService.createCustomerRecord()
      // customerService.createProjectRecord()
        //customerService.heelo()
        customerService.createOrganisationRecord()
    }
    def destroy = {
    }
}
