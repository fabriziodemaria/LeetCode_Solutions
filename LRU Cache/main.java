class LRUCache {
        class Node {
        int key;
        int value;
        Node next;
        Node prev;
                public Node(int key, int value)
        {
            this.key=key; 
            this.value=value;
            next=null;
            prev=null;
        }
    }
        //HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();
        HashMap<Integer,Node> nodemap = new HashMap<Integer,Node>();
    Node in;
    Node out;
    int nelem;
    int capacity;
        public LRUCache(int capacity) {
        this.capacity=capacity;
        nelem=0;
    }
        //these methods should be synchronized
    public int get(int key) {
        if(nodemap.containsKey(key)){
            changePosition(key);
            return nodemap.get(key).value;
        }
        else {
            return -1;
        }
            }
        public void set(int key, int value) {
                //case of simple update of value
        if(nodemap.containsKey(key)){
            changePosition(key);
            nodemap.get(key).value=value;
            return;
        }
                //case we need a new node
        if(nelem==capacity){
            removeLR();
            nelem--;
        }
        insertNode(key,value);
        nelem++;
    }
        private void changePosition(int key){
        Node n = nodemap.get(key);
        if(n==in || nelem==1){
            return;
        }
        //bring elem in i to nelem-1 and move the rest
        if(n.prev!=null)
            n.prev.next = n.next;
        if(n.next!=null){
            n.next.prev = n.prev;
        } else {
            out=n.prev;
        }
        n.next=in;
        n.prev=null;
        in.prev=n;
        in = n;
    }
        private void insertNode(int key, int value){
        Node n = new Node(key,value);
        nodemap.put(key,n);
                if(in==null && out==null){
            out=n;
            in=n;
            return;
        }
                n.next = in;
        n.next.prev = n;
        in = n;
            }
        private void removeLR(){
        nodemap.remove(out.key);
        if(out.prev!=null)
            out.prev.next = null;
        out = out.prev;
    }
}
