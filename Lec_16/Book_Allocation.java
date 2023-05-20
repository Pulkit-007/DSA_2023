package Lec_16;

public class Book_Allocation {
    public static void main(String[] args) {
        int [ ] page={10,20,30,40};
        int nos=2;   //number of student
        System.out.println(MinPage(page,nos));


    }
    public static int MinPage(int [] page,int nos)
    {
        int lo=0;
        int hi=0;
        for (int i = 0; i < page.length; i++) {
            hi+=page[i];
            
        }
        int ans=0;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(isitPossible(page,nos,mid)==true)
            {
                ans=mid;
                hi=mid-1;
            }
            else
            {
                lo=mid+1;
            }

        }
        return ans;
    }
    private static boolean isitPossible(int [] page,int nos,int mid)
    {
        int readpage = 0;
        int student = 1;
        for (int i = 0; i < page.length; i++) {
            if (readpage + page[i] <= mid) {
                readpage += page[i];
            } else {
                student++;
                readpage = page[i];
            }
            if (student > nos) {
                return false;
            }
        }

        return true;
    }
}
