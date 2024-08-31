import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*



private var currentPasswordHash: Int = 0
private val p = 131
private val M = 109 + 7

fun setPassword(password: String) {
    currentPasswordHash = hash(password)
}

fun authorize(x: Int): Int {
    if (x == currentPasswordHash) return 1
    for (c in 'a'..'z') {
        if (x == hash(currentPasswordHash.toString() + c)) return 1
    }
    return 0
}

private fun hash(s: String): Int {
    var hashValue = 0
    for (i in s.indices) {
        hashValue = (hashValue * p + s[i].toInt()) % M
    }
    return hashValue
}

