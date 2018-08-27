package java_to_kotlin.demo12

/**
 * @author by LiFan
 * @date 2018/8/24
 */
class EqualsClass(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (other is EqualsClass)
            return name.equals(other.name) &&
                    postalCode.equals(other.postalCode)
        return false
    }

    override fun hashCode(): Int {
        return (name + postalCode).hashCode()
    }
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val processed = hashSetOf(EqualsClass("Alice", 342562))
    println(processed.contains(EqualsClass("Alice", 342562)))
}
