import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class four {
    public static void main(String[] args){
        String A1="A1",A2="A2",A3="A3",A4="A4",B1="B1",B2="B2",B3="B3",B4="B4",C1="C1",C2="C2",C3="C3",C4="C4",D1="D1",D2="D2",D3="D3",D4="D4";
        System.out.println("extended tic tac toe - computer is Q, you are X");
        System.out.println(A1+" | "+A2+"| "+A3+"| "+A4+"\n---|---|---|---\n"+B1+" | "+B2+"| "+B3+"| "+B4+"\n---|---|---|---\n"+C1+" | "+C2+"| "+C3+"| "+C4+"\n---|---|---|---\n"+D1+" | "+D2+"| "+D3+"| "+D4+"\n");
        Scanner obj=null;
        ArrayList<Integer> comp = new ArrayList<Integer>();
        for (int i=0;i<=8;i++){
            obj=new Scanner(System.in);
            System.out.println("(type the position) Your turn: ");
            String user=obj.nextLine();
            if (user.equals(A1)){
                A1=" X";
                comp.add(1);
            }
            if (user.equals(A2)){
                A2=" X";
                comp.add(2);
            }
            if (user.equals(A3)){
                A3=" X";
                comp.add(3);
            }
            if (user.equals(A4)){
                A4=" X";
                comp.add(4);
            }
            if (user.equals(B1)){
                B1=" X";
                comp.add(5);
            }
            if (user.equals(B2)){
                B2=" X";
                comp.add(6);
            }
            if (user.equals(B3)){
                B3=" X";
                comp.add(7);
            }
            if (user.equals(B4)){
                B4=" X";
                comp.add(8);
            }
            if (user.equals(C1)){
                C1=" X";
                comp.add(9);
            }
            if (user.equals(C2)){
                C2=" X";
                comp.add(10);
            }
            if (user.equals(C3)){
                C3=" X";
                comp.add(11);
            }
            if (user.equals(C4)){
                C4=" X";
                comp.add(12);
            }
            if (user.equals(D1)){
                D1=" X";
                comp.add(13);
            }
            if (user.equals(D2)){
                D2=" X";
                comp.add(14);
            }
            if (user.equals(D3)){
                D3=" X";
                comp.add(15);
            }
            if (user.equals(D4)){
                D4=" X";
                comp.add(16);
            }
            System.out.println(A1+" | "+A2+"| "+A3+"| "+A4+"\n---|---|---|---\n"+B1+" | "+B2+"| "+B3+"| "+B4+"\n---|---|---|---\n"+C1+" | "+C2+"| "+C3+"| "+C4+"\n---|---|---|---\n"+D1+" | "+D2+"| "+D3+"| "+D4+"\n");
            obj=null;
            Random rand = new Random();
            int num = rand.nextInt(16);
            num+=1;
            if(comp.contains(num)){
                num = rand.nextInt(16);
                num+=1;
                if(comp.contains(num)){
                    num = rand.nextInt(16);
                    num+=1;
                }
            }
            else{
                comp.add(num);
                if (num==1&&A1=="A1"){
                    A1=" Q";
                }
                if (num==2&&A2=="A2"){
                    A2=" Q";
                }
                if (num==3&&A3=="A3"){
                    A3=" Q";
                }
                if (num==4&&A4=="A4"){
                    A4=" Q";
                }
                if (num==5&&B1=="B1"){
                    B1=" Q";
                }
                if (num==6&&B2=="B2"){
                    B2=" Q";
                }
                if (num==7&&B3=="B3"){
                    B3=" Q";
                }
                if (num==8&&B4=="B4"){
                    B4=" Q";
                }
                if (num==9&&C1=="C1"){
                    C1=" Q";
                }
                if (num==10&&C2=="C2"){
                    C2=" Q";
                }
                if (num==11&&C3=="C3"){
                    C3=" Q";
                }
                if (num==12&&C4=="C4"){
                    C4=" Q";
                }
                if (num==13&&D1=="D1"){
                    D1=" Q";
                }
                if (num==14&&D2=="D2"){
                    D2=" Q";
                }
                if (num==15&&D3=="D3"){
                    D3=" Q";
                }
                if (num==16&&D4=="D4"){
                    D4=" Q";
                }
            }
            
            System.out.println(A1+" | "+A2+"| "+A3+"| "+A4+"\n---|---|---|---\n"+B1+" | "+B2+"| "+B3+"| "+B4+"\n---|---|---|---\n"+C1+" | "+C2+"| "+C3+"| "+C4+"\n---|---|---|---\n"+D1+" | "+D2+"| "+D3+"| "+D4+"\n");
            if (A1==" X"&&A2==" X"&&A3==" X"&&A4==" X"){
                System.out.println("YOU WIN");
            }
            if (A1==" Q"&&A2==" Q"&&A3==" Q"&&A4==" Q"){
                System.out.println("COMP WIN");
            }
            if (B1==" X"&&B2==" X"&&B3==" X"&&B4==" X"){
                System.out.println("YOU WIN");
            }
            if (B1==" Q"&&B2==" Q"&&B3==" Q"&&B4==" Q"){
                System.out.println("COMP WIN");
            }
            if (C1==" X"&&C2==" X"&&C3==" X"&&C4==" X"){
                System.out.println("YOU WIN");
            }
            if (C1==" Q"&&C2==" Q"&&C3==" Q"&&C4==" Q"){
                System.out.println("COMP WIN");
            }
            if (D1==" X"&&D2==" X"&&D3==" X"&&D4==" X"){
                System.out.println("YOU WIN");
            }
            if (D1==" Q"&&D2==" Q"&&D3==" Q"&&D4==" Q"){
                System.out.println("COMP WIN");
            }
            if (A1==" X"&&B1==" X"&&C1==" X"&&D1==" X"){
                System.out.println("YOU WIN");
            }
            if (A1==" Q"&&B1==" Q"&&C1==" Q"&&D1==" Q"){
                System.out.println("COMP WIN");
            }
            if (A2==" X"&&B2==" X"&&C2==" X"&&D2==" X"){
                System.out.println("YOU WIN");
            }
            if (A2==" Q"&&B2==" Q"&&C2==" Q"&&D2==" Q"){
                System.out.println("COMP WIN");
            }
            if (A3==" X"&&B3==" X"&&C3==" X"&&D3==" X"){
                System.out.println("YOU WIN");
            }
            if (A3==" Q"&&B3==" Q"&&C3==" Q"&&D3==" Q"){
                System.out.println("COMP WIN");
            }
            if (A4==" X"&&B4==" X"&&C4==" X"&&D4==" X"){
                System.out.println("YOU WIN");
            }
            if (A4==" Q"&&B4==" Q"&&C4==" Q"&&D4==" Q"){
                System.out.println("COMP WIN");
            }
            if (A1==" X"&&B2==" X"&&C3==" X"&&D4==" X"){
                System.out.println("YOU WIN");
            }
            if (A1==" Q"&&B2==" Q"&&C3==" Q"&&D4==" Q"){
                System.out.println("COMP WIN");
            }
            if (A4==" X"&&B3==" X"&&C2==" X"&&D1==" X"){
                System.out.println("YOU WIN");
            }
            if (A4==" Q"&&B3==" Q"&&C2==" Q"&&D1==" Q"){
                System.out.println("COMP WIN");
            }
            rand=null;
        }
    }
}