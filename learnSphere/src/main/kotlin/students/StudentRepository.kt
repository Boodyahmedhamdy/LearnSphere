package students

class StudentRepository {

    private var students: MutableList<Student> = mutableListOf()

    fun getAllStudents(): List<Student> {
        return students
    }

    fun saveStudent(student: Student) {
        students.add(student)
    }


}