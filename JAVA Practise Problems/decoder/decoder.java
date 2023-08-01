package decoder;


class decode{
    public static void main(String args[]){
        String str="19089220514041801";
        StringBuffer decStr=new StringBuffer();
        int a=96;
        char[] strarr=str.toCharArray();
        int len=str.length();
        for(int i=len-1;i>=0;i--){
            int temp=Character.getNumericValue(strarr[i]);
            if(temp==0){
              int  temp2=Character.getNumericValue(strarr[i-1]);
              int  temp3=Character.getNumericValue(strarr[i-2]);
                if(temp3==1){
                    temp=10+temp2;
                }
                else{
                    temp=20+temp2;
                }
                i=i-2;
            }
            int check=temp;
            char letter=(char) (a+check);
            decStr.append(letter);
            
        }
        System.out.print(decStr.reverse());
        
}
}