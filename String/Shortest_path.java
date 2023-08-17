class Shortest_path{

    public static double shortest_path(String str){
        int x=0,y=0;   //directions
        for(int i=0;i<str.length();i++){     
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
             else if(str.charAt(i)=='S'){
                x--;
            }
        }
        return (float) Math.sqrt(x*x+y*y);
    }

    public static void main(String args[]){
        String str="WNEENESENNN";       //path
        System.out.println(shortest_path(str));
    }
}
