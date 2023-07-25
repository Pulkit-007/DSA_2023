package Lec_27;

public class Queen_Permutation {
    public static void main(String[] args) {
        int n=4;//boxes
        int tq=2;
        boolean [] board=new boolean[n]; //ek array le liya queen bethi hai ya nhi check karne ke liye by default false
        Permutation(board,tq,0,"");

    }
    public static void Permutation(boolean [] board,int tq,int qpsf,String ans)
    {
        if(tq==qpsf)
        {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if(board[i]==false)
            {
                board[i]=true;
                Permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
                board[i]=false;//undo
            }

        }

    }
}
