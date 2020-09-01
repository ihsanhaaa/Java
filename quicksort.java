public class quicksort {
       
        static void quicksort (int a[], int lo, int hi){
        //  lo adalah index bawah, hi adalah index atas
        //  dari bagian array yang akan di urutkan
            int i=lo, j=hi, h;
            int pivot=a[lo];
    
        //  pembagian
            do{
                while (a[i]<pivot) i++;
                while (a[j]>pivot) j--;
                if (i<=j)
                {
                    h=a[i]; a[i]=a[j]; a[j]=h;//tukar
                    i++; j--;
                }
            } while (i<=j);
    
        //  pengurutan
            if (lo<j) quicksort(a, lo, j);
            if (i<hi) quicksort(a, i, hi);
        }
    
        
        public static void main(String[] args) {
            int tabInt[]={9,4,2,7,10,1,5};
            int i,n=7;
            System.out.print("data sebelum di urutkan\n");
    
                for(i=0;i<n;i++){
                    System.out.print(tabInt[i]+ "  ,");
               }
                System.out.print("\n");
            quicksort(tabInt,0,n-1);
                    System.out.print("\nsetelah di urutkan dengan quick sort\n");
    
            for(i=0;i<n;i++){
                System.out.print(tabInt[i]+" , ");
            }
    
        }
    
    }