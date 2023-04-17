import pack.Node;
import pack.NodeList;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        NodeList<String> nodeList = new NodeList<>();
        nodeList.addFirst("da2");
        nodeList.addFirst("abs");
        nodeList.addFirst("a23sds");
        nodeList.addFirst("asdasDAD3sds");
        nodeList.add(1, "Bob");
        System.out.println();
        System.out.println(nodeList.get(0));
        System.out.println(nodeList.get(1));
        System.out.println(nodeList.get(2));
        System.out.println("===================");
        nodeList.add(3, "Dadadad");
        System.out.println(nodeList.get(3));
        System.out.println("===================");
    }
}
