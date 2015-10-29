// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
import java.util.ArrayList

fun box(): String {
    val list1 = ArrayList<Int>()
    val range1 = 8 downTo 3 step 2
    for (i in range1) {
        list1.add(i)
        if (list1.size() > 23) break
    }
    if (list1 != listOf<Int>(8, 6, 4)) {
        return "Wrong elements for 8 downTo 3 step 2: $list1"
    }

    val list2 = ArrayList<Int>()
    val range2 = 8.toByte() downTo 3.toByte() step 2
    for (i in range2) {
        list2.add(i)
        if (list2.size() > 23) break
    }
    if (list2 != listOf<Int>(8, 6, 4)) {
        return "Wrong elements for 8.toByte() downTo 3.toByte() step 2: $list2"
    }

    val list3 = ArrayList<Int>()
    val range3 = 8.toShort() downTo 3.toShort() step 2
    for (i in range3) {
        list3.add(i)
        if (list3.size() > 23) break
    }
    if (list3 != listOf<Int>(8, 6, 4)) {
        return "Wrong elements for 8.toShort() downTo 3.toShort() step 2: $list3"
    }

    val list4 = ArrayList<Long>()
    val range4 = 8.toLong() downTo 3.toLong() step 2.toLong()
    for (i in range4) {
        list4.add(i)
        if (list4.size() > 23) break
    }
    if (list4 != listOf<Long>(8, 6, 4)) {
        return "Wrong elements for 8.toLong() downTo 3.toLong() step 2.toLong(): $list4"
    }

    val list5 = ArrayList<Char>()
    val range5 = 'd' downTo 'a' step 2
    for (i in range5) {
        list5.add(i)
        if (list5.size() > 23) break
    }
    if (list5 != listOf<Char>('d', 'b')) {
        return "Wrong elements for 'd' downTo 'a' step 2: $list5"
    }

    val list6 = ArrayList<Double>()
    val range6 = 5.5 downTo 3.7 step 0.5
    for (i in range6) {
        list6.add(i)
        if (list6.size() > 23) break
    }
    if (list6 != listOf<Double>(5.5, 5.0, 4.5, 4.0)) {
        return "Wrong elements for 5.5 downTo 3.7 step 0.5: $list6"
    }

    val list7 = ArrayList<Float>()
    val range7 = 5.5.toFloat() downTo 3.7.toFloat() step 0.5.toFloat()
    for (i in range7) {
        list7.add(i)
        if (list7.size() > 23) break
    }
    if (list7 != listOf<Float>(5.5.toFloat(), 5.0.toFloat(), 4.5.toFloat(), 4.0.toFloat())) {
        return "Wrong elements for 5.5.toFloat() downTo 3.7.toFloat() step 0.5.toFloat(): $list7"
    }

    return "OK"
}
