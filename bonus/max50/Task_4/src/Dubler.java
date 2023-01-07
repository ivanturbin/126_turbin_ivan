
public class Dubler {
    public int[] doubling(int[]a){
        int g = 0;
        int[] newa = new int[a.length*2];
        for(int i = 0; i<a.length;i++){
            newa[g] = a[i];
            g++;
            newa[g] = a[i];
            g++;
        }
        return newa;
    }
}

