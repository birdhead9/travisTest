public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {

        if(myString ==null){
            return null;
        }
        return myString;
    }

    @Override
    public void setString(String string) {

        myString = string;
    }
/*
        *  We define the usage of capitals in a word to be right when one of the following cases holds:
            *  All letters in this word are capitals, like "USA".
            *  All letters in this word are not capitals, like "leetcode".

            * @return  Given a string word, return true if the usage of capitals in it is right.
            */
    @Override
    public boolean detectCapitalUse() {

        //first letter is capital
        if (myString.charAt(0) >= 65 && myString.charAt(0) <=90) {
            return true;

        }

            boolean key = false;
        for(int i=0; i < myString.length();i++) {
            //all letters in word is capital
            if (myString.charAt(i) >= 65 && myString.charAt(i) <= 90) {
              key =true;
            }
            //all letters are lower case
            else {
                key= false;
            }
        }

        return key;
    }

}

