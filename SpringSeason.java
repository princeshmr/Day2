class SpringSeason{
     
     static Boolean isSpring(int d,int m){
            if((d>=20 && m==3 && d<=31) || (d>=1 && m==4 && d<=30) || (d>=1 && m==5 && d<=31) || (d<=20 && m==6))
            {
                return true;
            }
            return false;
     }
     public static void main(String args[]){
             int day=Integer.parseInt(args[0]);
             int month=Integer.parseInt(args[1]);
             boolean res=isSpring(day,month);
             System.out.println(res);
     }

}