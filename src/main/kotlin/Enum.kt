

enum class CardType(val maxLimit: Int = 50000)
{
    Silver(30000),
    Gold,
    Platinum
}

fun main()
{
    val card1 = CardType.Silver

    when(card1) {
        CardType.Gold -> print("Gold Card")
        CardType.Silver -> print("Silver Card ${CardType.Silver.maxLimit}")
        CardType.Platinum -> print("Platinum Card")
    }
}