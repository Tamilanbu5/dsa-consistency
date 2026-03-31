class RemoveDuplicates{

    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int i=0;
        
        int j=1;
        
        ArrayList<Integer> list=new ArrayList<>();
        
        list.add(arr[i]);
        
        for(j=1;j<arr.length;j++){
            
            if(arr[i]!=arr[j]){
                
                list.add(arr[j]);
                
                i=j;
            }
            
            
        }
        
        return list;
    }
}

