import java.util.List;
//*@param 
// @return
//  */

public class ProcesadorUsuarios {
        private static final int NUMERO_INVITADO = 2;
    private static final int NUMER_ADMINISTRADOR = 1;

    // Método con 'code smells': largo, números mágicos, malos nombres.
    public String procesarLista(List<String> dataList) {
        String admins = "";
        String invitados = "";
        

        for (String usuarios : dataList) {
            String[] rol = usuarios.split(":"); // Formato "nombre:rol"
            if (rol.length == 2) {
                String nombre = rol[0];
                int r = Integer.parseInt(rol[1]);

                // Número Mágico: 1 es Admin
                if (r == NUMER_ADMINISTRADOR) {
                    admins += nombre + ",";
                }
                // Número Mágico: 2 es Invitado
                else if (r == NUMERO_INVITADO) {
                    invitados += nombre + ",";
                }
            }
        }
        return "Admins: " + admins + " | Invitados: " + invitados;
    }
}
