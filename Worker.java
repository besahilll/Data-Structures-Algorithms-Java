import java.util.*;
class Work{
    public static void main(String [] args){


        System.out.println("Sahil Bathla,500091837");

        DailyWorker worker1 = new DailyWorker();
        SalariedWorker worker2 = new SalariedWorker();

        worker1.setData();
        System.out.println("Worker one pay : " + worker1.ComPay()+"\n--------");
        worker2.setData();
        System.out.println("Worker two pay : " + worker2.ComPay()+"\n--------");

    
    }
}

class Worker{

    Double hours;
    Double pay_per_hr;
    Scanner input = new Scanner(System.in);

    public double  ComPay(){
        return hours*pay_per_hr;
    }

    public void sethr(){
        System.out.print("how much hrs do you work : ");
        hours = input.nextDouble(); 
    
    }

    public void setpayperhr(){
        System.out.print("How much pay per hr : ");
        pay_per_hr = input.nextDouble();
    }

}


class DailyWorker extends Worker{
   
    public void setData(){
       sethr();
       setpayperhr(); 
    }

}



class SalariedWorker extends Worker {
    public void setData(){
        hours = 40.0;
        setpayperhr();
    }
}

