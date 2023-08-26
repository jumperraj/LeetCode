class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap();
        for(String s : strs)
        {
           char[] arr= s.toCharArray();
           Arrays.sort(arr);
           String str1= new String(arr);
           if(hm.containsKey(str1))
           {
               hm.get(str1).add(s);
           }
           else {
               hm.put(str1,new ArrayList(Arrays.asList(s)));
           }
        }
        // System.out.println(hm);
        List<List<String>> lr = new ArrayList();
        // for(Map.Entry<char[],List<String>> ent: hm.entrySet())
        // {
        //     List<String> l = ent.getValue();
        //     lr.add(l);
        // }
        lr.addAll(hm.values());
        return lr;
    }
}