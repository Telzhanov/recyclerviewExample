package kz.codebusters.recyclerviewexample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_recycler_view.view.*

class RecyclerViewAdapter(var listUsers: ArrayList<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        viewHolder.itemView.nameTitle.text = listUsers[position]
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        return RecyclerViewHolder(LayoutInflater.from(p0.context)
            .inflate(R.layout.item_recycler_view, p0, false))
    }

    override fun getItemCount(): Int = listUsers.size


    class RecyclerViewHolder(v: View): RecyclerView.ViewHolder(v) {

    }
}