package container_with_most_water;

public class Solution {
    public static void main(String[] args) {
        int[] need = new int[128];
        String t="ABCDEF";
        // ASCII letters/digits/symbols
        for (char c : t.toCharArray()) {
            need[c]++;
            System.out.println(need[c]++);}
    }
}
