package programs.pattern;

//*
//**
//***
//****

public class p2_LeftStar {
    public static void main(String[] args) {
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
