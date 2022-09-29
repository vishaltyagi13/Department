package customer

class CustomerDetail implements Serializable{

    String departmentName
    String location


    static belongsTo = [customer:Customer]

    static constraints = {
        departmentName nullable: false
       location nullable: false
    }

    CustomerDetail(String department , String loc){
        departmentName=department
        location=loc

    }
}
