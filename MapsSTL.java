import java.util.HashMap;
class MapsSTL
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav",25);
        map.put("Abhinav", 35);
        map.put("vivek", 17);
        map.put("deepika", 19);
        for(String key : map.keySet())
        {
            System.out.println(key+ " "+map.get(key));
        }
        System.out.println(map+ " "+map.size());
        System.out.println(map.containsKey("vivek"));
        System.out.println(map.remove("vivek"));
        System.out.println(map+" "+map.size());
        System.out.println(map.get("Raghav"));
        map.put("deepika", 20);
        System.out.println(map+ " "+map.size());
        System.out.println(map.containsKey("vivek"));
    }
}