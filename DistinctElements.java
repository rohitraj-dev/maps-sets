import java.util.HashSet;

class DistinctElements
{
    static int DistinctElements(int arr[])
    {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr)
            set.add(ele);
        return set.size();
    }
}