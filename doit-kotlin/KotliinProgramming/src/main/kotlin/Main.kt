import kotlin.math.PI
import com.example.edu.Person as EduPerson
import com.example.other.Person as OtherPerson
fun main(args: Array<String>) {
    val intro: String = "안녕하세요"
    val num: Int = 10

    var a: String? = null

    val eduUser = EduPerson("Edu Person", age = 26)
    val otherUser = OtherPerson("Other Person", age = 22)

    println("intro $intro, num: $num")
    println("eduUser ${eduUser.name} ${eduUser.age}")
    println("otherUser ${otherUser.name} ${otherUser.age}")

    a = "aaa"
    println("a is $a, length: ${a?.length ?: -1}");
    println(PI)
    val b = 10
    println(b.javaClass)
    println("fact => ${fact(5)}")
}

tailrec fun fact(n: Int, v: Int = 1): Int {
    if (n === 1) return v;
    return fact(n - 1, n * v)
}