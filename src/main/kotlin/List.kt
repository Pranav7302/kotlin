

fun main() {
    val shoppingList = mutableListOf<String>()

    // Add items to the shopping list
    shoppingList.add("Apples")
    shoppingList.add("Bread")
    shoppingList.add("Milk")

    // View the current shopping list
    println("Current Shopping List:")
    shoppingList.forEach { it -> println("- $it") }

    // Remove an item from the list
    shoppingList.removeAt(1)

    // View the updated shopping list
    println("\nUpdated Shopping List:")
    shoppingList.forEach { item -> println("- $item") }

    // Mark an item as purchased
    val itemToCheckOff = "Apples"
    if (shoppingList.contains(itemToCheckOff)) {
        println("\nMarking $itemToCheckOff as purchased.")
        shoppingList.remove(itemToCheckOff)
    } else {
        println("\n$itemToCheckOff is not in the shopping list.")
    }

    // View the final shopping list
    println("\nFinal Shopping List:")
    shoppingList.forEach { item -> println("- $item") }

    // Clear the entire shopping list
    shoppingList.clear()

    // View the empty shopping list
    println("\nEmpty Shopping List:")
    shoppingList.forEach { item -> println("- $item") }
}
