package leetcode_que.Linked_List;
//https://leetcode.com/problems/design-browser-history?envType=problem-list-v2&envId=linked-list

public class browser_history {
    Node current;
    public BrowserHistory(String homepage) {
        current = new Node(homepage);
    }

    public void visit(String url) {
        Node newnode = new Node(url);
        newnode.back = current;
        current.next = newnode;
        current = newnode;
    }

    public String back(int steps) {
        while(steps != 0){
            if(current.back != null){
                current = current.back;
            }
            else break;
            steps--;
        }
        return current.data;
    }

    public String forward(int steps) {
        while(steps != 0){
            if(current.next != null){
                current = current.next;
            }
            else break;
            steps--;
        }
        return current.data;
    }
}

class Node{
    String data;
    Node next;
    Node back;

    Node(){
        this.data = "0";
        this.next = null;
        this.back = null;
    }

    Node(String data){
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

