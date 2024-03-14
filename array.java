class array{
    static void binarySearch(int[] arr, int value){
        int l=0;
        int h=arr.length-1;
        int flag=0;
        for(int i=0; i<arr.length; i++){
            int mid=(h+l)/2;
            if(arr[mid]==value){
                flag=1;
                break;
            }else if(arr[mid]>value){
                h=mid-1;
        }else {
            l=mid+1;
        }
    }  if(flag==1){
        System.out.println("Element is present");
    }else{
        System.out.println("element is not present");
    }
}
    public static void main(String[] args) {
        int[] arra={44,1,5,2,5,7,44};
        binarySearch(arra, 5);
    }
}