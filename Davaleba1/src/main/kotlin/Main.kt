import java.lang.NumberFormatException
import java.security.KeyStore.TrustedCertificateEntry
import java.util.*
import kotlin.math.sign

fun main() {
    val reader = Scanner(System.`in`)
    var x : Long = 0
    var y : Long = 0
    var isTrue = true
    while (isTrue) {
        print("შეიყვანეთ X --> ")
        var userInput = reader.next()

        try {
            x = userInput.toLong()

        }catch (e: NumberFormatException){
            print("გთხოვთ შეიყვანოთ რიცხვი სწორად: ")
            continue
        }

        var isSomething = true
        print("შეიყვანეთ Y --> ")

        while (isSomething){
            var input2 = reader.next()
            try {
                y = input2.toLong()
                isSomething = false
            }catch (e: NumberFormatException){
                print("გთხოვთ შეიყვანოთ რიცხვი სწორად: ")
            }
        }


        var answer = ""
        val z = x + y
        println("X და Y ჯამი არის: $z")
        // isSomething არის false (line 30)
        while (!isSomething){
            print("გსურთ პროგრამის ხელახლა დაწყება <Y/N>? ")
                answer = reader.next()
            if (answer != "დიახ" && answer != "არა") {
                println("""მოხდა გაუთვალისწინებელი შეცდომა! გთხოვთ თავიდან შეიყვანოთ პასუხი 
                  | ---> დიახ
                  | ---> არა
                 """.trimMargin())
            }
            if (answer == "დიახ" || answer == "არა" ){
                isSomething = true
            }
        }
        if (answer == "დიახ") {
            continue
        }
        if (answer == "არა") { // else ში შეიძლება რომ ჩავსვათ იმიტორო answer - ი "არა" -ს გარდა მნიშვნელობას ვეღარ მიიღებს მაინც ( If condition is always true )
            println("დასასრული")
            isTrue = false
        }
    }

}



/*fun main() {
    val reader = Scanner(System.`in`)
    var isTrue = true
    while (isTrue) {
        val x = reader.nextLong()
        val y = reader.nextLong()
        val z = x + y
        println("X და Y ჯამი არის: $z")
        println("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?")
        val answer = reader.next()
        if (answer == "დიახ") {
            continue
        }
        if (answer == "არა") {
            println("დასასრული")
            isTrue = false
        }
    }

}


*/




