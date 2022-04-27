
/*
Zeynab Babaei
hor to define arrayList in Kotlin with functionallity
define List => immutable
define List => immutable
 */

fun main(args: Array<String>) {



var list = arrayListOf<String>("safa", "ali", "baba", "maman")

    println( "size of list before adding new element: $list.size")
    list.forEach { println(it) }
//    list.add("can-Can")
//    println("After adding another string in our arrayList:  ${list.size}")
//    list.forEach { println(it) }
//
    // if we have another list we can also add in our list

    var anotherList = arrayListOf<String>("zahra", "mahsa", "aghdas")
    list.addAll(anotherList)
    println("After adding another list:  ${list.size}")
    list.forEach { println(it) }

    // we can delete one item from arrayList
    list.remove("aghdas")
    list.forEach { println(it) }

    // we can remove all the elements in array list
    list.clear()
    println("After adding another list:  ${list.size}")




    /// How to create List
    // immutable list like array we cannot add or delete elemnt all in all its not changebale size
    val immutablelist = listOf<Int>(1,2,3,4,5,6,7,8)
    println(immutablelist)


    // mutable List -> you can change the same as arrayList

    var mutablelist = mutableListOf<Int>(9,8,7,6,5,4,3,2,1)
    println("size of mutabale list: $mutablelist.size")

    mutablelist.add(0, 100)
    mutablelist.forEach { println(it) }

}