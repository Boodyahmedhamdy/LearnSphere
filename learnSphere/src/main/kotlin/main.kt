import students.*

fun main() {
    println("welcome to LearnSphere")
    val school = School(
        name = "omar-ebn elkhatab",
        location = "emtidad",
        stage = mutableListOf(SchoolStage.SECONDARY)
    )

    val studentCreator = StudentCreator()
    val createdStudent = studentCreator.createStudent(
        name = "boody",
        dateOfBirth = "3/6/2002",
        address = "amirican project",
        school = school,
        phoneNumber = PhoneNumber(
            number = "01019063755",
            hasWhatsapp = true
        ),
        parentsPhoneNumbers = mutableListOf()
    )

    val repository = StudentRepository()

    repository.saveStudent(createdStudent)

    println("after creation: ${repository.getAllStudents()}")




}