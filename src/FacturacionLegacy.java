/**
 * Clase Legacy del sistema de facturación.
 * ADVERTENCIA: Código con alta deuda técnica. No modificar la firma del método.
 */
public class FacturacionLegacy {

    // Método a refactorizar
    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
        if (importeBase > 0) {
            if (tipoCliente == 1) {
                if (esSocioVip == true)
                    return importeBase - (importeBase * 0.25);
                else
                    return importeBase - (importeBase * 0.15);
            } else {
                if (tipoCliente == 2) {
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