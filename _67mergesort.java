public class _67mergesort {
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergesort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);
    }
    // method to merge the array
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]=new int[ei-si+1];
        int i = si; // right array's 0
        int j = mid+1; // left array's 0
        int k = 0; // temp's 0 address
        while(i <= mid && j <= ei){
            if(arr[i]<arr[j]){
                temp[k]= arr[i];
                i++; 
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        // for left over elements of first sorted part
        while(i<= mid){
            temp[k++]= arr[i++];
        }
        //for left over elements of second sorted part 
        while(j<= ei){
            temp[k++]= arr[j++];
        }
        for(k=0, i=si; k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[]= {6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        printarr(arr);
    }
}