package guerrero.erick.calculadoracetes

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "CalculadoraViewModel"
private const val INTERES = 11.0
private const val MESES_DEL_ANIO = 12.0
class CalculadoraViewModel : ViewModel() {
    var plazo = 3
    var cantidad = 100.0
    val rendimiento:Double
        get() {
            val interes_por_mes = (INTERES/ MESES_DEL_ANIO)/100
            val rendimiento = interes_por_mes*cantidad*plazo
            return cantidad+(rendimiento)
        }
}