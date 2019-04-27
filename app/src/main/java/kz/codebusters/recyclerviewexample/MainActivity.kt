package kz.codebusters.recyclerviewexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val users = ArrayList<String>()
        users.add("Ivan")
        users.add("Askhat")
        users.add("Gaukhar")
        users.add("Nurlan")
        recyclerView.adapter = RecyclerViewAdapter(users)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
