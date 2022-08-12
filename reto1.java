public class BecaUniversitaria {
// creamos los atributos de la clase
    int tiempo;
    double interes;
    double monto;
    // creamos el constructor vacio de la clase
    BecaUniversitaria() {
        this.tiempo = 0;
        this.interes = 0;
        this.monto = 0;
    }
// creamos otro constructor si nos pasan los parametro de la clase
    BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;
    }

    // calculamos el interes simple
    public double calcularInteresSimple () {
        double interesSimple = Math.round(this.monto * this.interes / 100 * this.tiempo);
        return interesSimple;
    }
    // calculamos el interes compuesto
    public double calcularInteresCompuesto () {
        double interesCompuesto = Math.round ( this.monto * ( Math.pow ( ( 1 + this.interes / 100), this.tiempo) -1 ));
        return interesCompuesto;
    }
    // comparamos la inversion de interes simple con la inversion de interes compuesto
    public String compararInversion (int pTiempo, double pMonto, double pInteres ){
        this.tiempo = pTiempo;
        this.monto = pMonto;
        this.interes = pInteres;
        double diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple() ;
        if (diferencia != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }  
        // comparamos la imversion de interes simple con la compuesta
    public String compararInversion (){
        double diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple() ;
        if (diferencia != 0) {
            return "La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia;
        } else {
            return "No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.";
        }
    }

}