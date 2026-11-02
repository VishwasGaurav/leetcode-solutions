class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(tickets[i]);
        }
        int count = 0;
        while(q.size()!=0){
            int val = q.poll()-1;
            count++;
            if(val == 0 && k==0){
                return count;
            }
            if(val!=0) q.add(val);

            k--;
            if(k==-1) k = q.size()-1;
        }
        return count;
    }
}