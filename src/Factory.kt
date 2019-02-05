fun main(args: Array<String>) {
    var bill: Bill = BillFactory.getBill("Tax")
    bill.id = 1
    bill.amount = 100.0

}

class BillFactory {
    companion object {
        fun getBill(myType: String): Bill {

            return if (myType == "Tax") {

                GenericBill()
            } else {
                LimitedBill()
            }
        }
    }
}


abstract class Bill {

    val id: Int = 0
    val amount: Double = 0.0

    abstract fun getAmountWithTax(): Double
}

class GenericBill : Bill() {
    
    override fun getAmountWithTax(): Double {
        return amount * 1.22
    }

}

class LimitedBill : Bill() {

    override fun getAmountWithTax(): Double {
        return amount * 1.07
    }

}