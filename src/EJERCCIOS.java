import javax.swing.JOptionPane;

public class EJERCCIOS {

    public static void main(String[] args) {
        
        String salarioMensualStr = JOptionPane.showInputDialog("Ingrese el salario mensual del empleado:");
        String porcentajeRetencionStr = JOptionPane.showInputDialog("Ingrese el porcentaje de retención en la fuente:");

       
        double salarioMensual = Double.parseDouble(salarioMensualStr);
        double porcentajeRetencion = Double.parseDouble(porcentajeRetencionStr);

       
        double[] resultados = calcularSalarioYRetencion(salarioMensual, porcentajeRetencion);
        double salarioAnual = resultados[0];
        double retencionAnual = resultados[1];

    
        JOptionPane.showMessageDialog(null, String.format("Salario Anual: %.2f\nRetención Anual en la Fuente: %.2f", salarioAnual, retencionAnual));
    }

    /**
     * Calcula el salario anual y la retención anual en la fuente de un empleado.
     * 
     * @param salarioMensual     El salario mensual del empleado.
     * @param porcentajeRetencion El porcentaje de retención en la fuente.
     * @return Un arreglo donde el primer elemento es el salario anual y el segundo
     *         es la retención anual.
     */
    public static double[] calcularSalarioYRetencion(double salarioMensual, double porcentajeRetencion) {
        double salarioAnual = salarioMensual * 12;
        double retencionAnual = salarioAnual * (porcentajeRetencion / 100);
        return new double[] { salarioAnual, retencionAnual };
    }
}
