class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int []indegree = new int[numCourses];
        List<List<Integer>> edges = new ArrayList<>();
        for(int i=0; i< numCourses; i++ ){
            edges.add(new ArrayList<>());
        }

        for (int[] pre: prerequisites){
            indegree[pre[0]]++;
            edges.get(pre[1]).add(pre[0]);
        }

        ArrayDeque<Integer> q= new ArrayDeque<>();
        for(int i=0; i< numCourses; i++){
            if(indegree[i] == 0){
                q.add(i);
            }
        }

        int finish=0;
        while (!q.isEmpty()){
            int n = q.poll();
            finish ++;
            for(int nei: edges.get(n)){
                indegree[nei]--;
                if(indegree[nei] == 0){
                    q.add(nei);
                }
            }
        }
        return finish == numCourses;
               
    }
}
