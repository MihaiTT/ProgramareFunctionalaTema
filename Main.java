public class Main {
    //ex1
    interface IOperator {
        int operation(int a, int b);
    }
    //ex2
    interface IVerifyProperty {
        boolean hasProperty(int a);
    }
    public static void main(String[] args){
        IOperator suma=(a,b)->a+b;
        IOperator diferenta=(a,b)->a-b;
        IOperator produs=(a,b)->a*b;
        IOperator modulo=(a,b)->a%b;
        IOperator div=(a,b)->a/b;
        System.out.println("Suma e:  "+suma.operation(4,3));
        //etc
        IVerifyProperty par=i->i%2==0?true:false;
        IVerifyProperty negativ=i->i<0?true:false;
        IVerifyProperty zero=i->i==0?true:false;
        System.out.println("17 este par? "+ par.hasProperty(17));
    }
    }

