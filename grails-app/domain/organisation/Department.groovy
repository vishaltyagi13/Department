package organisation

class Department implements Serializable {

    String departmentName
    String location

    static hasMany = [employees:Employee]

    static belongsTo = Employee

    static constraints = {
        departmentName nullable: false
        location nullable: false
    }
    public Department(String department, String locate){
        departmentName=department
        location=locate

    }
}
