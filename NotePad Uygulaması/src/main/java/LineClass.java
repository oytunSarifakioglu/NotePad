
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Oytun
 */
public class LineClass { //iteratör pattern ı kullanıldı

    private ArrayList<String> Lines; //
    private String temp;

    LineClass(ArrayList<String> arrList) { 
        this.Lines = arrList;
    }

    public void add(String s) {
        Lines.add(s);
    }

    public void search(String searchWordString, String changeWordString, Boolean aBoolean) {
        Iterator iWords = Lines.iterator();
        ArrayList<Integer> countersArrayList = new ArrayList<>();
        ArrayList<String> tempArrayList = new ArrayList<>();
        int counter = 0;
        while (iWords.hasNext()) { //iteratör yardımı ile dolaşma
            temp = iWords.next().toString();
            if (temp.contains(searchWordString)) {
                if (aBoolean) { //checkbox kontrolü
                    countersArrayList.add(counter); //index numaralarını kaydeden bir liste
                    tempArrayList.add(temp.replace(searchWordString, changeWordString)); //bulduğu satırda değeri değiştiriyor ve listeye ekliyor. 
                    

                } else {
                    System.out.println(temp);
                }
            }
            counter++; //index numarasını bulabilmek için
            
        }
        for (int i = 0; i < countersArrayList.size(); i++) {
            Lines.set(countersArrayList.get(i), tempArrayList.get(i));
        }

    }

    public String get() { // en son değeri textpanel e yazabilmek için string haline getirmek gerekiyor
        StringBuilder sb = new StringBuilder();
        for (String s : Lines) {
            sb.append(s);
            sb.append("\r\n");
        }
        return sb.toString();
    }

}
