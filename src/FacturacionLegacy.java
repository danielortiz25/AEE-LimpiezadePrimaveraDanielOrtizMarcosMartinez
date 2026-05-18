/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */
public class FacturacionLegacy {

    // Método a refactorizar
    public double calcularTotal(double importeBase, int tC, boolean dV) {
        if (importeBase > 0) {
            if (tC == 1) {
                if (dV == true)
                    return importeBase - (importeBase * 0.25);
                else
                    return importeBase - (importeBase * 0.15);
            } else {
                if (tC == 2) {
                    return importeBase - (importeBase * 0.05);
                } else {
                    return importeBase;
                }
            }
        } else {
            return 0;
        }
    }
}