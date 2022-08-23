package uz.exemple.less6_1_task_kotlin.model

import uz.exemple.less6_1_task_kotlin.R

class ArrayListModel {
    fun setListData(): ArrayList<AlphabetModel>? {
        val arrayList = ArrayList<AlphabetModel>()
        arrayList.add(AlphabetModel(R.drawable.a, "Apple"))
        arrayList.add(AlphabetModel(R.drawable.b, "Bird"))
        arrayList.add(AlphabetModel(R.drawable.c, "Cake"))
        arrayList.add(AlphabetModel(R.drawable.d, "Donkey"))
        arrayList.add(AlphabetModel(R.drawable.e, "Elephant"))
        arrayList.add(AlphabetModel(R.drawable.f, "fish"))
        arrayList.add(AlphabetModel(R.drawable.g, "Grapes"))
        arrayList.add(AlphabetModel(R.drawable.h, "Home"))
        arrayList.add(AlphabetModel(R.drawable.i, "Ice Cream"))
        arrayList.add(AlphabetModel(R.drawable.j, "Jungle"))
        arrayList.add(AlphabetModel(R.drawable.k, "Kettle"))
        arrayList.add(AlphabetModel(R.drawable.l, "Lion"))
        arrayList.add(AlphabetModel(R.drawable.m, "Moon"))
        arrayList.add(AlphabetModel(R.drawable.n, "Nail"))
        arrayList.add(AlphabetModel(R.drawable.o, "Orange"))
        arrayList.add(AlphabetModel(R.drawable.p, "Pen"))
        arrayList.add(AlphabetModel(R.drawable.q, "Queen"))
        arrayList.add(AlphabetModel(R.drawable.r, "Rock"))
        arrayList.add(AlphabetModel(R.drawable.s, "Star"))
        arrayList.add(AlphabetModel(R.drawable.t, "Tea"))
        arrayList.add(AlphabetModel(R.drawable.u, "Umbrella"))
        arrayList.add(AlphabetModel(R.drawable.v, "Van"))
        arrayList.add(AlphabetModel(R.drawable.w, "Window"))
        arrayList.add(AlphabetModel(R.drawable.x, "X-ray"))
        arrayList.add(AlphabetModel(R.drawable.y, "Yellow"))
        arrayList.add(AlphabetModel(R.drawable.z, "Zoo"))
        return arrayList
    }


}