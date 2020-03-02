fun <S : Any> foo(x: Array<out S?>, y: Array<in S?>) {
    val xo = <!DEBUG_INFO_EXPRESSION_TYPE("kotlin.Array<S!!>")!>outA(x)<!>
    val yo = inA(y)

    var <!ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE!>f<!>: Array<S> = xo
    <!UNUSED_VALUE!>f =<!> yo
}


fun <X : Any> outA(<!UNUSED_PARAMETER!>x<!>: Array<out X?>): Array<X> = TODO()
fun <Y : Any> inA(<!UNUSED_PARAMETER!>x<!>: Array<in Y?>): Array<Y> = TODO()