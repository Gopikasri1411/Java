public class Sqrt {
    int[] arr;
    int[] blocks;
    int sqrt;
    public Sqrt(int[] arr){
        this.arr=arr;
        int n=arr.length;
        sqrt=(int)Math.sqrt(n);
        blocks=new int[sqrt+1];
        int index=-1;
        for(int i=0;i<n;i++){
            if(i%sqrt==0){
                index++;
            }
            blocks[index]+=arr[i];
        }
        System.out.println("this is the block array : "+Arrays.toString(blocks));
    }
    public void addrange(int[] arr,int st,int end){
        int ans=0;
        //left range
        while(st%sqrt !=0 && st!=0 && st<end ){
            ans+=arr[st++];
        }

        //mid
        while(st+sqrt<=end){
            ans+=blocks[st/sqrt];
            st+=sqrt;
        }

        //end
        while(st<=end){
            ans+=arr[st++];
        }
        System.out.println(ans);
    }

    public void update(int[] arr,int index,int val){
        blocks[index/sqrt]+=(val-arr[index]);
        arr[index]=val;
    }

    public static void main(String[] args) {
        int[] arr={1,3,5,2,7,6,3,1,4,8};
        Sqrt add=new Sqrt(arr);
        add.addrange(arr,2,7);
    }

}
