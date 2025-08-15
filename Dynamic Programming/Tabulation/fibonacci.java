void func(int n){
  int[] arr=new int[n+1];
  arr[1]=1;
  for(int i=0;i<=n;i++){
    if(i+1<=n){
      arr[i+1]+=arr[i];
    }
    if(i+2<=n){
      arr[i+2]+=arr[i];
    }
  }
System.out.println(arr[n]);
}
