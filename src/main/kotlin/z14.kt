fun main() {

    println("введите строку:")

    val a: String? = readLine()
    val b: Int? = getLength(a)
    println(b)
}


fun getLength(str: String?) : Int?
{
    if(str!!.isEmpty())
        return null
    else
        return str!!.length
}

/*
Создайте null-опасную функцию getLength(str: String?):Int?

Функция должна:

-возвращать длину str, если str не равно null;
-возвращать null, если str равно null.
 */