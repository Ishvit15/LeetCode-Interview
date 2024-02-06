class FirstUniqueCharacterInString {
    public int uniqueCharacter(String str) {

        char[] letters = new char[256];
        // Finding the frequency of letters in the sgiven String
        for(char c : str.toCharArray()){
            letters[c - 'a']++;
        }
        //To get the First Unique Character
        for(int i = 0; i < str.length(); i++){
            if(letters[str.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
    
}
