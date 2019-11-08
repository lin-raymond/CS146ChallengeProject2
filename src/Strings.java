import java.util.ArrayList;

public class Strings
{
    public static String uniqueLetters(String str)
    {
        String updatedStr = "";
        ArrayList<String> lettersFound = new ArrayList<String>();
        ArrayList<String> duplicate = new ArrayList<String>();
        for(int i = 0; i < str.length(); i++)
        {
            String character = String.valueOf(str.charAt(i));
            if(lettersFound.contains(character))
            {
                duplicate.add(character);
            }
            lettersFound.add(character);
        }
        lettersFound.removeAll(duplicate);
        for(String s: lettersFound)
        {
            updatedStr += s;
        }
        return updatedStr;
    }
}