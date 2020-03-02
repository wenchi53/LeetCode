/************************
        Hash Map
************************/
Map<Integer, Integer> map = HashMap<>();
Map.Entry<Integer, Integer>
Map.Entry<Integer, Integer> entry : map.entrySet()
Hash_Map.containsKey(key)
map.put(key, value);
map.get(key);
preSum.getOrDefault(sum, 0)
return new ArrayList<List<String>>(map.values());

HashSet<String> set = new HashSet<>(wordList);
set.add();
set.contains(beginWord)
set.remove(beginWord)
set.size()

/************************
          Array
************************/

int[] nums;

//Create an array
new int[] {i, j};

int[] ret = new int[2];
ret[0] = i;
ret[1] = j;

//Length of array
nums.length;

//Sort an array
Arrays.sort(num);
Arrays.sort(people, new Comparator<int[]>() {
    public int compare(int[] a, int[] b) {
        if (b[0] == a[0]) return a[1] - b[1];
        	return b[0] - a[0];
    }
});

/************************
        Stack
************************/

Stack<Integer> countStack = new Stack<>();


/************************
        List
************************/
List<Integer> res = new ArrayList<>();
res.add();
res.add(new ArrayList<>(list));
result.add(person[1],new int[]{person[0],person[1]});
list.remove(list.size() - 1);
Arrays.asList(nums[i], nums[l], nums[h]);



Queue<String> queue = new LinkedList<>();
queue.offer(beginWord);
String word = queue.poll();

res.stream().mapToInt(i -> i).toArray()

/************************
    Double Linked List
************************/
class Node {
    int key;
    int value;
    Node next;
    Node pre;
    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

/************************
        Trie
************************/
class TrieNode {

    TrieNode[] children;
    boolean isWord;
    String word;

    public TrieNode() {
        children = new TrieNode[26];
        isWord = false;
        //word is optional
        word = "";
    }
}

/************************
        Graph
************************/
class GraphNode {
    String den;
    double val;
    GraphNode(String den, double val) {
        this.den = den;
        this.val = val;
    }
}

/************************
        String
************************/
s.length();
s.charAt(0);
s.substring(from, from + min)
s.equals(endWord)
s.trim()
s.lastIndexOf(" ")

Integer.parseInt(str[0])

email.split("@")
parts[0].split("\\+")
local[0].replace(".", "")

String temp = String(wordUnit);

char[] ca = s.toCharArray();
Character.isDigit(s.charAt(idx));
String keyStr = String.valueOf(ca);

public boolean startsWith(String prefix, int toffset)
public boolean startsWith(String prefix)

StringBuilder sb = new StringBuilder();
sb.append(sum%2);
sb.reverse();
sb.toString();

/************************
    Priority Queue
************************/
PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
queue.add(list);
cur.next = queue.poll();
queue.isEmpty()


/************************
         Deque
************************/
//              First Element (Head)                     Last Element (Tail)
//       Throws exception       Special value     Throws exception    Special value
Insert    addFirst(e)            offerFirst(e)     addLast(e)          offerLast(e)
Remove    removeFirst()          pollFirst()       removeLast()        pollLast()
Examine   getFirst()             peekFirst()       getLast()           peekLast()

//https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html

/************************
        Math
************************/

long abs = Math.abs((long)n);

/************************
        Util
************************/
//print
System.out.println();






