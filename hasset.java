import java.util.*;
class hasset{
public static void main(String []args){
HashSet<String> s=new HashSet<>();
s.add("ravi");
s.add("vijay");
s.add("sonu");
s.add("ravi");
Iterator<String> it=s.iterator();
while(it.hasNext())
{
System.out.println(it.next());
}
}
}