package programs.pattern;
//*
//**
//***
//****
//***
//**
//*

public class p4_P2andp3 {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=4; i++){
            for(int j=3; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
