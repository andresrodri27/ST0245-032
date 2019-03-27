import java.util.HashMap;
import java.util.Map;

public class Maper
{
    public Maper()
    {
        HashMap<String, Integer> map = new HashMap<>();
        print(map);
        map.put("Esteban", 321);

        System.out.println("Size of map is:- " + map.size());

        print(map);
        if (map.containsKey("Esteban"))
        {
            Integer a = map.get("Esteban");
            System.out.println("value for key \"Esteban\" is:- " + a);
        }

        map.clear();
        print(map);

        addContact(map,"Mauricio",311);
        getContact(map,"Mauricio");

        print(map);
    }

    public void print(Map<String, Integer> map)
    {
        if (map.isEmpty())
        {
            System.out.println("map is empty");
        }

        else
        {
            System.out.println(map);
        }
    }
    public void addContact(HashMap map, String name, int numero)
    {
        map.put(name,numero);
    }
    public void getContact(HashMap map, String name)
    {
        if (map.containsKey(name))
        {
            System.out.println("value for key " + name + " is:- " + map.get(name));
        }
    }
}

