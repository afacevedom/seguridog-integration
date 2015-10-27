package co.com.seguridog

class Retraining extends CanineProfile{
    Date dateTraining
    String typeTraining
    String issuesTraining

    static belongsTo = [instructors : K9Instructor, canines : Canine]

    static constraints = {
        dateTraining (blank: false)
        typeTraining (blank: false)
        issuesTraining (blank: false)
    }
}
