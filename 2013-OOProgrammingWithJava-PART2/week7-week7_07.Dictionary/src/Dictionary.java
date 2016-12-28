
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shane Yankam Shaneyankam.com Samyyankam@gmail.com
 */
public class Dictionary {

    private HashMap<String, String> dic;

    public Dictionary() {

        this.dic = new HashMap<String, String>();
    }

    public String translate(String word) {

        if (dic.containsKey(word)) {

            return dic.get(word);
        } else {
            return null;
        }

    }

    public void add(String word, String translation) {

        if (!word.isEmpty()) {
            dic.put(word, translation);
        }
    }

    public int amountOfWords() {

        return dic.size();
    }

    public ArrayList<String> translationList() {

        ArrayList<String> key = new ArrayList<String>(this.dic.keySet());
  

        ArrayList<String> vals = new ArrayList<String>(this.dic.values());

        ArrayList<String> ans = new ArrayList<String>();

        for (int i = 0; i < key.size(); i++) {

            String x = "" + key.get(i) + " = " + vals.get(i);
            ans.add(i, x);
        }

        return ans;

        
            /*Alternative
    wordPairs.put("monkey", "animal");
    wordPairs.put("South", "compass point");
    wordPairs.put("sauerkraut", "food");

    for ( String key : wordPairs.keySet() ) {
        System.out.print( key + " " );
    }  */
    }

}
