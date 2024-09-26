public class selection {
    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=7;
        a[1]=5;
        a[2]=2;
        a[3]=4;
        a[4]=1;
        
    int min=0;
    for(int i=0;i<5;i++){
        min=i;
        for(int j=i+1;j<5;j++){
            if(a[min]>a[j]){
                min=j;
            }
        }
        int temp=a[min];
        a[min]=a[i];
        a[i]=temp;

    }
    
    for(int i=0;i<5;i++){
        System.out.println(a[i]);
    }
    }
        
}
      