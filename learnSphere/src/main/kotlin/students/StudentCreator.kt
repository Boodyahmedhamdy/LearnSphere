package students

class StudentCreator {

    fun createStudent(
        name: String,
        dateOfBirth: String,
        phoneNumber: PhoneNumber,
        parentsPhoneNumbers: MutableList<PhoneNumber>,
        school: School,
        address: String
    ): Student {

        val createdStudent = Student(
            name = name,
            dateOfBirth = dateOfBirth,
            phoneNumber = phoneNumber,
            parentsPhoneNumbers = parentsPhoneNumbers,
            school = school,
            address = address
        )
        println("the student with name ${createdStudent.name} was created")

        return createdStudent
    }
}