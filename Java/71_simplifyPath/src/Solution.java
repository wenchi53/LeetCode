import java.util.*;

public class Solution {
	
	public static String simplifyPath(String path) {
		Deque<String> stack = new LinkedList<>();
		Set<String> skip = new HashSet<>(Arrays.asList("",".",".."));
		for (String dir : path.split("/")) {
			if (dir.equals("..") && !stack.isEmpty()) stack.pop();
			else if (!skip.contains(dir)) stack.push(dir);
		}
		String result = "";
		for (String s : stack) result = "/" + s + result;
		return result.isEmpty()? "/" : result;
	}
    
    public static void main(String[] args) {
    	System.out.println(simplifyPath("/a/./b/../../c/"));
    }
    
}
