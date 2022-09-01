import java.util.*

fun main() {

//LISTS
    //a list made using listOf is immutable
    val states = listOf<String>("IL", "IN", "NY", "HI")
    println(states)

    //to make a list that can be changed, you need to declare it as a mutableListOf
    val countries = mutableListOf<String>("USA", "Mexico", "Canada", "Romania")
    countries.remove("USA")
    countries.removeAt(0)
    println(countries)

//ARRAYS
    //Arrays are different from lists. Arrays are not mutable ever
    val oneDimArray1 = arrayOfNulls<String>(10)
    val oneDimArray2 = arrayOf("mouse", "pencil", "pen", "computer")
    println(java.util.Arrays.toString(oneDimArray2))

    //Arrays can also contain mixed types or be designated to take in only one data type
    val oneDimArray3 = arrayOf("Illinois", 2, "Strings", 6.7)
    var oneDimArray4 = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    //Combining arrays is as simple as adding them together
    val oneDimArray5 = intArrayOf(11,12,13,14,15,16,17,18,19,20)
    var combined = oneDimArray4 + oneDimArray5
    println(Arrays.toString(combined))

    //Traversing arrays
    var i = 0
    println("Size: ${oneDimArray4.size}")
    println("Element: ${oneDimArray4[5]}")

        //While Loops
    while(i < oneDimArray4.size){
        println("${oneDimArray4[i]}")
        i++
    }

    println()

        //Enhanced For Loops
    for (tempVar in oneDimArray4){
        println(tempVar)
    }

    println()

    for(i in 0..oneDimArray4.size - 1){
        println("${oneDimArray4[i]}")
    }

}