import java.util.Scanner;
public class binarySearch
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array: ");
        int n = scan.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();
        System.out.println("Enter the element to be searched: ");
        int k = scan.nextInt();
        int result = Search(arr, 0, n-1, k);
        scan.close();
        if(result==-1)
            System.out.println("Element not found");
        else
            System.out.printf("The element %d is found at index %d",k,result);
    }
    static int  Search(int arr[],int first,int last,int key)
    {
            
            while(first<=last)
            {
                    int mid = (first+last)/2;
                    if(arr[mid]==key)
                        return mid;
                    else if(arr[mid]<key)
                        first=mid+1;
                    else 
                        last=mid-1;
            }
            return -1;
    }
}
