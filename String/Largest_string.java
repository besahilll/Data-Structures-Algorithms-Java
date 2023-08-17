class Largest_String{
    public static void main(String[] args){
        String names[]={"Sahil","Siddhant","Palli"};

        String largest=names[0];
        for(int i=1;i<names.length;i++){  
            if(largest.compareTo(names[i])<0){   //lexographically
                largest=names[i];
            }

        }
        System.out.println("So the largest string in lexographic order is "+largest);
    }
}
