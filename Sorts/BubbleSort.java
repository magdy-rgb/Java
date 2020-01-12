package bubblesprt;
 class ArrBub{
        private double[]a;
        private int nElement;
        private void swap(int one, int two){
            double temp = a[one];
            a[one] = a[two];
            a[two] = temp;
        }
        public ArrBub(int max){
            a= new double[max];
            nElement = 0;
        }
        public void insert(double value){
            a[nElement] = value;
            nElement++;
        }
        public void display(){
            for(int i=0;i<nElement;i++)
                System.out.print(a[i] + " ");
        }
        void BubbleSort(){
            int out ,in;
            for(out = nElement-1;out>1;out--){
                for(in=0;in<nElement;in++){
                    if(a[in]>=a[in+1]){
                        swap(in , in+1);
                    }
            }
        }
        }
 }
      class BubbleSprt {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrBub arr;
        arr =new ArrBub(maxSize);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(10);
        arr.insert(90);
        arr.insert(00);
        arr.display();
        arr.BubbleSort();
        arr.display();
    }
}



