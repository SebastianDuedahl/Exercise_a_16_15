package Chapter_16_a_01;
/*
Write a method called notEquals that accepts a second list as a parameter, returns true if the two lists are not
equal, and returns false otherwise. Two lists are considered unequal if they store the different values in any random
order and do not have the same length.
 */

public class Exercise_15_a
{
    public static void main(String[] args) {
        LinkedIntList list1 = new LinkedIntList();
        LinkedIntList list2 = new LinkedIntList();


        list1.add(5);
        list1.add(9);
        list1.add(4);


        list2.add(9);
        list2.add(5);
        list2.add(4);

        System.out.println(notEquals(list1,list2));
    }

    public static boolean notEquals(LinkedIntList list1, LinkedIntList list2)
    {

        for (int i = 0; i < list1.size() ; i++)
        {
            if(list1.get(i) == list2.get(i))
            {
                if (list1.size() == list2.size())
                {
                    return true;
                }
            }
            else
                {
                return false;
                }
        }
        return false;
    }

}
