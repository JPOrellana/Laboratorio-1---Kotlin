/**
 * @author Pablo Orellana
 */
public class ItemDataJ {
    private Object originalValue;

    public ItemDataJ(Object originalValue) {
        this.originalValue = originalValue;
    }


    /**
     * Función que se encarga de hacer los instanceof para identificar
     * el tipo de variable que se ingresa.
     * @return Mensaje dependiendo la cadena ingresada.
     */

    public String getType() {
        if (originalValue instanceof String) {
            return "cadena";
        } else if (originalValue instanceof Integer) {
            return "entero";
        } else if (originalValue instanceof Boolean) {
            return "booleano";
        } else {
            return null;
        }
    }

    /**
     * Función getInfo tiene el apartado para ingresar Int o String o boolean
     */
    public String getInfo() {

        /**
         * En caso ser String
         * @return L concatenado con la cantidad de letras en la cadena
         */
        if (originalValue instanceof String) {
            String strValue = (String) originalValue;
            return "L" + strValue.length();


        /**
         * En caso ser un Entero
         * @return M concatenado a su multiplo ya sea 10, 5 o 2
         * @return Null en caso no sea multiplo de ninguno
         */
        } else if (originalValue instanceof Integer) {
            int intValue = (Integer) originalValue;
            if (intValue % 10 == 0) {
                return "M10";
            } else if (intValue % 5 == 0) {
                return "M5";
            } else if (intValue % 2 == 0) {
                return "M2";
            } else {
                return null;
            }


        /**
         * En caso sea un dato boolean
         * @return Verdadero si es true y Falso si es false
         * @return null e caso no sea ninguno
         */
        } else if (originalValue instanceof Boolean) {
            boolean boolValue = (Boolean) originalValue;
            if (boolValue) {
                return "Verdadero";
            } else {
                return "Falso";
            }
        } else {
            return null;
        }
    }
}

