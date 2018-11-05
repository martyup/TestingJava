import java.util.*;
 
public class Sort {
/*{
    public static void main(String[] args) 
    {
        //Unsorted array
        Integer[] a = { 2, 6, 3, 5, 1 };
         
        //Call merge sort
        mergeSort(a);
         
        //Check the output which is sorted array
        System.out.println(Arrays.toString(a));
    }
 
    @SuppressWarnings("rawtypes") 
    public static Comparable[] mergeSort(Comparable[] list) 
    {
        //If list is empty; no need to do anything
        if (list.length <= 1) {
            return list;
        }
         
        //Split the array in half in two parts
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);
         
        //Sort each half recursively
        mergeSort(first);
        mergeSort(second);
         
        //Merge both halves together, overwriting to original array
        merge(first, second, list);
        return list;
    }
     
    @SuppressWarnings({ "rawtypes", "unchecked" }) 
    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) 
    {
        //Index Position in first array - starting with first element
        int iFirst = 0;
         
        //Index Position in second array - starting with first element
        int iSecond = 0;
         
        //Index Position in merged array - starting with first position
        int iMerged = 0;
         
        //Compare elements at iFirst and iSecond, 
        //and move smaller element at iMerged
        while (iFirst < first.length && iSecond < second.length) 
        {
            if (first[iFirst].compareTo(second[iSecond]) < 0) 
            {
                result[iMerged] = first[iFirst];
                iFirst++;
            } 
            else
            {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }
}*/


/**
 * Method to do a merge sort of the passed
 * array of ints
 * @param a the array to sort
 */
public static void mergeSort(int[] a)
{
  // check if there is only 1 element return
  if (a.length == 1) return;
  
  // otherwise create two new arrays
  int[] left = new int[a.length / 2];
  for (int i = 0; i < left.length; i++)
    left[i] = a[i];
  int[] right = new int[a.length - left.length];
  for (int i = left.length, j=0; 
       i < a.length; i++, j++)
    right[j] = a[i];
  
  // do the recursive call with the new sorters
  Sort.mergeSort(left);
  Sort.mergeSort(right);
  
  // merge the resulting arrays
  Sort.merge(a,left,right);

}

/**
 * Method to merge two sorted arrays
 * back into this object's array
 * @param a the original array
 * @param left sorted left array
 * @param right the sorted right array
 */
private static void merge(int[] a, int[] left, 
                          int[] right)
{
  int leftIndex = 0; // current left index
  int rightIndex = 0; // current right index
  int i = 0; // current index in a
  
  // merge the left and right arrays into a
  while (leftIndex < left.length &&
         rightIndex < right.length)
  {
    if (left[leftIndex] < right[rightIndex])
    {
      a[i] = left[leftIndex];
      leftIndex++;
    }
    else
    {
      a[i] = right[rightIndex];
      rightIndex++;
    }
    i++;
  }
  
  // copy any remaining in left
  for (int j = leftIndex; j < left.length; j++)
  {
    a[i] = left[j];
    i++;
  }
  
  // copy any remaining in right
  for (int j = rightIndex; j < right.length; j++)
  {
    a[i] = right[j];
    i++;
  }
}
}