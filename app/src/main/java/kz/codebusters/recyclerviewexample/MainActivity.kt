package kz.codebusters.recyclerviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val users = ArrayList<String>()
//        val user
//        users.add("Ivan")
//        users.add("Askhat")
//        users.add("Gaukhar")
//        users.add("Nurlan")
//        recyclerView.adapter = RecyclerViewAdapter(users)

        val user = User(name = "Askhat", surname = "Telzhaov", age = 22)
        val student = Student(name = "Nurlan", surname = "Nurlanov", age = 22, course = 1)
        val user1 = User("Nurlan", "Nurlanov", 22)
        val student2: Student = Student("Gaukhar", "Yeshimova", 22, 2)
        val users = ArrayList<User>()
        users.add(user)
        users.add(student)
        recyclerView.adapter = RecyclerViewAdapter(users)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
