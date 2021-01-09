### HashSet

实现了 Set 接口

基于HashMap 实现，不允许重复元素。

允许有 null

无序的集合

#### 使用

- 新建

  ```java
  import java.util.HashSet;
  HashSet<String> A = new HashSet<String>();
  ```

- 添加

  ```java
  A.add("Wang");
  A.add("Chen");
  A.add("Wang");//不会重复添加
  ```

- 删除

  ```java
  A.remove("Chen");
  ```

- 清除

  ```java
  A.clear();
  ```

- 计算大小

  ```java
  A.size()
  ```

- 迭代

  ```java
  for(String s:A){
  	System.out.println(s);
  }
  ```

  

