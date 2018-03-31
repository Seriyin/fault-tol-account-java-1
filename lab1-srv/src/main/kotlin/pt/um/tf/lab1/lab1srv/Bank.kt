package pt.um.tf.lab1.lab1srv

interface Bank {
    fun movement(mov : Int) : Boolean
    fun balance() : Int
}