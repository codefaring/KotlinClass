// 내부 클래스
class OuterClass {
    var num = 10

    inner class InnerClass {
        fun a() {
            num = 20
            println("$num")
        }
    }
}

// 데이터 클래스
data class User(val name: String, val age:Int)

fun main() {
    var outerClass = OuterClass()
    println("${outerClass.num}")    // 10
    outerClass.InnerClass().a()     // 20

    val user1: User = User("코틀린", 20)
    println("${user1.toString()}")

    val user2 = user1.copy(name = "자바")
    println("${user2.toString()}")
}