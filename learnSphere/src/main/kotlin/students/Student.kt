package students

data class Student(
    val id: Int = 0,
    val name: String = "student name",
    val dateOfBirth: String = "1/1/2000",
    val phoneNumber: PhoneNumber = PhoneNumber(),
    val parentsPhoneNumbers: MutableList<PhoneNumber> = mutableListOf(),
    val school: School = School(),
    val address: String = "student address"
)

data class School(
    val id: Int = 0,
    val name: String = "school name",
    val location: String = "school location",
    val stage: MutableList<SchoolStage> = mutableListOf(
        SchoolStage.ALL
    )
)

enum class SchoolStage {
    PRIMARY, SECONDARY, MID, ALL
}


data class PhoneNumber(
    val number: String = "0190439584305",
    val hasWhatsapp: Boolean = false
)