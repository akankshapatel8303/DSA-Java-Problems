public class Tut03_Operations {
    //  get ith bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n&bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    // set ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    // clear ith bit 
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }

    // update ith bit 
    public static int updateIthBit(int n, int i, int newBit){
        // n = clearIthBit(n,i);
        // int bitMask = newBit<<i;
        // return n|bitMask;

        if(newBit==0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }

    public static int clearLastIBit(int n, int i){
        int bitMask = ~0<<i;
        return n&bitMask;
    }

    public static int clearRangeOfBit(int n, int i, int j){
        int a = ~0<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n&bitMask;
    }

    // count set bits in a number 
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    // Fast exponential 
    public static void fastExponential(int n, int a){
        int ans = 1;
        while(n>0){
            if((n&1) != 0){
                ans = ans*a;
            }
            a = a*a;
            n = n>>1;
        }
        System.out.println(ans);
    }

    // check the number is a power of 2 or not 
    public static void powerOfTwo(int n){
        if((n&(n-1)) == 0){
            System.out.println(n + " is the power of 2");
        }else{
            System.out.println(n+" is not the power of 2");
        }
    }
    public static void main(String args[]){
        System.out.println(getIthBit(10, 2));
        System.out.println(setIthBit(8, 2));
        System.out.println(clearIthBit(10, 2));
        System.out.println(clearLastIBit(11, 2));
        System.out.println(updateIthBit(8, 2, 1));
        System.out.println(clearRangeOfBit(94, 2, 7));
        System.out.println(countSetBit(15));
        powerOfTwo(8);
        fastExponential(2, 2);
    }
}
