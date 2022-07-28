import java.io.File;import java.io.FileInputStream;import java.io.FileNotFoundException;import java.io.IOException;import java.io.InputStream;import java.io.PrintStream;import java.io.PrintWriter;import java.lang.annotation.Retention;import java.lang.annotation.RetentionPolicy;import java.lang.reflect.Array;import java.lang.reflect.Field;import java.lang.reflect.InvocationTargetException;import java.lang.reflect.Method;import java.security.AccessControlException;import java.util.ArrayDeque;import java.util.Arrays;import java.util.Collection;import java.util.Collections;import java.util.Comparator;import java.util.Deque;import java.util.List;import java.util.Map;import java.util.Objects;import java.util.Set;import java.util.TreeMap;import java.util.TreeSet;import java.util.function.Function;import java.util.function.Predicate;import java.util.stream.Collectors;import java.util.stream.IntStream;import java.util.stream.LongStream;import java.util.stream.Stream;public class _p001097B {static public void main(final String[] args) throws IOException{p001097B._main(args);}static private class p001097B extends Solver{public p001097B(){singleTest=true;}static public class Node extends TreeNode{static int id_gen=0;public int id=++id_gen;public int sum=0;}@Override public void solve()throws IOException{int n=sc.nextInt();sc.nextLine();int[]a=new int[n];for(int $i0=0;$i0<n;$i0++){a[$i0]=sc.nextInt();sc.nextLine();}Tree<Node>tree=new Tree<>();tree.build(new Node(),(x,y)->x.id-y.id,(p,l)->{Node node=new Node();node.sum=(p.sum+a[l-1])%360;if(l<n || node.sum==0){tree.addChildNode(node);}node=new Node();node.sum=(p.sum-a[l-1])%360;if(l<n || node.sum==0){tree.addChildNode(node);}},v->v.level()==n);pw.println(Datas.yesNo(!tree.leaves().isEmpty()));}static public void _main(String[]args)throws IOException{new p001097B().run();}}static private class Datas{static class Pair<K,V>{private K k;private V v;public Pair(final K t,final V u){this.k=t;this.v=u;}public K getKey(){return k;}public V getValue(){return v;}}final static String SPACE=" ";public static TreeMap<Integer,Integer>mapc(final int[]a){return IntStream.range(0,a.length).collect(()->new TreeMap<Integer,Integer>(),(res,i)->{res.put(a[i],res.getOrDefault(a[i],0)+1);},Map::putAll);}public static TreeMap<Long,Integer>mapc(final long[]a){return IntStream.range(0,a.length).collect(()->new TreeMap<Long,Integer>(),(res,i)->{res.put(a[i],res.getOrDefault(a[i],0)+1);},Map::putAll);}public static<T>TreeMap<T,Integer>mapc(final T[]a,Comparator<T>cmp){return IntStream.range(0,a.length).collect(cmp!=null?()->new TreeMap<T,Integer>(cmp):()->new TreeMap<T,Integer>(),(res,i)->{res.put(a[i],res.getOrDefault(a[i],0)+1);},Map::putAll);}public static<T>TreeMap<T,Integer>mapc(final T[]a){return mapc(a,null);}public static TreeMap<Integer,Integer>mapc(final IntStream a){return a.collect(()->new TreeMap<Integer,Integer>(),(res,v)->{res.put(v,res.getOrDefault(v,0)+1);},Map::putAll);}public static TreeMap<Long,Integer>mapc(final LongStream a){return a.collect(()->new TreeMap<Long,Integer>(),(res,v)->{res.put(v,res.getOrDefault(v,0)+1);},Map::putAll);}public static<T>TreeMap<T,Integer>mapc(final Stream<T>a,Comparator<T>cmp){return a.collect(cmp!=null?()->new TreeMap<T,Integer>(cmp):()->new TreeMap<T,Integer>(),(res,v)->{res.put(v,res.getOrDefault(v,0)+1);},Map::putAll);}public static<T>TreeMap<T,Integer>mapc(final Stream<T>a){return mapc(a,null);}public static<T>TreeMap<T,Integer>mapc(final Collection<T>a,Comparator<T>cmp){return mapc(a.stream(),cmp);}public static<T>TreeMap<T,Integer>mapc(final Collection<T>a){return mapc(a.stream());}public static TreeMap<Integer,List<Integer>>mapi(final int[]a){return IntStream.range(0,a.length).collect(()->new TreeMap<Integer,List<Integer>>(),(res,i)->{if(!res.containsKey(a[i])){res.put(a[i],Stream.of(i).collect(Collectors.toList()));}else{res.get(a[i]).add(i);}},Map::putAll);}public static TreeMap<Long,List<Integer>>mapi(final long[]a){return IntStream.range(0,a.length).collect(()->new TreeMap<Long,List<Integer>>(),(res,i)->{if(!res.containsKey(a[i])){res.put(a[i],Stream.of(i).collect(Collectors.toList()));}else{res.get(a[i]).add(i);}},Map::putAll);}public static<T>TreeMap<T,List<Integer>>mapi(final T[]a,Comparator<T>cmp){return IntStream.range(0,a.length).collect(cmp!=null?()->new TreeMap<T,List<Integer>>(cmp):()->new TreeMap<T,List<Integer>>(),(res,i)->{if(!res.containsKey(a[i])){res.put(a[i],Stream.of(i).collect(Collectors.toList()));}else{res.get(a[i]).add(i);}},Map::putAll);}public static<T>TreeMap<T,List<Integer>>mapi(final T[]a){return mapi(a,null);}public static TreeMap<Integer,List<Integer>>mapi(final IntStream a){int[]i=new int[]{0};return a.collect(()->new TreeMap<Integer,List<Integer>>(),(res,v)->{if(!res.containsKey(v)){res.put(v,Stream.of(i[0]).collect(Collectors.toList()));}else{res.get(v).add(i[0]);}i[0]++;},Map::putAll);}public static TreeMap<Long,List<Integer>>mapi(final LongStream a){int[]i=new int[]{0};return a.collect(()->new TreeMap<Long,List<Integer>>(),(res,v)->{if(!res.containsKey(v)){res.put(v,Stream.of(i[0]).collect(Collectors.toList()));}else{res.get(v).add(i[0]);}i[0]++;},Map::putAll);}public static<T>TreeMap<T,List<Integer>>mapi(final Stream<T>a,Comparator<T>cmp){int[]i=new int[]{0};return a.collect(cmp!=null?()->new TreeMap<T,List<Integer>>(cmp):()->new TreeMap<T,List<Integer>>(),(res,v)->{if(!res.containsKey(v)){res.put(v,Stream.of(i[0]).collect(Collectors.toList()));}else{res.get(v).add(i[0]);}i[0]++;},Map::putAll);}public static<T>TreeMap<T,List<Integer>>mapi(final Stream<T>a){return mapi(a,null);}public static<T>TreeMap<T,List<Integer>>mapi(final Collection<T>a,Comparator<T>cmp){return mapi(a.stream(),cmp);}public static<T>TreeMap<T,List<Integer>>mapi(final Collection<T>a){return mapi(a.stream());}public static List<int[]>listi(final int[]a){return IntStream.range(0,a.length).mapToObj(i->new int[]{a[i],i}).collect(Collectors.toList());}public static List<long[]>listi(final long[]a){return IntStream.range(0,a.length).mapToObj(i->new long[]{a[i],i}).collect(Collectors.toList());}public static<T>List<Pair<T,Integer>>listi(final T[]a){return IntStream.range(0,a.length).mapToObj(i->new Pair<T,Integer>(a[i],i)).collect(Collectors.toList());}public static List<int[]>listi(final IntStream a){int[]i=new int[]{0};return a.mapToObj(v->new int[]{v,i[0]++}).collect(Collectors.toList());}public static List<long[]>listi(final LongStream a){int[]i=new int[]{0};return a.mapToObj(v->new long[]{v,i[0]++}).collect(Collectors.toList());}public static<T>List<Pair<T,Integer>>listi(final Stream<T>a){int[]i=new int[]{0};return a.map(v->new Pair<T,Integer>(v,i[0]++)).collect(Collectors.toList());}public static<T>List<Pair<T,Integer>>listi(final Collection<T>a){int[]i=new int[]{0};return a.stream().map(v->new Pair<T,Integer>(v,i[0]++)).collect(Collectors.toList());}public static String join(final int[]a){return Arrays.stream(a).mapToObj(Integer::toString).collect(Collectors.joining(SPACE));}public static String join(final long[]a){return Arrays.stream(a).mapToObj(Long::toString).collect(Collectors.joining(SPACE));}public static<T>String join(final T[]a){return Arrays.stream(a).map(v->Objects.toString(v)).collect(Collectors.joining(SPACE));}public static<T>String join(final T[]a,final Function<T,String>toString){return Arrays.stream(a).map(v->toString.apply(v)).collect(Collectors.joining(SPACE));}public static<T>String join(final Collection<T>a){return a.stream().map(v->Objects.toString(v)).collect(Collectors.joining(SPACE));}public static<T>String join(final Collection<T>a,final Function<T,String>toString){return a.stream().map(v->toString.apply(v)).collect(Collectors.joining(SPACE));}public static<T>String join(final Stream<T>a){return a.map(v->Objects.toString(v)).collect(Collectors.joining(SPACE));}public static<T>String join(final Stream<T>a,final Function<T,String>toString){return a.map(v->toString.apply(v)).collect(Collectors.joining(SPACE));}public static<T>String join(final IntStream a){return a.mapToObj(Integer::toString).collect(Collectors.joining(SPACE));}public static<T>String join(final LongStream a){return a.mapToObj(Long::toString).collect(Collectors.joining(SPACE));}public static List<Integer>list(final int[]a){return Arrays.stream(a).mapToObj(Integer::valueOf).collect(Collectors.toList());}public static List<Integer>list(final IntStream a){return a.mapToObj(Integer::valueOf).collect(Collectors.toList());}public static List<Long>list(final long[]a){return Arrays.stream(a).mapToObj(Long::valueOf).collect(Collectors.toList());}public static List<Long>list(final LongStream a){return a.mapToObj(Long::valueOf).collect(Collectors.toList());}public static<T>List<T>list(final Stream<T>a){return a.collect(Collectors.toList());}public static<T>List<T>list(final Collection<T>a){return a.stream().collect(Collectors.toList());}public static<T>List<T>list(final T[]a){return Arrays.stream(a).collect(Collectors.toList());}public static String yesNo(final boolean res){return res?"YES":"NO";}public static String dump(Object obj){String res="";if(obj!=null){Class cl=obj.getClass();String cls=cl.getName();if(cls.startsWith("[")){res+="[";for(int i=0;;i++){try{Object o=Array.get(obj,i);String s=dump(o);if(i>0){res+=", ";}res+=s;}catch(ArrayIndexOutOfBoundsException ex){break;}}res+="]";}else if(Collection.class.isAssignableFrom(cl)){@SuppressWarnings("unchecked")final Object s=((Collection)obj).stream().map(v->dump(v)).collect(Collectors.joining(", ","[","]"));res+=s.toString();}else if(Map.class.isAssignableFrom(cl)){@SuppressWarnings("unchecked")final Object s=((Map)obj).entrySet().stream().map(v->dump(v)).collect(Collectors.joining(", ","{","}"));res+=s.toString();}else if(Character.class.isInstance(obj)|| Integer.class.isInstance(obj)|| Long.class.isInstance(obj)|| Float.class.isInstance(obj)|| Double.class.isInstance(obj)|| String.class.isInstance(obj)){res+=Objects.toString(obj);}else if(Map.Entry.class.isInstance(obj)){res+=dump(((Map.Entry)obj).getKey())+"="+dump(((Map.Entry)obj).getValue());}else if(Stream.class.isInstance(obj)){@SuppressWarnings("unchecked")final Object s=((Stream)obj).map(v->dump(v)).collect(Collectors.joining(", ","[","]"));res+=s.toString();}else{res+=Stream.concat(Arrays.stream(obj.getClass().getFields()).map(v->{String name=v.getName();String val;try{Object o=v.get(obj);if(o!=null && v.isAnnotationPresent(Dump.class)){Dump an=v.getAnnotation(Dump.class);Class ocl=o.getClass();val="{";for(String fn:an.fields()){try{Field f=ocl.getField(fn);val+=fn+"="+dump(f.get(o))+", ";}catch(NoSuchFieldException nsfex){try{@SuppressWarnings("unchecked")final Method m=ocl.getMethod(fn);val+=fn+"="+dump(m.invoke(o))+", ";}catch(NoSuchMethodException | IllegalArgumentException | InvocationTargetException nsmex){}}}if(val.endsWith(", ")){val=val.substring(0,val.length()-2);}val+="}";}else{val=dump(o);}}catch(IllegalAccessException ex){val="N/A";}return name+"="+val;}),Arrays.stream(obj.getClass().getMethods()).filter(m->m.isAnnotationPresent(Getter.class)).map(m->{String name=m.getName();String val;try{Object o=m.invoke(obj);if(o!=null && m.isAnnotationPresent(Dump.class)){Dump an=m.getAnnotation(Dump.class);Class ocl=o.getClass();val="{";for(String fn:an.fields()){try{Field f=ocl.getField(fn);val+=fn+"="+dump(f.get(o))+", ";}catch(NoSuchFieldException nsfex){try{@SuppressWarnings("unchecked")final Method m1=ocl.getMethod(fn);val+=fn+"="+dump(m1.invoke(o))+", ";}catch(NoSuchMethodException | IllegalArgumentException | InvocationTargetException nsmex){}}}if(val.endsWith(", ")){val=val.substring(0,val.length()-2);}val+="}";}else{val=dump(o);}}catch(IllegalAccessException | InvocationTargetException ex){val="N/A";}return name+"="+val;})).collect(Collectors.joining(", ","{"+obj.getClass().getName()+": ","}"));}}if(res.length()==0){res="<null>";}return res;}}@Retention(RetentionPolicy.RUNTIME)public @interface Dump{String[]fields();}@Retention(RetentionPolicy.RUNTIME)public @interface Getter{}static private class Tree<T extends TreeNode>{public static interface ChildrenBuilder<T>{void build(final T parent,final int level);}protected Comparator<T>cmp;protected Comparator<TreeNode>wcmp;private TreeSet<T>leaves;private T root=null;private T current_parent=null;private Predicate<T>is_leaf;final private Deque<T>queue=new ArrayDeque<>();public void build(final T root,final Comparator<T>cmp,final ChildrenBuilder<T>children_builder,final Predicate<T>is_leaf){this.cmp=cmp;@SuppressWarnings("unchecked")final Comparator<TreeNode>wcmp1=(x,y)->cmp.compare((T)x,(T)y);wcmp=wcmp1;this.is_leaf=is_leaf;leaves=new TreeSet<>(cmp);queue.clear();current_parent=null;this.root=root;addChildNode(root);while(!queue.isEmpty()){current_parent=queue.poll();children_builder.build(current_parent,current_parent.level+1);}}public void addChildNode(final T child){child.parent=current_parent;if(current_parent!=null){if(current_parent.children==null){current_parent.children=new TreeSet<TreeNode>(wcmp);}current_parent.children.add(child);child.level=current_parent.level+1;}if(is_leaf.test(child)){leaves.add(child);}else{queue.offer(child);}}public T root(){return root;}public Set<T>leaves(){return Collections.unmodifiableSet(leaves);}}static private class TreeNode{TreeNode parent=null;TreeSet<TreeNode>children;int level=0;static private TreeSet<TreeNode>empty=new TreeSet<>();public TreeNode parent(){return parent;}public int level(){return level;}public Set<TreeNode>children(){return Collections.unmodifiableSet(children!=null?children:empty);}}static private class MyScanner{private StringBuilder cache=new StringBuilder();int cache_pos=0;private int first_linebreak=-1;private int second_linebreak=-1;private StringBuilder sb=new StringBuilder();private InputStream is=null;public MyScanner(final InputStream is){this.is=is;}private String charToString(final int c){return String.format("'%s'",c=='\n'?"\\n":(c=='\r'?"\\r":String.valueOf((char)c)));}public int get(){int res=-1;if(cache_pos<cache.length()){res=cache.charAt(cache_pos);cache_pos++;if(cache_pos==cache.length()){cache.delete(0,cache_pos);cache_pos=0;}}else{try{res=is.read();}catch(IOException ex){throw new RuntimeException(ex);}}return res;}private void unget(final int c){if(cache_pos==0){cache.insert(0,(char)c);}else{cache_pos--;}}public String nextLine(){sb.delete(0,sb.length());int c;boolean done=false;boolean end=false;while((c=get())!=-1){if(check_linebreak(c)){done=true;if(c==first_linebreak){if(!end){end=true;}else{cache.append((char)c);break;}}else if(second_linebreak!=-1 && c==second_linebreak){break;}}if(end && c!=first_linebreak && c!=second_linebreak){cache.append((char)c);break;}if(!done){sb.append((char)c);}}return sb.toString();}private boolean check_linebreak(int c){if(c=='\n'|| c=='\r'){if(first_linebreak==-1){first_linebreak=c;}else if(c!=first_linebreak && second_linebreak==-1){second_linebreak=c;}return true;}return false;}public int nextInt(){return Integer.parseInt(next());}public long nextLong(){return Long.parseLong(next());}public boolean hasNext(){boolean res=false;int c;while((c=get())!=-1){if(!check_linebreak(c)&& c!=' '&& c!='\t'){res=true;unget(c);break;}}return res;}public String next(){sb.delete(0,sb.length());boolean started=false;int c;while((c=get())!=-1){if(check_linebreak(c)|| c==' '|| c=='\t'){if(started){unget(c);break;}}else{started=true;sb.append((char)c);}}return sb.toString();}public int nextChar(){return get();}public boolean eof(){int c=get();boolean res=false;if(c!=-1){unget(c);}else{res=true;}return res;}public double nextDouble(){return Double.parseDouble(next());}}static private abstract class Solver{protected String nameIn=null;protected String nameOut=null;protected boolean singleTest=false;protected boolean preprocessDebug=false;protected boolean doNotPreprocess=false;protected PrintStream debugPrintStream=null;protected MyScanner sc=null;protected PrintWriter pw=null;private int current_test=0;private int count_tests=0;protected int currentTest(){return current_test;}protected int countTests(){return count_tests;}private void process()throws IOException{if(!singleTest){count_tests=sc.nextInt();sc.nextLine();for(current_test=1;current_test<=count_tests;current_test++){solve();pw.flush();}}else{count_tests=1;current_test=1;solve();pw.flush();}}abstract protected void solve()throws IOException;protected void run()throws IOException{boolean done=false;try{if(nameIn!=null && new File(nameIn).exists()){try(FileInputStream fis=new FileInputStream(nameIn);PrintWriter pw0=select_output();){done=true;sc=new MyScanner(fis);pw=pw0;process();}}}catch(IOException ex){}catch(AccessControlException ex){}if(!done){try(PrintWriter pw0=select_output();){sc=new MyScanner(System.in);pw=pw0;process();}}}private PrintWriter select_output()throws FileNotFoundException{if(nameOut!=null){return new PrintWriter(nameOut);}return new PrintWriter(System.out);}}}
