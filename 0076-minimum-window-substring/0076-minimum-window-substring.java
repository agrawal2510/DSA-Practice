class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character , Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;
        int count = t.length();
        for(int k= 0 ; k<t.length();k++){
            map.put(t.charAt(k),map.getOrDefault(t.charAt(k),0)+1);

        }
        while(j<s.length()){
            if(map.containsKey(s.charAt(j))){
                if(map.get(s.charAt(j))>0){
                    count--;
                }
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
            }
            while(count == 0){
                if(j-i+1 < min){
                    min = j-i+1;
                    start = i;
                }
                

                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                    if(map.get(s.charAt(i))>0){
                        count++;

                    }
                
                }i++;
            }
            j++;
            
        }
        if(min == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+min);

    }
}