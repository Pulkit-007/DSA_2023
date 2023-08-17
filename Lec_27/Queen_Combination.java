package Lec_27;

public class Queen_Combination {
    public static void main(String[] args) {
        int n=4;//boxes
        int tq=2;
        boolean [] board=new boolean[n];//ek array le liya queen bethi hai ya nhi check karne ke liye by default false
        Combination(board,tq,0,"",0);//ek lenge index hume kaha se bethana hai..

    }
    public static void Combination(boolean [] board,int tq,int qpsf,String ans,int idx)
    {
        if(tq==qpsf)
        {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if(board[i]==false)
            {
                board[i]=true;
                Combination(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
                board[i]=false;//undo
            }

        }

    }
    }
}
