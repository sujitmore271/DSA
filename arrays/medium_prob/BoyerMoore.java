package arrays.medium_prob;
import java.util.HashMap;

public class BoyerMoore {
    public int OptimalmajorityElement(int[] v) {
    int n = v.length;
    int cnt = 0; 
    int el = 0;  
    for (int i = 0; i < n; i++) {
        if (cnt == 0) {
            cnt = 1;
            el = v[i]; 
        } else if (v[i] == el) {
            cnt++; 
        } else {
            cnt--;
        }
    }

   
    int cnt1 = 0;
    for (int i = 0; i < n; i++) {
        if (v[i] == el) cnt1++;
    }

    if (cnt1 > (n / 2)) return el;
    return -1;
}

public int better(int[] v) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int n = v.length;

    for (int i = 0; i < n; i++) {
        if (!map.containsKey(v[i])) {
            map.put(v[i], 1);
        } else {
            map.put(v[i], map.get(v[i]) + 1);
        }
    }

    // Find majority element
    for (int key : map.keySet()) {
        if (map.get(key) > n / 2) {
            return key;
        }
    }

    return -1;
}
    public static void main(String[] args) {
        
    }
}
