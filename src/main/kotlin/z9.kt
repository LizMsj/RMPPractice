fun main() {
    println("имя: ")
    val u = NibirianClass()
    val name = readln()
    u.createNamePlate(name)
    println(u.namePlate)

}

class NibirianClass{
    public var namePlate = ""
    fun createNamePlate(name: String)
    {
        namePlate = "Живи долго и  счастливо, $name"
    }
}

/*
За Ваши заслуги, благодарные нибируниане решили во всех
своих новых классах повесить хвалебные таблички. Однако,
таблички они делают также успешно, как и классы. Помогите им,
создав класс NibirunianClass. Класс должен иметь публичное свойство
namePlate : String. Кроме того, класс должен реализовывать метод
createNamePlate (name : String), который помещает в поле namePlate
строку "Живи долго и счастливо, <name>", где <name>  - аргумент name метода createNamePlate.
 */