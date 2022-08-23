package uz.exemple.less6_1_task_kotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import uz.exemple.less6_1_task_kotlin.R
import uz.exemple.less6_1_task_kotlin.model.AlphabetModel

class GridViewAdapter(var context: Context, var alphabetModels:ArrayList<AlphabetModel>): BaseAdapter() {
    var inflater: LayoutInflater? = null

    init {
        inflater = LayoutInflater.from(context)
    }
    override fun getCount(): Int {
        return alphabetModels.size
    }

    override fun getItem(position: Int): AlphabetModel {
        return alphabetModels.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val convertView = inflater!!.inflate(R.layout.grid_view_item_list,null)
        var iv_icon = convertView.findViewById<ImageView>(R.id.iv_icon_id)
        var tv_letter = convertView.findViewById<TextView>(R.id.tv_name)
        val model = alphabetModels[position]
        iv_icon.setImageResource(model.getIconId())
        tv_letter.setText(model.getLetters())

        return convertView
    }
}