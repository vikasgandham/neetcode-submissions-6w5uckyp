class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for(int num: nums){
            countMap.putIfAbsent(num, 0);
            countMap.put(num, countMap.get(num)+1);
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0]-b[0]);

        countMap.forEach((key,value) -> {
            minHeap.offer(new int[]{value, key});
            if(minHeap.size() > k){
                minHeap.poll();
            }
        });

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minHeap.poll()[1];
        }
        return res;

        
    }
}
