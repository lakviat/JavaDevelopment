package Complete_Ones;

import java.util.ArrayList;

class MergeOverlappingIntervals{
    public int first;
    public int second;

    public MergeOverlappingIntervals(int x, int y){
        this.first = x;
        this.second = y;
    }
}

class MergeIntervals{
    static ArrayList<MergeOverlappingIntervals> mergeIntervals(ArrayList<MergeOverlappingIntervals> v) {
        // WRITE YOUR CODE HERE

        if(v == null || v.size() == 0) {
            return null;
        }

        ArrayList<MergeOverlappingIntervals> result = new ArrayList<MergeOverlappingIntervals>();

        result.add(new MergeOverlappingIntervals(v.get(0).first, v.get(0).second));

        for(int i = 1 ; i < v.size(); i++) {
            int x1 = v.get(i).first;
            int y1 = v.get(i).second;
            int x2 = result.get(result.size() - 1).first;
            int y2 = result.get(result.size() - 1).second;

            if(y2 >= x1) {
                result.get(result.size() - 1).second = Math.max(y1, y2);
            } else {
                result.add(new MergeOverlappingIntervals(x1, y1));
            }
        }

        return result;
    }
    public static void main(String[] args) {
        ArrayList<MergeOverlappingIntervals> v = new ArrayList<MergeOverlappingIntervals>();

        v.add(new MergeOverlappingIntervals(1, 5));
        v.add(new MergeOverlappingIntervals(3, 7));
        v.add(new MergeOverlappingIntervals(4, 6));
        v.add(new MergeOverlappingIntervals(6, 8));
        v.add(new MergeOverlappingIntervals(10, 12));
        v.add(new MergeOverlappingIntervals(11, 15));

        ArrayList<MergeOverlappingIntervals> result = mergeIntervals(v);

        for(int i=0; i<result.size(); i++){
            System.out.print(String.format("[%d, %d] ", result.get(i).first, result.get(i).second));
        }
    }
}

/*

Problem Statement
You are given an array (list) of interval pairs as input where each interval has a start and end timestamp.
The input array is sorted by starting timestamps. You are required to merge overlapping intervals and return a new output array.
Consider the input array below. Intervals (1, 5), (3, 7), (4, 6), (6, 8) are overlapping so they should be merged to one big interval
(1, 8). Similarly, intervals (10, 12) and (12, 15) are also overlapping and should be merged to (10, 15).

 */

