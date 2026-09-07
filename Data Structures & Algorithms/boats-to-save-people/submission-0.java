class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int lp = 0, rp = people.length-1;
        int minBoats = 0;

        while(lp <= rp) {
            if(people[lp] + people[rp] <= limit) {
                lp++;
                rp--;
            } else {
                rp--;
            }

            minBoats++;
        }

        return minBoats;
    }
}