package uz.exemple.less6_1_task_kotlin

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import uz.exemple.less6_1_task_kotlin.adapter.GridViewAdapter
import uz.exemple.less6_1_task_kotlin.model.AlphabetModel
import uz.exemple.less6_1_task_kotlin.model.ArrayListModel

class MainActivity : AppCompatActivity(),AdapterView.OnItemClickListener {

    var gridView: GridView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    fun initViews() {
        gridView = findViewById(R.id.myGridViews)
        var model = ArrayListModel().setListData()

        refreshAdapter(model as ArrayList<AlphabetModel>)
    }

    fun refreshAdapter(model: ArrayList<AlphabetModel>) {
        val adapter = GridViewAdapter(this, model)
        gridView!!.adapter = adapter
        gridView!!.setOnItemClickListener(this)
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val model = parent!!.getItemAtPosition(position) as AlphabetModel
        Toast.makeText(this, "Clicked by " + model.getLetters(), Toast.LENGTH_SHORT).show()
    }
}