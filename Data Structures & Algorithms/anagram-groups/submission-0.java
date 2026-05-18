
class Solution {

    public String getSortedString(String str) {

        char[] ch = str.toCharArray();

        Arrays.sort(ch);

        return new String(ch);
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hm = new HashMap<>();

        for (String str : strs) {

            String sorted = getSortedString(str);

            if (!hm.containsKey(sorted)) {

                hm.put(sorted, new ArrayList<>());
            }

            hm.get(sorted).add(str);
        }

        List<String> keys = new ArrayList<>(hm.keySet());

        keys.sort((a, b) -> hm.get(b).size() - hm.get(a).size());

        List<List<String>> ans = new ArrayList<>();

        for (String key : keys) {

            ans.add(hm.get(key));
        }

        return ans;
    }
}