//package main.java;
//
//import org.w3c.dom.Node;
//
//import java.io.*;
//import java.util.*;
//
//public class main {
//
//
//    public static void main(String[] args) throws IOException {
//        byte[] inputs = {6, 8, 7, 8, 2};
//
//
//        OutputStream file = new FileOutputStream("class.txt");
//        OutputStream file1 = new FileOutputStream("class2.txt");
//
//        for (int i = 0; i < inputs.length; i++) {
//            file.write(Integer.valueOf(inputs[i]).toString().getBytes());
//        }
//
//        for (int i = 0; i < inputs.length; i++) {
//            file1.write(Integer.valueOf(inputs[i]).toString().getBytes());
//        }
//
////        file.write("\n".getBytes());
////        file.write("Hey, there!".getBytes());
////        file.write("\n".getBytes());
////        file.write("How are you doing?".getBytes());// writes the bytes
//
////        InputStream list = new FileInputStream("class.txt");
////        int size = list.available();
////
////        for(int i = 0; i < size; i++) {
////            System.out.print((char)list.read() + ",");
////           }
////        InputStream list = new FileInputStream("class.txt");
////       int death;
////       while((death = list.read()) != -1){
////           System.out.print((char)death + ",");
////        }
////
////        ArrayList<String> list = new ArrayList<>();
////        list.add("abia");
////        list.add("lagos");
////        list.add("bayelsa");
////        list.add("ogun");
////        System.out.println("before sorting");
////        System.out.println(list);
////        Collections.sort(list, Collections.reverseOrder());
////        System.out.println("after sorting and reverse");
////        System.out.println(list);
//        get();
//    }
//
//    public static void get() {
//        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
//        map.put(1, "Table");
//        map.put(3, "Chairs");
//        map.put(2, "fans");
//        map.put(4, "books");
//        map.put(5, "basket");
//        System.out.println("After Sorting :\n");
//        Map<Integer, String> lmap = new TreeMap<>(map);
//        for (Integer sKey : lmap.keySet()) {
//            System.out.println("Key -> " + sKey
//                    + ":  Value -> "
//                    + map.get(sKey));
//        }
//////        public static void fetchMth() {
//////            ArrayList<String> list = new ArrayList<>();
//////            list.add("abia");
//////            list.add("lagos");
//////            list.add("bayelsa");
//////            list.add("ogun");
//////
//////            System.out.println(list);
//////        }
////    }
////        //Sort keys in reverse order
////        TreeMap<Integer, String> pairs = new TreeMap<>(Collections.reverseOrder());
////
////        pairs.put(2,  "B" );
////        pairs.put(1,  "A");
////        pairs.put(3,  "C");
////
////        System.out.println(pairs);
//    }
//Node<String> foo = new Node("Prosper", null);
//Node<String> lee = new Node("Amalaha", foo);
//System.out.println(lee.getNext().getData());
//System.out.println(foo.getData());
//
//}
//private T data;
//private Node next;
//
//public Node (T d, Node<String> nx){
//    data = d;
//    next nx;
//}
//
//    String regexu = "\\b[uU]\\b";
//    String regexyou = "\\b[yY][oO][uU][uU]*\\b";
//    String replacement = "your sister";
//    input = input.replaceAll(regexu, replacement).replaceAll(regexyou, replacement);
//            return input;




