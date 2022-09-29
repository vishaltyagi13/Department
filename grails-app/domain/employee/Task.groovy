package employee

class Task implements Serializable {

    String employeeAssignedTo
    String employeeAssignedBy

    static belongsTo = [project: Project]

    static constraints = {
        employeeAssignedTo nullable: false
        employeeAssignedBy nullable: false
    }

    public Task() {}

    public Task(String employeeTo, String employeeBy) {
        employeeAssignedTo = employeeTo
        employeeAssignedBy = employeeBy

    }
}
