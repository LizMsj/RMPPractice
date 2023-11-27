fun main() {

    println("введите строку:")
    println(getLenght(readLine()))

}

fun getLenght(str: String?) : Int
{
    if(str.equals(null))
        return 0
    else
        return str!!.length
}

/*
Создайте null-безопасную функцию getLength(str: String?):Int ,
возвращающую длину str, если str не null, и 0 в противном случае.
 */