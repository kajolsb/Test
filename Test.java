import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;





public class Test {
	int i[] = {0};
	public static void main(String args[]) {
		/*String s = "aa";
		String t = "aabb";
		int[] numkjus = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		String[] words = {"cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"};
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(1);
		l1.next.next = new ListNode(3);
		l1.next.next.next = new ListNode(6);
		l1.next.next.next.next = new ListNode(4);
		l1.next.next.next.next.next = new ListNode(5);
		l1.next.next.next.next.next.next = new ListNode(6);
		ListNode l2 =removeElements(l1, 1);
		while(l2!=null) {
			System.out.println(l2.val);
			l2=l2.next;
		}
		int[] nums = {3,1,1,3};
		System.out.println(removeElement(nums,3));
		String[] strs = {"bc", "bca"};
		int d[] = {9};
		String a = "1010";
		String b = "1011";
		System.out.println(addBinary(a, b));
		//String ss = "a man, a plan, a canal: Panoma";
		System.out.println(fact(1808548329));*/
	      
	      
	      
	}
	
	/*static double fact(int n){
        double fact = 1;
		while(n>1) {
        	fact*=n;
        	n = n-1;
        }
		return fact;
    }
	
	
	public static  int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int i=0;
        int len = nums.length;
        while(i<len){
            Integer count = map.get(nums[i]);
            if(count==null){
                count = new Integer(0);
            }
            if(++count>(len/2))
                return nums[i];
            map.put(nums[i], count);
            i++;
        }
        return 0;
    }
	
public static String convertToTitle(int n) {
        n--;
		String title = "";
        char x = 'A';
        int d = n - 26;
        if(d<0) {
        	x+=n;
        	return Character.toString(x);
        }
        d = n/26;
        int r = n%26;
        title+= convertToTitle(d);
        x+=r;
        title+=x;
        
        return title;
        
    }
	
	
	public static int singleNumber(int[] nums) {
        List<Integer> list= new ArrayList<Integer>();
        int x = 0;
        for(int num : nums){
           x = x^num; 
        }
        
            return x;
    }
	
	public static boolean isPalindrome(String s) {
        int i=0, j=s.length()-1;
        while(i<j) {
            if(check(s.charAt(i))){
                if(check(s.charAt(j))){
                    if( Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)) )
                        return false;
                }else{
                     j--;
                    continue;
                } 
            }else{
                i++;
                continue;
            }
               i++;
               j--;
        }
        return true;
    }
	
	static boolean check(char ch) {
		if(Character.isLetter(ch) || Character.isDigit(ch))
			return true;
		return false;
	}
	
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ret = new ArrayList<List<Integer>>();
        List<Integer> list = null;
        for(int i=0;i<numRows;i++){
            if(list==null){
                list = new ArrayList<Integer>();
                list.add(1);
                
            }else{
                List<Integer> prevList = list;
                list = new ArrayList<Integer>();
                list.add(1);
                for(int k=0;k<prevList.size()-1;k++){
                    int sum = prevList.get(k) + prevList.get(k+1);
                    list.add(sum);                    
                }
                list.add(1);
            }
            ret.add(list);
            
        }
        return ret;
    }	
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m>0 && n>0 ){
            int i=0, j=0, count=0;
            int tot = m+n;
            int c1=m, c2=n;
            while(j<n && m<tot && count<c1){
                if(nums1[i] > nums2[j]){
                    shift(nums1,i,m);
                    m++;
                    nums1[i] = nums2[j];
                    j++;
                }
                count++;
                i++;
            }
            if(j<n){
                for(int k=j;k<n;k++)
                    nums1[i++]=nums2[k];
            }
            
        }
        if(m==0) {
        	for(int i:nums2)
        		nums1[m++] = i;
        }
        
        
    }
    
    static void shift(int[] nums, int from, int last){
        for(int i=last; i>from;i--){
            nums[i] = nums[i-1];
        }
    }
	
	public static void change_i(int i[]) 
	{
	      int j[] = {2};
	      i[0] = j[0];
	}
	
	
	public static String addBinary(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int difLen = len1-len2;
        if(difLen<0) {
        	for(int i=0;i<Math.abs(difLen);i++)
        		a = "0"+a;
        }else if(difLen>0) {
        	for(int i=0;i<difLen;i++)
        		b = "0"+b;
        }
        String sum="";
        boolean carry = false;
        for(int i=a.length()-1; i>=0 ; i--){
            int n1 = getVal(a.charAt(i));
            int n2 = getVal(b.charAt(i));
            int n3 = n1+n2;
            if(n3<=1 && !carry) {
            	sum = n3 + sum;
            	continue;
            }
             if(carry){
                 n3 = n3+1;
                 carry = false;
                }
            if(n3>1){
                carry = true;
                if(n3==2)
                    n3 = 0;
                else
                    n3 = 1;
                
            }
            sum = n3 + sum;
            
        }
        if(carry)
            sum = "1" + sum;
        return sum;
    }
    
    static int getVal(char x){
        if(x == '1')
            return 1;
        return 0;
    }
	
	
	 public static int[] plusOne(int[] digits) {
	        boolean carry = false;
	        int len = digits.length;
	        digits[len-1]++;
	        for(int i=len-1;i>=0;i--){
	            if(!carry && digits[i]<=9) break;
	            if(carry){
	                digits[i]++;
	                carry = false;
	            } if(digits[i]>9)
	                carry = true;
	            digits[i] = digits[i] %10;
	            
	        }
	        
	        if(carry){
	            int[] temp = new int[len+1];
	            for(int i=len-1;i>=0;i--){
	                temp[i+1] = digits[i];
	            }
	            temp[0] = 1;
	            digits = temp;
	        }
	        for(int i=0;i<digits.length;i++)
	        	System.out.println(digits[i]);
	        return digits;
	    }
	
	
	
	public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            String s1 = strs[i];
            if(s1.length()<prefix.length()){
                String temp = prefix;
                prefix = s1;
                s1 = temp;
            }
            if(!isPrefix(s1, prefix)){
                while(prefix.length()>0 && !isPrefix(s1, prefix)){
                    prefix = prefix.substring(0, prefix.length()-1);
                }
                if(prefix.length()==0)
                    return "";
            }
        }
        return prefix;
            
        }
    
	static boolean  isPrefix(String str, String pre){
        if(str.startsWith(pre))
            return true;
        return false;
    }
	
	
	public static boolean isPalindrome(int x) {
		if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
		int rn = 0;
        while(x>rn){
            rn = rn*10 + (x%10);
            x/=10;
        }
        
        if(x==rn || x== rn/10)
            return true;
        
        return false;
    }
	
	
	 public static  ListNode removeElements(ListNode head, int val) {
	        if(head==null) return null;
	        ListNode ret = new ListNode(0);
	        ret.next = head;
	        ListNode prev = ret;
	        while(head!=null){
	        	head=prev.next;
	            if(head!=null){
	                if(val==head.val){
	                    prev.next = head.next;
	                    continue;
	                }
	                prev = prev.next;
	                
	            }
	            
	        }
	        return ret.next;
	    }
	
	
	
	
	
	public static int removeDuplicates(int[] nums) {
	    if(nums.length==0) return 0;
	    int i=1;
	    int prev = nums[0];
	    int len = nums.length;
	    int newLen = len;
	    for(int j=1;j<len;j++){
	        if(prev == nums[i]){
	        	newLen = remove(nums,i,newLen);
	        }else{
	            prev = nums[i];
	            i++;
	        }
	    }
	    for(int c=0; c<newLen; c++)
	    	System.out.println(nums[c]);
	    return newLen;
	}

	static int  remove(int[] nums, int index, int len){
		
	    for(int i=index; i<len-1; i++){
	        nums[i] = nums[i+1];
	    }
	    return --len;
	}
	
	
	
	public static boolean canConstruct(String ransomNote, String magazine) {
		ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i< ransomNote.length(); i++){
        	System.out.println(list);
        	System.out.println(magazine.indexOf(ransomNote.charAt(i)));
            if(magazine.indexOf(ransomNote.charAt(i)) < 0 ||  list.contains(magazine.indexOf(ransomNote.charAt(i)))){
            	return false;
            }
            list.add(magazine.indexOf(ransomNote.charAt(i)));
        }
        return true;
    }
	
	
	
	
	
	static boolean isInserted(String os, String ns) {
		boolean isIns = false;
		if(ns.length() - os.length() ==1) {
			int newCount = 0;
			int oldCount = 0;
			boolean isAdd =false;
			while(oldCount!=os.length()) {
				if(ns.charAt(newCount) != os.charAt(oldCount)) {
					if(!isAdd) {
					newCount++;
					isAdd = true;
					continue;
					}else {
						return false;
					}
				}
				oldCount++;
				newCount++;
			}
			isIns = true;
		}
		return isIns;
	}
	
void isDeletd(String s1, String s2) {
		
	}

void isInREplaced(String s1, String s2) {
	
}

public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	ListNode head = null;
	ListNode prev = head;	
	while(l1!=null || l2!=null){
		if(l1!=null && l2!=null){
			ListNode temp ;
			if(l1.val < l2.val){
				temp = new ListNode(l1.val);
				l1 = l1.next;
			}else{
				temp = new ListNode(l2.val);
				l2 = l2.next;
			}
			if(head==null){
				head = temp;
				prev = head;
			}else{
				prev.next = temp;
				prev = prev.next;
			}
		}else if(l1!=null){
			prev = l1;
		}else if(l2!=null){
			prev = l2;
		}

	}
	return head;
}

public static String fractionToDecimal(int numerator, int denominator) {
	double den = denominator;
	double ans = numerator/((double)denominator);
	String answer = Double.toString(ans);
	String[] split = answer.split(".");
	if(split.length>0) {
		boolean isRecur = false;
		int len = split[1].length();
		char prev = split[1].charAt(len-1);
		for(int i=2;i<4;i++) {
			if(split[1].charAt(len-i) == prev) {
				isRecur = true;
			}else {
				isRecur = false;
				break;
			}
				
		}
		if(isRecur) {
			answer = split[0] + ".("+ prev + ")";
		}
	}else {
		answer = Integer.toString((int)ans);
	}
    return answer;
}
    */
}







/*class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}*/
