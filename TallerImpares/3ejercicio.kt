fun main() {
    val sueldo = 1000000
    val comision = 0.10
    val venta1 = 500000
    val venta2 = 100000
    val venta3 = 700000
    val comventa1 = venta1 * comision
    val comventa2 = venta2 * comision
    val comventa3 = venta3 * comision
    val totalcomision = comventa1 + comventa2 + comventa3
    val pagototal = sueldo + totalcomision
    println("el pago total es: $pagototal")
}