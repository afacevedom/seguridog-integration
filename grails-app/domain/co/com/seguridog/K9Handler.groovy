package co.com.seguridog

class K9Handler {
    String approvedCourse
    Date dateApproved

    static hasMany = [workcanines : WorkCanine]

    static constraints = {
        approvedCourse(blank: false)
        dateApproved blank: false
    }

}
