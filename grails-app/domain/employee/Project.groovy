package employee

class Project implements Serializable {

    String name

    static hasMany = [tasks: Task]

    static constraints = {
        name nullable: false
    }

    Project(String n) {
        name = n
    }
}
