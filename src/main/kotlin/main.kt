fun main() {
    val countLikes = 361
    val people1 = "Человеку"
    val people2 = "Людям"

    val ostOne = countLikes % 10
    val ostTwo = countLikes % 100

    val finResult = if (ostOne == 1 && ostTwo != 11) people1 else people2

    println("Нравится: $countLikes $finResult")
}