// "Replace with 'NewClass<T>'" "true"
package ppp

@Deprecated("renamed", ReplaceWith("NewClass<T>"))
class OldClass<T>

class NewClass<F>

fun foo() {
    <caret>OldClass<Int>()
}
