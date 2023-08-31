class Node{
    Node[] children= new Node[26];
    boolean eof;

}
class Trie {

    Node node;
    public Trie() {
        node =new Node();

    }
    
    public void insert(String word) {
       Node cur= node;
       int ind;
       for(int i=0;i<word.length();i++)
       {
           ind= word.charAt(i)-'a';
           if(cur.children[ind]==null)
                cur.children[ind]=new Node();
            cur=cur.children[ind];
       }
       cur.eof=true;
    }
    
    public boolean search(String word) {
        Node cur= node;
        int ind;
       for(int i=0;i<word.length();i++)
        {
             ind= word.charAt(i)-'a';
            if(cur.children[ind]==null)
                return false;
            cur=cur.children[ind];
        }
        return cur.eof;
    }
    
    public boolean startsWith(String prefix) {
        Node  cur= node;
        int ind;
        for(int i=0;i<prefix.length();i++)
        { ind= prefix.charAt(i)-'a';
            if(cur.children[ind]==null) return false;
            cur=cur.children[ind];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */