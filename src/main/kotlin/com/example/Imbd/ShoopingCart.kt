package com.example.Imbd
data class Items(var name:String,var price:Int)
class ShoopingCart {
    var list1= mutableListOf<Items>(
        Items("laptop",50000),
        Items("phone",25000),
        Items("tv",45000),
        Items("shirt",2000)
    )
    var list2: MutableList<Items> = mutableListOf<Items>()
    fun addingToCart(name:String){
        var list  = list1.filter { it.name.equals(name) }
        var listt = list2.addAll(list)
        if (listt){
            println("added to cart")
        }
        else{
            println("item not found")
        }
    }
    fun viewingCart(){
        println(list2)
    }
    fun removingItems(name: String){
        var list3: List<Items> =list2.filter { it.name.equals(name) }
        var list = list2.remove(list3[0])
        if(list){
            println("item removed")
        }
        else{
            println("item not present in cart")
        }
    }
    fun totalPrice(){
        var amount = 0
        var totalPrice=list2.map { amount+=it.price }
        println(" total price is $amount")
    }
}
fun main(){
    var ShoopingCartOnj = ShoopingCart()
        do {

            println(" 1.add item from cart  \n 2.view cart \n 3.remove item from cart \n 4.totalPrice")
            var i = readln().toInt()
            when (i) {
                1 -> {
                    println("enter item name")
                    var name = readln()
                    ShoopingCartOnj.addingToCart(name)
                }

                2 -> ShoopingCartOnj.viewingCart()
                3 -> {println("enter item name")
                    var name = readln()
                    ShoopingCartOnj.removingItems(name)
                }
                4 ->ShoopingCartOnj.totalPrice()
            }
            println("do you want to do changes in cart press 1")
            var x = readln().toInt()
        }while (x==1)


}