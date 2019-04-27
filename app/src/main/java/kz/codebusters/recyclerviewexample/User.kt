package kz.codebusters.recyclerviewexample

open class User(private var name: String, private var surname: String, var age: Int) {
    fun getName(): String = name
    fun getSurname(): String = surname
}

class Student(name: String, surname: String, age: Int, var course: Int): User(name, surname, age) {

}

