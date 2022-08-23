package uz.exemple.less6_1_task_kotlin.model

class AlphabetModel{
    private var iconId: Int? =null
    private var letters: String? = null

    constructor(iconId: Int?, letters: String?) {
        this.iconId = iconId
        this.letters = letters
    }


    fun getIconId(): Int {
        return iconId!!
    }


    fun getLetters(): String {
        return letters!!
    }
}