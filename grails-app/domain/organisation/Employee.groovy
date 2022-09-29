package organisation

class Employee implements Serializable {

    String name
    String address


    static hasMany = [departments: Department]


    static constraints = {
        name nullable: false
        address nullable: false
    }

    public Employee(String na, String add) {
        name = na
        address = add
    }

}
