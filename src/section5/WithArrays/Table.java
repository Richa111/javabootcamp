package section5.WithArrays;

public class Table {
    public static void main(String[] args) {
        int [][] table ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i=0 ; i<table.length; i++){
            System.out.println(table[0][1]);
        }
    }

}
