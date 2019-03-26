import java.util.HashMap;
public class HashPunto2
{
    public static void main(String[] args) {
        // Create a HashMap object 
        HashMap<String, String> paisEmpresa = new HashMap<String, String>();
        // Add keys and values
        paisEmpresa.put("Google", "Estados Unidos");
        paisEmpresa.put("La locura", "Colombia");
        paisEmpresa.put("Nokia", "Finlandia");
        paisEmpresa.put("Sony", "Japón");
        System.out.println(paisEmpresa); 
    }
}
