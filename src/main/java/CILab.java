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
            *  Only the first letter in this word is capital, like "Google".
            * @return  Given a string word, return true if the usage of capitals in it is right.
            */
    @Override
    public boolean detectCapitalUse() {

        //All letters in the word are capitals

        return false;
    }

}

