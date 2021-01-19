import kotlin.random.Random
fun main()
{
        var num1: Int = Random.nextInt(1,11)
        println("Компьютер загадал число от 1 до 10")
        println("Введите число:")
        val num2 = readLine()!!.toInt()

        if (num1 == num2)
            println("Молодец!Ты угадал!")
        else
            println("Не правильно!")


}