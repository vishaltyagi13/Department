package customer

class Customer implements Serializable {

    //String uuid =  UUID.randomUUID()
    String name
    String address
    String phoneNo
    CustomerDetail customerDetail

    static constraints = {
        name nullable: false
        address nullable: true
        phoneNo nullable: true
    }

    Customer(String na, String add, String phone) {
        name = na
        address = add
        phoneNo = phone
    }
}

