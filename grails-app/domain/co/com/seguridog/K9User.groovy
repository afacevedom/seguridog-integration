package co.com.seguridog

import java.time.LocalDate
import java.time.Month

class K9User {

    Integer cedula
    String firstName
    String lastName
    String loginUser
    String loginPass
    LocalDate birthDate
    String cellphone
    String eMail

    int getAge() {
        birthDate.compareTo(LocalDate.now())
    }

    String toString() {
        firstName + " " + lastName
    }

    static constraints = {
        cedula nullable: false, blank: false, unique: true
        lastName nullable: false, blank: false, maxSize: 40
        firstName nullable: false, blank: false, maxSize: 40
        birthDate min: LocalDate.of(1900, Month.JANUARY, 1)
        cellphone nullable: false, blank: false, size: 7..10
        eMail nullable: false, blank: false, email: true
        loginUser nullable: false, blank: false, unique: true
        loginPass(nullable: false, blank: false, unique:true, length:8..15, validator:{val, obj ->
            if(val?.equalsIgnoreCase(obj.firstName)) {
                return false
            }
        })
    }
}
