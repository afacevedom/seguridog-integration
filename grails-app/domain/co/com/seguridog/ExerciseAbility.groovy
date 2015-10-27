package co.com.seguridog

class ExerciseAbility extends CanineProfile {
    Date dateAbility
    String typeAbility
    String nameAbility
    String exercicesAbility

    static belongsTo = [instructors : K9Instructor, canines : Canine]

    static constraints = {
        dateAbility (blank: false)
        typeAbility (blank: false)
        nameAbility (blank: false)
        exercicesAbility (blank: false)
    }

}
