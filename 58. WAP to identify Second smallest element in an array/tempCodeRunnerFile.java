static int findSecondSmallest(int[] arr) {
        int secondSmall=Integer.MAX_VALUE;
        int firstSmall=arr[0];
        for(int i=0;i<arr.length;i++){
            firstSmall=Math.min(firstSmall,arr[i]);
            if(arr[i]>firstSmall){
                secondSmall=Math.min(secondSmall,arr[i]);
            }
        }
        return secondSmall;
    }