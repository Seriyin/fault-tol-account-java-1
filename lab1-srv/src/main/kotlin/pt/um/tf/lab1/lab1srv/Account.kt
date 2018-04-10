package pt.um.tf.lab1.lab1srv

import pt.um.tf.lab1.lab1mes.Bank

class Account : Bank {
    override fun balance(): Int {
        return balance
    }

    private var balance : Int = 0

    override fun movement(mov : Int): Boolean {
        var res = true
        if (mov > 0) {
            balance += mov
        }
        else {
            if (-mov > balance) {
                res = false
            }
            else {
                balance -= -mov
            }
        }
        return res
    }
}