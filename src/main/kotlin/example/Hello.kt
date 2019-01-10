package example


fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6)
    listDemo(list)
    sequenceDemo(list.asSequence())
}

private fun listDemo(list: List<Int>) {
    println("---------------- listDemo --------------")
    val result = list.mapIndexed { index, item ->
        println("($index) In Map $item")
        item * 2
    }.filter {
        println("In Filter $it")
        it % 3 == 0
    }
    println(result.first())
}

private fun sequenceDemo(sequence: Sequence<Int>) {
    println("---------------- sequenceDemo --------------")
    val result = sequence.mapIndexed { index, item ->
        println("($index) In Map $item")
        item * 2
    }.filter {
        println("In Filter $it")
        it % 3 == 0
    }
    println(result.first())
}
