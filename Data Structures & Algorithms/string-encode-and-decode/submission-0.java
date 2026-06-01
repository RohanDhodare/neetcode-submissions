class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            int len = s.length();
            sb.append(len).append('#').append(s);
        
        }
        // System.out.println("The sb string is: " + sb);
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < str.length(); ){
            int delimiterIndex = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, delimiterIndex));
            String temp = str.substring(delimiterIndex + 1, delimiterIndex + 1 + len);
            result.add(temp);
            i = delimiterIndex + 1 + len;
        }
        return result;
    }
}
