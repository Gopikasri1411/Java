public static void main(String[] args){
  int[][] arr= {{1, 2,3,4,5},
                      {16,0,0,0,6},
                      {15,0,0,0,7},
                      {14,0,0,0,8},
                     {13,12,11,10,9}};
  musicalchair(arr,3);
}
private static void musicalchair(int[][] arr1,int chairnum){
        int[][] playground=arr1;
        int row=playground.length/2;
        for(int j=1;j<playground.length-1;j++){
            playground[row][j]=j;
        }
        System.out.println("This is the playground");
        for(int[] num:playground){
            System.out.println(Arrays.toString(num));
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the times you want to rotate the players");
//        int r=sc.nextInt();
        int r=1;
        int[][] arr=swapspiral(playground,r);
        System.out.println("The below array is the swapped one");
        for(int[] num:arr){
            System.out.println(Arrays.toString(num));
        }
        System.out.println("for chair number "+chairnum+", lets calculate the distance between each player and the chair");
        finddistance(arr,row,chairnum);

    }

    private static void finddistance(int[][] arr,int row,int chairnum) {
        int[] pos=new int[2];
        int numbers=2*(arr.length+arr[0].length-2);
        for(int i=1;i<=numbers;i++){
            pos=findpos(arr,i);
            boolean[][] b=new boolean[arr.length][arr[0].length];
            for(boolean[] n:b){
                Arrays.fill(n,true);
            }
            ArrayList<Integer> l=maze(b,"",pos[0],pos[1],row,chairnum,0);
            int min=l.get(0);
            for(int j=0;j<l.size();j++){
                if(l.get(j)<min){
                    min=l.get(j);
                }
            }
            System.out.println("the minimum distance between the player "+i+" and the chair "+chairnum+" is:"+min);
        }
    }

    private static int[] findpos(int[][] arr, int i) {
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[0].length;c++){
                if(arr[r][c]==i){
                    return new int[]{r, c};
                }
            }
        }
        return new int[]{0,0};
    }

    private static ArrayList<Integer> maze(boolean[][] arr,String p,int r, int c,int tr,int tc,int counter) {
        if(r==tr&& c==tc){
            ArrayList<Integer> l=new ArrayList<>();
            l.add(counter);
            return l;
        }
        if(!arr[r][c]){
            return new ArrayList<>();
        }
        arr[r][c]=false;
        counter++;
        ArrayList<Integer> ll=new ArrayList<>();
        if(r<arr.length-1){
            ll.addAll(maze(arr,p+"D",r+1,c,tr,tc,counter));

        }
        if(c<arr[0].length-1){
            ll.addAll(maze(arr,p+"R",r,c+1,tr,tc,counter));
        }
        if(c>0){

            ll.addAll(maze(arr,p+"L",r,c-1,tr,tc,counter));

        }
        if(r>0){

            ll.addAll(maze(arr,p+"U",r-1,c,tr,tc,counter));

        }
        arr[r][c]=true;
        return ll;
    }

    private static int[][] actualspiralprinting(int n) {
        int[][] arr=new int[n][n];
        int itr=1;
        int row,col;
        if(n%2==0){
            row=(n/2)-1;
            col=row;
        }else{
            row=n/2;
            col=row;
        }
        int colend=1;
        int rowend=1;
        int rowstart=2;
        int colstart=2;
        arr[row][col]=itr++;
        col++;
        while(true){
            for(int i=1;i<=colend && itr<=n*n;i++){
                arr[row][col]=itr;
                col++;
                itr++;
            }
            row++;
            col--;

            for(int i=1;i<=rowend && itr<=n*n;i++){
                arr[row][col]=itr;
                itr++;
                row++;
            }
            row--;
            col--;

            for(int i=1;i<=rowstart && itr<=n*n;i++){
                arr[row][col]=itr;
                itr++;
                col--;
            }
            col++;
            row--;

            for(int i=1;i<=colstart&& itr<=n*n;i++){
                arr[row][col]=itr;
                itr++;
                row--;
            }
            row++;
            colstart+=2;
            col++;
            rowend+=2;
            rowstart+=2;
            colend+=2;
            if(itr>n*n){
                break;
            }
        }
        return arr;
    }


    private static int[][] swapspiral(int[][] arr,int n) {
        int temp1=0;
        int temp2=0;
        int row=0;
        int col=0;
        int mod=2*((arr.length+arr[0].length)-2);
        n%=mod;
        for(int i=0;i<n;i++){
            for(int j=0;j<arr[0].length;j++){
                temp1=arr[row][col];
                arr[row][col]=temp2;
                temp2=temp1;
                col++;
            }
            row++;
            col=arr[0].length-1;
            for(int j=row;j<arr.length;j++){
                temp1=arr[row][col];
                arr[row][col]=temp2;
                temp2=temp1;
                row++;
            }
            col--;
            row=arr.length-1;
            for(int j=col;j>=0;j--){
                temp1=arr[row][col];
                arr[row][col]=temp2;
                temp2=temp1;
                col--;
            }
            row--;
            col=0;
            for(int j=row;j>=0;j--){
                temp1=arr[row][col];
                arr[row][col]=temp2;
                temp2=temp1;
                row--;
            }
            row=0;
        }
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }

        return arr;
    }
