fun main(){
    capital()
    number()
    food()
    var x = words(arrayOf("Patterson","Madison","Johnson"))
    println(x)
}
fun food(){
    var type = arrayOf("ugali","chips","chapati","matoke")
    println(type.contentToString())
}

fun capital(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
    for(city in cities)
        println(city. capitalize())
}
fun number(){
 var  numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
var sum = numbers[1] + numbers[4]
    println(sum)
    println(numbers.indexOf(158))

var integers = numbers.sortedArray()
println(integers.contentToString())

}
fun words(names:Array<String>):String{
    var surname = names.contentToString()
    return surname


}