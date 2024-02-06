class ReverseString{
    public void reverseString(char[] str){
        // 2 pointers approach used.
        int left = 0 , right = str.length-1;    
        while (left < right) {
            // Swapping the letters of the String
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
    }
}