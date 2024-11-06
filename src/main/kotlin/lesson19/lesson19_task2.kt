package org.example.lesson19

fun main() {
    val product1 = Product("часы", 1, Category.OTHER)
    val product2 = Product("трусы", 2, Category.CLOTHES)
    val product3 = Product("карандаши", 3, Category.OFFICE_SUPPLIES)

    product1.getProductInfo()
    println()
    product2.getProductInfo()
    println()
    product3.getProductInfo()
}

enum class Category {
    CLOTHES,
    OFFICE_SUPPLIES,
    OTHER;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHES -> "Одежда"
            OFFICE_SUPPLIES -> "Канцтовары"
            OTHER -> "Разное"
        }
    }
}

private class Product(
    val productName: String,
    val productId: Int,
    val productCategory: Category,
) {
    fun getProductInfo() {
        println(
            String.format(
                "Наименование товара: %s\n" +
                        "Категория: %s\n" +
                        "Артикул: %d",
                productName,
                productCategory.getCategoryName(),
                productId
            )
        )
    }
}