fun main() {
    var numbers = listOf(55, 22, 15, 62, 73, 88, 99) // immutable list
    println("List: $numbers")
    println("Size: ${numbers.size}")
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")
    println("Third: ${numbers[2]}")
    println("Index of 88: ${numbers.indexOf(88)}")
    println("Contains 73: ${numbers.contains(73)}")

    var names = mutableListOf("John", "Doe", "Jane", "Doe") // mutable list
    println("List: $names")
    names.add("Smith")
    println("List: $names")
    names.remove("Doe") // removes the first occurrence of the element
    println("List: $names")
    names[1] = "Smith"
    println("List: $names")

    var map = mapOf(1 to "One", 2 to "Two", 3 to "Three") // immutable map
    println("Map: $map")
    println("Size: ${map.size}")
    println("Value of key 2: ${map[2]}")
    println("Contains key 3: ${map.containsKey(3)}")
    println("Contains value Four: ${map.containsValue("Four")}")

    var mutableMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2, "three" to 3) // mutable map
    println("Map: $mutableMap")
    mutableMap["four"] = 4
    println("Map: $mutableMap")
    mutableMap.remove("two")
    println("Map: $mutableMap")
    mutableMap["three"] = 33
    println("Map: $mutableMap")
    println("Keys: ${mutableMap.keys}")
    println("Values: ${mutableMap.values}")

}